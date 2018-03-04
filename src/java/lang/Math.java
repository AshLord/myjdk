package java.lang;

import jdk.internal.HotSpotIntrinsicCandidate;

/**
 * @author yang.jin
 * date: 04/03/2018
 * desc:
 */
public final class Math {

    private Math() {}

    @HotSpotIntrinsicCandidate
    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
