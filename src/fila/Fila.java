package fila;

public class Fila {
	private Integer[] elements = null;
	private int front = 0;
	private int end = 0;

	public Fila(int size) {
		elements = new Integer[size];
	}

	public void enfileira(Integer t) throws FilaCheiaException {
		if (estaCheia()) {
			throw new FilaCheiaException();
		}

		elements[end] = t;
		end = (end + 1) % elements.length;

	}

	public Integer desenfileira() throws FilaVaziaException {

		if (estaVazia()) {
			throw new FilaVaziaException();
		}

		final Integer element = elements[front];
		elements[front] = null;
		front = (front + 1) % elements.length;
		return element;
	}

	public int tamanho() {
		int n = elements.length;
		return ((n - front + end) % n);
	}

	public boolean estaVazia() {
		return front == end;
	}

	public boolean estaCheia() {
		int n = elements.length;
		return ((n - front + end) % n) >= n;
	}

	public Integer frente() {
		return elements[front];
	}
}