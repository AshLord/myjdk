package java.util;

import java.util.function.Consumer;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public interface Spliterator<T> {

    //field
    public static final int ORDERED = 0x00000010;

    boolean tryAdvance(Consumer<? super T> action);

    Spliterator<T> trySplit();

    long estimateSize();

    int characteristics();

    public interface OfPrimitive<T, T_CONS, T_SPLITR extends Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> extends Spliterator<T> {
    }

}
