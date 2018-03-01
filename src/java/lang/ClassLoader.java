package java.lang;

/**
 * @author yang.jin
 * date: 01/03/2018
 * desc:
 */
public abstract class ClassLoader {

    private static native void registerNatives();
    static {
        registerNatives();
    }
}
