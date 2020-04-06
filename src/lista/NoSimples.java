package lista;

public class NoSimples<T> {
	private NoSimples<T> proximo;
	private T elemento;

	public NoSimples<T> getProximo() {
		return proximo;
	}

	public void setProximo(final NoSimples<T> proximo) {
		this.proximo = proximo;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
}
