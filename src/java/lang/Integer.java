package java.lang;

import java.lang.annotation.Native;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public class Integer extends Number implements Comparable<Integer>{

    //mv
    @Native
    public static final int MIN_VALUE = 0x80000000;
    @Native
    public static final int MAX_VALUE = 0x7fffffff;

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public static String toHexString(int i) {
        return toUnsignedString0(i, 4);
    }

    private static String toUnsignedString0(int val, int shift) {
        return null;
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
