package fila;

public interface Fila<T> {
	public void enfileira(T t) throws FilaCheiaException;

	public T desenfileira() throws FilaVaziaException;

	public int tamanho();

	public boolean estaVazia();

	public boolean estaCheia();

	public T frente();
}