package java.util;

import java.lang.reflect.Array;

public abstract class AbstractCollection<E> implements Collection<E> {

    protected AbstractCollection() {

    }

    //成员变量
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    @Override
    public abstract Iterator<E> iterator();

    public abstract int size();

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Object o) {
        Iterator<E> it = iterator();
        if (o == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        //估计数组的大小
        Object[] r = new Object[size()];
        Iterator<E> it = iterator();
        for (int i=0;i<r.length;i++) {
            if (!it.hasNext()) {
                return Arrays.copyOf(r, i);
            }
            r[i] = it.next();
        }
        return it.hasNext() ? finishToArray(r, it) : r;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        //估计数组的大小
        int size = size();
        T[] r = null;
        if (a.length >= size) {
            r = a;
        } else {
            r = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
        }
        Iterator<E> it = iterator();
        for (int i = 0; i < r.length; i++) {
            if (!it.hasNext()) { //比设想的元素数要小
                if (a == r) {
                    r[i] = null; //用null终止
                } else if (a.length < i) {
                    return Arrays.copyOf(r, i);
                } else {
                    System.arraycopy(r,0,a,0,i);
                    if (a.length > i) {
                        a[i] = null;
                    }
                }
                return a;
            } else {
                r[i] = (T) it.next();
            }
        }
        //比设想的元素数要多
        return it.hasNext() ? finishToArray(r, it) : r;
    }

    private static <T> T[] finishToArray(T[] r,Iterator<?> it) {
        int i = r.length;
        while (it.hasNext()) {
            int cap = r.length;
            if (i == cap) {
                int newCap = cap + (cap >> 1) + 1;
                //可能溢出
                if (newCap - MAX_ARRAY_SIZE > 0) {
                    newCap = hugeCapcity(cap + 1);
                }
                r = Arrays.copyOf(r, newCap);
            }
            r[i++] = (T) it.next();
        }
        //如果溢出截取
        if (i == r.length) {
            return r;
        } else {
            return Arrays.copyOf(r, i);
        }
    }

    private static int hugeCapcity(int minCapcity) {
        if (minCapcity < 0) {
            throw new OutOfMemoryError("Required array size too large");
        }
        if (minCapcity > MAX_ARRAY_SIZE) {
            return Integer.MAX_VALUE;
        } else {
            return MAX_ARRAY_SIZE;
        }
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object o) {
        Iterator<E> it = iterator();
        if (o == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * ————————————————————————————————————————————————————————————————————————————————————————————————
     *                                             批量操作
     * ————————————————————————————————————————————————————————————————————————————————————————————————
     */

    public boolean contailsAll(Collection<?> collection) {
        for (Object e : collection) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        boolean modified = false;
        for (E e : collection) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }

    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<?> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    public void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            it.next(); // ????
            it.remove();
        }
    }

    public String toString() {
        Iterator<E> it = iterator();
        if (!it.hasNext()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext()) {
                return sb.append(']').toString();
            }
            sb.append(',').append(' ');
        }
    }
}
