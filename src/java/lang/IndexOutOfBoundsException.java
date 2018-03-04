package java.lang;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public class IndexOutOfBoundsException extends RuntimeException{

    public IndexOutOfBoundsException() {
        super();
    }

    public IndexOutOfBoundsException(String msg) {
        super(msg);
    }

    public IndexOutOfBoundsException(int index) {
        super("index out of bounds: "+index);
    }
}
