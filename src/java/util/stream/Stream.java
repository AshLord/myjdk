package java.util.stream;

import java.util.function.Predicate;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public interface Stream<T> extends BaseStream<T,Stream<T>> {

    Stream<T> filter(Predicate<? super T> predicate);

    //todo
}
