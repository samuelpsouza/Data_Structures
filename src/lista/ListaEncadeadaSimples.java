package lista;

public class ListaEncadeadaSimples {
	private NoSimples<Integer> primeiro = null;

	public void insere(Integer t) {
		final NoSimples<Integer> no = new NoSimples<Integer>();
		no.setElemento(t);
		no.setProximo(primeiro);
		primeiro = no;
	}

	public boolean estaVazia() {
		return primeiro == null;
	}

	public NoSimples<Integer> busca(Integer t) {
		for (NoSimples<Integer> no = primeiro; no != null; no = no.getProximo()) {
			if (no.getElemento().equals(t)) {
				return no;
			}
		}

		return null;
	}
	
	//TODO
	public void remove(Integer t) {
		
	}

}
