package java.util;

import jdk.internal.vm.annotation.Stable;

import java.io.Serializable;

/**
 * @author yang.jin
 * date: 04/03/2018
 * desc:
 */
class ImmutableCollections {

    private ImmutableCollections() {

    }

    abstract static class AbstractImmutableList<E> extends AbstractList<E> implements RandomAccess,Serializable {

    }

    static final class List0<E> extends AbstractImmutableList<E> {

        private static final List0<?> INSTANCE = new List0<>();

        static <T> List<T> instance() {
            return (List0<T>) INSTANCE;
        }
        @Override
        public E get(int index) {
            return null;
        }

        @Override
        public E set(int index, E e) {
            return null;
        }

        @Override
        public E remove(int idx) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIdx, int toIdx) {
            return null;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public int hashcode() {
            return 0;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }
    }

    static final class List1<E> extends AbstractImmutableList<E> {

        @Stable
        private final E e0;

        List1(E e) {
            this.e0 = Objects.requireNonNull(e);
        }
        @Override
        public E get(int index) {
            return null;
        }

        @Override
        public E set(int index, E e) {
            return null;
        }

        @Override
        public E remove(int idx) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIdx, int toIdx) {
            return null;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public int hashcode() {
            return 0;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }
    }


}
