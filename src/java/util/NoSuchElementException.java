package java.util;

/**
 * @author yang.jin
 * date: 06/03/2018
 * desc:
 */
public class NoSuchElementException extends RuntimeException{

    public NoSuchElementException() {
        super();
    }

    public NoSuchElementException(String msg) {
        super(msg);
    }

    public NoSuchElementException(Throwable cause) {
        super(cause);
    }

    public NoSuchElementException(String message, Throwable cause) {
        super(message, cause);
    }
}
