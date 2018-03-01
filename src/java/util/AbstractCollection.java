package java.util;

import java.lang.reflect.Array;

public abstract class AbstractCollection<E> implements Collection<E> {

    protected AbstractCollection() {

    }

    //成员变量
    private static final int MAX_ARRAY_SIZE = Integer.M

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
                if (newCap - )
            }
        }
        return null;
    }
}
