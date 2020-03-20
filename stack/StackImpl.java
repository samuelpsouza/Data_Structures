
public class StackImpl implements Stack<Integer> {
	private Integer[] elements = null;
	private int index = -1;
	
	public StackImpl(int size) {
		elements = new Integer[size];
	}
	
	@Override
	public void push(Integer t) {
		index = index + 1;
		elements[index] = t;
	}

	@Override
	public Integer pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		
		final Integer element = elements[index];
		elements[index] = null;
		index = index - 1;
		
		return element;
	}

	@Override
	public int size() {
		return index + 1;
	}

	@Override
	public boolean isEmpty() {
		return this.index < 0;
	}

	@Override
	public Integer top() {
		return elements[index];
	}

}
