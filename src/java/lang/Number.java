package java.lang;

import java.io.Serializable;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public abstract class Number implements Serializable{

    public abstract int intValue();

    public abstract long longValue();

    public abstract float floatValue();

    public abstract double doubleValue();

    public byte byteValue() {
        return (byte) intValue();
    }

    public short shortValue() {
        return (short) intValue();
    }
}
