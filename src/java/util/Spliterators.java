package java.util;

import java.util.function.Consumer;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public final class Spliterators {

    public static <T> Spliterator<T> spliterator(Collection<? extends T> c, int characteristics) {
        return new IteratorSpliterator<>(Objects.requireNonNull(c), characteristics);
    }

    static class IteratorSpliterator<T> implements Spliterator<T> {

        private final Collection<? extends T> collection;
        private Iterator<? extends T> it;
        private final int charcteristics;

        public IteratorSpliterator(Collection<? extends T> collection,int characteristics) {
            this.collection = collection;
            this.it = null;
            this.charcteristics = characteristics;
        }

        @Override
        public boolean tryAdvance(Consumer<? super T> action) {
            return false;
        }

        @Override
        public Spliterator<T> trySplit() {
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
