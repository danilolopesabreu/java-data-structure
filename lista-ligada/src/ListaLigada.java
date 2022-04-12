/**
 * @see java.util.LinkedList
 * */
public class ListaLigada {

	private Celula primeiro;
	private Celula ultimo;
	private int qtdElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		Celula novoPrimeiro = new Celula(elemento, this.primeiro);
		this.primeiro = novoPrimeiro;
		
		if(qtdElementos == 0)
			this.ultimo = this.primeiro;
		
		this.qtdElementos++;
	}

	public void adiciona(Object elemento) {

		if (this.primeiro == null) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula novoUltimo = new Celula(elemento, null);
			this.ultimo.setProximo(novoUltimo);
			this.ultimo = novoUltimo;
			this.qtdElementos++;
		}

	}

	public void adiciona(int posicao, Object elemento) {
		
		if(posicao == 0) {
			adicionaNoComeco(elemento); 
		}else {
			Celula elementoAtual = this.pega(posicao);
			Celula novoElemento = new Celula(elemento, elementoAtual.getProximo());
			elementoAtual.setProximo(novoElemento);
			this.qtdElementos++;
		}
	}
	
	public Celula pega(int posicao) {
		Celula elementoAtual = this.primeiro;
		for (int i = 0; i < posicao; i++) {
			elementoAtual = elementoAtual.getProximo();
		}
		return elementoAtual;
	}

	public void remove(int posicao) {
		
		if(posicao == 0) {
			
		}
		
		Celula elementoAtual = this.primeiro;
		Celula elementoAnterior = null; 
		for (int i = 0; i < this.qtdElementos; i++) {
			if(posicao == i) {
				elementoAnterior.setProximo(elementoAtual.getProximo());
				qtdElementos--;
				break;
			}
			elementoAnterior = elementoAtual;
			elementoAtual = elementoAtual.getProximo();
		}
	}

	public int tamanho() {
		return qtdElementos;
	}

	public boolean contem(Object o) {
		Celula elementoAtual = this.primeiro;
		for (int i = 0; i < this.qtdElementos; i++) {
			if (elementoAtual.getElemento().equals(o))
				return true;
			else
				elementoAtual = elementoAtual.getProximo();
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.qtdElementos == 0) {
			return "[]";
		}

		Celula atual = primeiro;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < qtdElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}
}