package java.util;

import java.io.Serializable;

/**
 * @author yang.jin
 * date: 04/03/2018
 * desc:
 */
public final class Collections {

    private Collections() {

    }

    public static <T> Comparator<T> reverseOrder(Comparator<T> cmp) {
        if (cmp == null) {
            return reverseOrder();
        }
        if (cmp instanceof ReverseComparator) {
            return ((ReverseComparator2 < T >) cmp).cmp;
        }
        return new ReverseComparator2<>(cmp);
    }

    public static <T> Comparator<T> reverseOrder() {
        return (Comparator<T>) ReverseComparator.REVERSE_ORDER;
    }

    static class ReverseComparator implements Comparator<Comparable<Object>>,Serializable{

        static final ReverseComparator REVERSE_ORDER = new ReverseComparator();

        @Override
        public int compare(Comparable<Object> o1, Comparable<Object> o2) {
            return 0;
        }

        @Override
        public Comparator<Comparable<Object>> reversed() {
            return null;
        }
    }

    static class ReverseComparator2<T> implements Comparator<T>, Serializable {

        final Comparator<T> cmp;

        ReverseComparator2(Comparator<T> cmp) {
            assert cmp != null;
            this.cmp = cmp;
        }

        @Override
        public int compare(T o1, T o2) {
            return 0;
        }

        @Override
        public Comparator<T> reversed() {
            return null;
        }
    }


}
