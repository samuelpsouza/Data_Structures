package pilha;

public class PilhaImpl implements Pilha<Integer> {
	private Integer[] elements = null;
	private int index = -1;

	public PilhaImpl(int size) {
		elements = new Integer[size];
	}

	@Override
	public void empilha(final Integer t) {
		index = index + 1;
		elements[index] = t;
	}

	@Override
	public Integer desempilha() throws PilhaVaziaException {
		if (estaVazia()) {
			throw new IllegalStateException("Pilha is empty");
		}

		final Integer element = elements[index];
		elements[index] = null;
		index = index - 1;

		return element;
	}

	@Override
	public int tamanho() {
		return index + 1;
	}

	@Override
	public boolean estaVazia() {
		return this.index < 0;
	}

	@Override
	public Integer topo() {
		return elements[index];
	}

}
