package java.util;

import java.util.function.Consumer;

/**
 * @author yang.jin
 * date: 01/03/2018
 * desc:
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>{

    protected AbstractList() {

    }

    protected transient int modCount = 0;

    public boolean add(E e) {
        add(size(), e);
        return true;
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    public abstract E get(int index);

    static final class RandomAccessSpliterator<E> implements Spliterator<E> {

        //mv
        private final List<E> list;
        private int index;
        private int fence;
        private final AbstractList<E> alist;
        private int expectedModCount;

        RandomAccessSpliterator(List<E> list) {
            assert list instanceof RandomAccess;
            this.list = list;
            this.index = 0;
            this.fence = -1;
            this.alist = list instanceof AbstractList ? (AbstractList<E>) list : null;
            this.expectedModCount = alist != null ? alist.modCount : 0;
        }

        @Override
        public boolean tryAdvance(Consumer<? super E> action) {
            return false;
        }

        @Override
        public Spliterator<E> trySplit() {
            return null;
        }

        @Override
        public long estimateSize() {
            return 0;
        }

        @Override
        public int characteristics() {
            return 0;
        }
    }


}
