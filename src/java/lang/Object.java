package java.lang;

public class Object {

    private static native void registerNatives();
    static {
        registerNatives();
    }

    public boolean equals(Object o) {
        return o == this;
    }
}
