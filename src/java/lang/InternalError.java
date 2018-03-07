package java.lang;

/**
 * @author yang.jin
 * date: 06/03/2018
 * desc:
 */
public class InternalError extends VirtualMachineError{

    public InternalError() {
        super();
    }

    public InternalError(String message) {
        super(message);
    }

    public InternalError(String msg, Throwable cause) {
        super(msg,cause);
    }

    protected InternalError(Throwable cause) {
        super(cause);
    }

}
