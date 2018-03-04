package java.util;

import jdk.internal.util.Preconditions;
import jdk.internal.vm.annotation.ForceInline;

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

    public static <T> T requireNonNull(T obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }

    @ForceInline
    public static int checkIndex(int index,int length) {
        return Preconditions.checkIndex(index, length, null);
    }

}
