package java.util.function;

/**
 * @author yang.jin
 * date: 04/03/2018
 * desc:
 */
@FunctionalInterface
public interface BiFunction<T,U,R> {

    R apply(T t, U u);
}
