package java.lang;

/**
 * @author yang.jin
 * date: 02/03/2018
 * desc:
 */
public class Error extends Throwable {

    public Error() {
        super();
    }

    public Error(String message) {
        super(message);
    }

    public Error(String msg, Throwable cause) {
        super(msg,cause);
    }

    protected Error(String msg, Throwable cause, boolean enableSuppresion, boolean writableStackTrace) {
        super(msg,cause,enableSuppresion,writableStackTrace);
    }
}
