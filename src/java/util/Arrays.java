package java.util;

import jdk.internal.HotSpotIntrinsicCandidate;

import java.lang.reflect.Array;

/**
 * @author yang.jin
 * date: 01/03/2018
 * desc:
 */
public class Arrays {

    private Arrays(){}

    public static <T> T[] copyOf(T[] original, int newLength) {
        return (T[]) copyOf(original, newLength, original.getClass());
    }

    @HotSpotIntrinsicCandidate
    public static <T, U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
        T[] copy = null;
        //如果是Object
        if ((Object) newType == (Object) Object[].class) {
            copy = (T[]) new Object[newLength];
        } else {
            copy = (T[]) Array.newInstance(newType, newLength);
        }
        System.arraycopy(original,0,copy,0,newLength);
        return copy;
    }

    public static <T> void sort(T[] a,Comparator<? super T> c) {
        if (c == null) {
            sort(a);
        } else {
            if (LegacyMergeSort.userRequested) {
                legacyMergeSort(a,c);
            } else {
                Timsort.sort(a, 0, a.length, c, null, 0, 0);
            }
        }
    }

    public static void sort(Object[] a) {
    }

    private static <T> void legacyMergeSort(T[] a,Comparator<? super T> c) {

    }

    static final class LegacyMergeSort {

        private static final boolean userRequested =false;
    }

}
