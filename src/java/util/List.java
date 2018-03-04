package java.util;

import java.util.function.UnaryOperator;

/**
 * @author yang.jin
 * date: 03/03/2018
 * desc:
 */
public interface List<E> extends Collection<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<E> iterator();

    Object[] toArray();

    <T> T[] toArray(T[] a);

    boolean add(E e);

    boolean remove(Object o);

    boolean containsAll(Collection<?> c);

    boolean addAll(Collection<? extends E> c);

    boolean addAll(int index, Collection<? extends E> c);

    boolean removeAll(Collection<?> c);

    boolean retainAll(Collection<?> c);

    default void replaceAll(UnaryOperator<E> operator) {
        Objects.requireNonNull(operator);
        final ListIterator<E> li = this.listIterator();
        while (li.hasNext()) {
            li.set(operator.apply(li.next()));
        }
    }

    default void sort(Comparator<? super E> c) {
        Object[] a = toArray();
        Arrays.sort(a,(Comparator)c);
        ListIterator<E> i = listIterator();
        for (Object e : a) {
            i.next();
            i.set((E) e);
        }
    }

    void clear();

    boolean equals(Object o);

    int hashcode();

    E get(int index);

    E set(int index, E e);

    void add(int index, E e);

    E remove(int idx);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    ListIterator<E> listIterator();

    ListIterator<E> listIterator(int index);

    List<E> subList(int fromIdx, int toIdx);

    @Override
    default Spliterator<E> spliterator() {
        if (this instanceof RandomAccess) {
            return new AbstractList.RandomAccessSpliterator<>(this);
        } else {
            return Spliterators.spliterator(this, Spliterator.ORDERED);
        }
    }

    static <E> List<E> of() {
        return ImmutableCollections.List0.instance();
    }

    static <E> List<E> of(E e) {
        return new ImmutableCollections.List1<>(e);
    }

    static <E> List<E> of(E... es) {
        return null;
    }
}
