package java.util;

/**
 * @author yang.jin
 * date: 01/03/2018
 * desc:
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>{

    protected AbstractList() {

    }

    public boolean add(E e) {
        add(size(), e);
        return true;
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    public abstract E get(int index);




}
