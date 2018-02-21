package java.lang;

import java.io.Serializable;

public final class String implements CharSequence,Serializable,Comparable<String>{

    private final char[] val = new char[10];

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

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
