package java.util;

import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Collection<E> extends Iterable<E>{

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    @Override
    Iterator<E> iterator();

    Object[] toArray();

    <T> T[] toArray(T[] a);

    boolean add(E e);

    boolean remove(Object o);

    boolean containsAll(Collection<?> collection);

    boolean addAll(Collection<? extends E> c);

    boolean removeAll(Collection<?> c);

    boolean retainAll(Collection<?> c);

    void clear();

    boolean equals(Object o);

    int hashcode();

    default boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNotNull(filter);
        boolean removed = false;
        final Iterator<E> each = iterator();
        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
        }
        return removed;
    }

    @Override
    default Spliterator<E> spliterator() {
        return null;
    }

    default Stream<E> stream() {
        return null;
    }

    default Stream<E> parallelStream() {
        return null;
    }
}
