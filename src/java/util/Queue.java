package java.util;

public interface Queue<E> extends Collection<E> {

    boolean add(E e);//如果队列满了，抛异常

    boolean offer(E e);//如果队列满了，返回false

    E remove();//如果队列为空，抛异常

    E poll();//如果队列为空，返回null

    E element();//如果队列为空，抛异常

    E peek();//如果队列为空，返回null

}
