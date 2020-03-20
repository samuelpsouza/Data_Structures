# Data Structures

## Stack (Pilha)

Pilha é uma das estruturas de dados mais simples (Celes et al, 2016). Segundo (Goodrich et al, 2009), uma pilha consiste de um conteiner de objetos que são inseridos ou removidos segundo o método LIFO. 

O significado de LIFO é ***ultimo a entrar, primeiro a sair***. Isso signifca que só temos acesso ao elemento que está no topo da pilha. Para acessar o elementro abaixo do topo precisamos retirar o elemento do topo. Isso implica que a pilha deve ter duas operações básicas: inserir, que nas literaturas é atribuido o nome ***push***, e a operação remover, chamada de ***pop***.

Alguns autores variam nas operações adicionais da pilha. Por exemplo, (Goodrich et al, 2009) sugere um TAD com as interfaces que devem retornar o tamanho da pilha, se ela está vazia e o objeto que está no topo. (Celes et al, 2016) propoe um TAD com interfaces para a criação de uma pilha, verificar se a pilha está vazia e liberar a pilha(destroi a estrutura e libera os recursos).

Nesse texto, combinaremos as TADs e implementaremos além das operações básicas, outras operações citadas.

```java

public inteface Stack<T> {
	public Stack<T> create(int size); 
    public void push(T t);
    public T pop() throws EmptyStackException;
    public int size();
    public boolean isEmpty();
    public T top();
}

```

## Queue (Fila)

