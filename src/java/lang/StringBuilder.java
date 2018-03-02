package java.lang;

import java.io.IOException;
import java.io.Serializable;

/**
 * @author yang.jin
 * date: 02/03/2018
 * desc:
 */
public final class StringBuilder extends AbstractStringBuilder implements Serializable,CharSequence{
    @Override
    public Appendable append(CharSequence csq) throws IOException {
        return null;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        return null;
    }

    @Override
    public Appendable append(char c) {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
