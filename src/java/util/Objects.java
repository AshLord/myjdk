package java.util;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public final class Objects {

    //禁止实例化
    private Objects() {
        throw new RuntimeException();
    }

    public static <T> T requireNotNull(T obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }

}
