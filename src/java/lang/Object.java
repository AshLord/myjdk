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

    @HotSpotIntrinsicCandidate
    public native int hashCode();

    public boolean equals(Object obj) {
        return this == obj;
    }

    @HotSpotIntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;

    public String toString() {
        return getClass().getName() +"@"+ Integer.toHexString(hashCode());
    }

    @HotSpotIntrinsicCandidate
    public final native void notify();

    @HotSpotIntrinsicCandidate
    public final native void notifyAll();

    public final native void wait(long timeout) throws InterruptedException;

    public final void wait(long timeout,int nanos) throws InterruptedException{
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value cannot be negative");
        }
        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException("nanosecond timeout value out of range");
        }
        if (nanos > 0) {
            timeout++;
        }

        wait(timeout);
    }

    public final void wait() throws InterruptedException {
        wait(0);
    }

    @Deprecated(since = "9")
    protected void finalize() throws Throwable {

    }


}
