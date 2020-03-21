
public class QueueImpl implements Queue<Integer> {
	private Integer[] elements = null;
	private int front = 0;
	private int end = 0;
	
	public QueueImpl(int size) {
		elements = new Integer[size];
	}

	@Override
	public void enqueue(Integer t) throws FullQueueException {
		if(isFull()) {
			throw new FullQueueException();
		}
		
		elements[end] = t;
		end = (end +1) % elements.length;
		
	}

	@Override
	public Integer dequeue() throws EmptyQueueException {
		
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		
		final Integer element = elements[front];
		elements[front] = null;
		front = (front + 1) % elements.length;
		return element;
	}

	@Override
	public int size() {
		int n = elements.length;
		return ((n - front + end) % n);
	}

	@Override
	public boolean isEmpty() {
		return front == end;
	}

	@Override
	public boolean isFull() {
		int n = elements.length;
		return ((n - front + end) % n) >= n;
	}

	@Override
	public Integer front() {
		return elements[front];
	}
}