package java.util;

import java.io.Serializable;

/**
 * @author yang.jin
 * date: 01/03/2018
 * desc:
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>,RandomAccess,Cloneable,Serializable{

    private int size;
    protected transient int modCount = 0;
    transient Object[] elementData;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public boolean add(E e) {
        modCount++;
        add(e,elementData,size);
        return true;
    }

    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length) {
            elementData = grow();
        }
        elementData[s] = e;
        size = s + 1;
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, newCapacity(minCapacity));
    }

    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity <= minCapacity) {
            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
                return Math.max(DEFAULT_CAPACITY, minCapacity);
            }
            if (minCapacity < 0) {
                throw new OutOfMemoryError();
            }
            return minCapacity;
        }
        if (newCapacity <= MAX_ARRAY_SIZE) {
            return newCapacity;
        } else {
            return hugeCapacity(minCapacity);
        }
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > MAX_ARRAY_SIZE) {
            return Integer.MAX_VALUE;
        } else {
            return MAX_ARRAY_SIZE;
        }
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }

    public E elementData(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public E remove(int idx) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIdx, int toIdx) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public int hashcode() {
        return 0;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private static class SubList<E> extends AbstractList<E> implements RandomAccess {

        private final ArrayList<E> root;
        private final SubList<E> parent;
        private final int offSet;
        private int size;

        public SubList(ArrayList<E> root, int fromIdx, int toIdx) {
            this.root = root;
            this.parent = null;
            this.offSet = fromIdx;
            this.size = toIdx - offSet;
            this.modCount = root.modCount;
        }

        private void checkForComodification() {
            if (root.modCount != modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public E get(int index) {
            return null;
        }

        @Override
        public E set(int index, E e) {
            return null;
        }

        @Override
        public E remove(int idx) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIdx, int toIdx) {
            return null;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public int hashcode() {
            return 0;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }
    }
}
