package java.lang.reflect;

/**
 * @author yang.jin
 * date: 27/02/2018
 * desc:
 */
public interface Type {

    default String getTypeName() {
        return toString();
    }
}
