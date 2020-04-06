package lista;

public interface Lista<T> {
	public void insere(T t);

	public void estaVazia();

	public T busca(T t);

	public void remove(T t);
}
