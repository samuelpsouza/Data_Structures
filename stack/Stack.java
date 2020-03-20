

public interface Stack<T> {
    public void push(T t);
    public T pop() throws EmptyStackException;
    public int size();
    public boolean isEmpty();
    public T top();
}
