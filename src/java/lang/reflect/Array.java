package java.lang.reflect;

import jdk.internal.HotSpotIntrinsicCandidate;

/**
 * @author yang.jin
 * date: 01/03/2018
 * desc:
 */
public final class Array {

    public static Object newInstance(Class<?> componentType, int length) throws NegativeArraySizeException {
        return newArray(componentType, length);
    }

    @HotSpotIntrinsicCandidate
    private static native Object newArray(Class<?> componentType,int length) throws NegativeArraySizeException;
}
