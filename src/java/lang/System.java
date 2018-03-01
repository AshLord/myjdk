package java.lang;

import jdk.internal.HotSpotIntrinsicCandidate;

import java.io.PrintStream;

public class System {

    public static final PrintStream in = null;
    public static final PrintStream out = null;
    public static final PrintStream err = null;

    @HotSpotIntrinsicCandidate
    public static native void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
}
