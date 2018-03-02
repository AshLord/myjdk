package java.lang;

/**
 * @author yang.jin
 * date: 02/03/2018
 * desc:
 */
public class VirtualMachineError extends Error {

    public VirtualMachineError() {
        super();
    }

    public VirtualMachineError(String message) {
        super(message);
    }

    public VirtualMachineError(String msg, Throwable cause) {
        super(msg,cause);
    }

    protected VirtualMachineError(Throwable cause) {
        super(cause);
    }
}
