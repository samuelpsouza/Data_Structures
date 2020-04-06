package pilha;

public interface Pilha<T> {
	public void empilha(T t);

	public T desempilha() throws PilhaVaziaException;

	public int tamanho();

	public boolean estaVazia();

	public T topo();
}
