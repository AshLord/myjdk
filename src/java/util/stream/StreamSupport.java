package java.util.stream;

import java.util.Objects;
import java.util.Spliterator;

/**
 * @author yang.jin
 * date: 03/03/2018
 * desc:
 */
public final class StreamSupport {

    private StreamSupport() {

    }

    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean parallel) {
        Objects.requireNonNull(spliterator);
        return null;
    }
}
