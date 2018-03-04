package jdk.internal.util;

import jdk.internal.HotSpotIntrinsicCandidate;

import java.util.List;
import java.util.function.BiFunction;

/**
 * @author yang.jin
 * date: 04/03/2018
 * desc:
 */
public class Preconditions {

    @HotSpotIntrinsicCandidate
    public static <X extends RuntimeException> int checkIndex(int index, int length, BiFunction<String, List<Integer>, X> oobef) {
        if (index < 0 || index >= length) {
            throw outOfBoundsCheckIndex(oobef, index, length);
        }
        return index;
    }

    private static RuntimeException outOfBoundsCheckIndex(BiFunction<String, List<Integer>, ? extends RuntimeException> oobe, int index, int length) {
        return outOfBounds(oobe, "checkIndex", index, length);
    }

    @SafeVarags
    private static RuntimeException outOfBounds(BiFunction<String, List<Integer>, ? extends RuntimeException> oobef, String checkKind, Integer... args) {
        List<Integer> largs = List.of(args);
        RuntimeException e = oobef == null ? null : oobef.apply(checkKind, largs);
        if (e == null) {
            return new IndexOutOfBoundsException(outOfBoundsMessage(checkKind, largs));
        } else {
            return e;
        }
    }

    private static String outOfBoundsMessage(String checkKind, List<Integer> args) {
        //...
        return null;
    }
}
