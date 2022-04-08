import java.util.ArrayList;

/**
 * Adicionar itens
 * Recuperar item a partir de um indice
 * Adicionar ao fim do array
 * Adicionar no meio do array
 * Remover item
 * 
 * @see java.util.ArrayList
 * */
public class ArmazenamentoSequencial {

	private char array[] = new char[10];
	private int qtdElementos = 0;
	
	public void addItemArray(char value) {
		
		if(qtdElementos == this.array.length) throw new RuntimeException("Array ja possui qtd maxima de elementos ("+this.array.length+").");
		
		this.array[qtdElementos] = value;
		
		if(qtdElementos < this.array.length)
			qtdElementos++;
	}
	
	public char getItem(int index) {
		return this.array[index];
	}
	
	public void addByIndex(char value, int index) {
		if(qtdElementos == this.array.length) throw new RuntimeException("Array ja possui qtd maxima de elementos ("+this.array.length+").");
		
		char localValue = value;
		char aux;
		for (int i = index; i <= this.qtdElementos; i++) {
			aux = this.array[i];
			this.array[i] = localValue;
			localValue = aux;
		}
		this.qtdElementos++;
	}
	
	public void removeItem(int index) {
		for (int i = index; i < this.qtdElementos-1; i++) {
			this.array[i] = this.array[i+1]; 
		}
		this.array[this.qtdElementos-1] = ' ';
		this.qtdElementos--;
	}
	
	public void imprimirArray() {
		System.out.println(this.array);
	}
}
