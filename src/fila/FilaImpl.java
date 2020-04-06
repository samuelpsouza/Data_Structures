package fila;

public class FilaImpl implements Fila<Integer> {
	private Integer[] elements = null;
	private int front = 0;
	private int end = 0;

	public FilaImpl(int size) {
		elements = new Integer[size];
	}

	@Override
	public void enfileira(Integer t) throws FilaCheiaException {
		if (estaCheia()) {
			throw new FilaCheiaException();
		}

		elements[end] = t;
		end = (end + 1) % elements.length;

	}

	@Override
	public Integer desenfileira() throws FilaVaziaException {

		if (estaVazia()) {
			throw new FilaVaziaException();
		}

		final Integer element = elements[front];
		elements[front] = null;
		front = (front + 1) % elements.length;
		return element;
	}

	@Override
	public int tamanho() {
		int n = elements.length;
		return ((n - front + end) % n);
	}

	@Override
	public boolean estaVazia() {
		return front == end;
	}

	@Override
	public boolean estaCheia() {
		int n = elements.length;
		return ((n - front + end) % n) >= n;
	}

	@Override
	public Integer frente() {
		return elements[front];
	}
}