package java.lang;

import jdk.internal.HotSpotIntrinsicCandidate;

public class Object {

    /**
     * 调用这个方法后，JNI会开始工作，调用src\java.base\share\native\libjava\Object.c文件（仅可在openjdk9中看到）
     */
    private static native void registerNatives();
    static {
        registerNatives();
    }

    /**
     * 为什么从9开始要把这个隐藏构造函数显示出来，就是为了搭配HotSpotIntrinsicCandidate完成函数内联，极速优化！
     */
    @HotSpotIntrinsicCandidate
    public Object() {

    }

    @HotSpotIntrinsicCandidate
    public final native Class<?> getClass();








    public boolean equals(Object o) {
        return o == this;
    }
}
