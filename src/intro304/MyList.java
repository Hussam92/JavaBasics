package intro304;

public interface MyList<T> {
    public void add(T t);
    public void add(int index, T t);
    public T get(int index);
    public T remove(int index);
    public int size();
}
