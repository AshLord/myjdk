package java.util;

public abstract class AbstractCollection<E> implements Collection<E> {

    protected AbstractCollection() {

    }

    public abstract Iterator<E> iterator();

    public abstract int size();

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Object o) {
        for (E e : this) {
            if (o.equals(e)) {
                return true;
            }
        }
        return false;
    }
}
