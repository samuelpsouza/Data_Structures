
public interface Queue<T> {
    public void enqueue(T t) throws FullQueueException;
    public T dequeue() throws EmptyQueueException;
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public T front();
}