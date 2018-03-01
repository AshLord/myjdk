package java.lang;

import jdk.internal.HotSpotIntrinsicCandidate;

import java.io.Serializable;

public final class Class<T> implements Serializable {

    private static native void registerNatives();
    static {
        registerNatives();
    }

    //成员变量
    private transient String name;
    private final Class<?> componentType;
    private final ClassLoader classLoader;

    private Class(ClassLoader loader, Class<?> arrayComponentType) {
        this.componentType = arrayComponentType;
        this.classLoader = loader;
    }


    public String getName() {
        String name = this.name;
        if (name == null) {
            this.name = name = getName0();
        }
        return name;
    }

    private native String getName0();

    public Class<?> getComponentType() {
        if (isArray()) {
            return componentType;
        } else {
            return null;
        }
    }

    @HotSpotIntrinsicCandidate
    public native boolean isArray();
}
