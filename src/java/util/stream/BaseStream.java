package java.util.stream;

import java.io.AutoCloseable;
import java.util.Iterator;
import java.util.Spliterator;

/**
 * @author yang.jin
 * date: 22/02/2018
 * desc:
 */
public interface BaseStream<T,S extends BaseStream<T,S>> extends AutoCloseable{

    Iterator<T> iterator();

    Spliterator<T> spliterator();

    boolean isParallel();

    S sequential();

    S parallel();

    S unordered();

    S onclose();

    @Override
    void close();
}
