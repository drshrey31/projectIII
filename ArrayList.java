public class ArrayList<T extends Comparable<T>> implements List<T> {
    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean add(int index, T element) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int lastIndexOf(T element) {
        return 0;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void sort(boolean order) {

    }

    @Override
    public boolean remove(T element) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }
}
