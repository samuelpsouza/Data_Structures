package pilha;

public class Pilha {
	private Integer[] elements = null;
	private int index = -1;

	public Pilha(int size) {
		elements = new Integer[size];
	}

	public void empilha(final Integer t) {
		index = index + 1;
		elements[index] = t;
	}

	public Integer desempilha() throws PilhaVaziaException {
		if (estaVazia()) {
			throw new IllegalStateException("Pilha is empty");
		}

		final Integer element = elements[index];
		elements[index] = null;
		index = index - 1;

		return element;
	}

	public int tamanho() {
		return index + 1;
	}

	public boolean estaVazia() {
		return this.index < 0;
	}

	public Integer topo() {
		return elements[index];
	}

}
