package java.lang;

import java.io.Serializable;

public final class Class<T> implements Serializable {

    private transient String name;

    public String getName() {
        String name = this.name;
        if (name == null) {
            this.name = name = getName0();
        }
        return name;
    }

    private native String getName0();
}
