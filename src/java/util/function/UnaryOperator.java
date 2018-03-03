package java.util.function;

/**
 * @author yang.jin
 * date: 03/03/2018
 * desc:
 */
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T,T>{

    static <T> UnaryOperator<T> identify() {
        return t -> t;
    }
}
