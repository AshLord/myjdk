package java.io;

public class PrintStream extends FilterOutputStream implements Closeable,Appendable{

    public void println(CharSequence csq) {

    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public Appendable append(CharSequence csq) throws IOException {
        return null;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        return null;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return null;
    }
}
