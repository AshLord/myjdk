package java.util;

public interface Deque<E> extends Queue<E> {

    void addFirst(E e);

    void addLast(E e);

    void offerFirst(E e);

    void offerLast(E e);

    E removeFirst();

    E removeLast();

    E pollFirst();

    E pollLast();

    E getFirst();

    E getLast();

    E peekFirst();

    E peekLast();

    boolean removeFirstOccurence(Object o);

    boolean removeLastOccurence(Object o);

    // *** Queue methods ***

    boolean add(E e);

    boolean offer(E e);

    E remove();

    E poll();

    E element();

    E peek();

    boolean addAll(Collection<? extends E> c);

    // *** Stack methods ***

    void push();

    E pop();

    // *** Collection methods ***

    boolean remove(Object o);

    boolean contains(Object o);

    int size();

    Iterator<E> iterator();

    Iterator<E> descendingIterator();

}
