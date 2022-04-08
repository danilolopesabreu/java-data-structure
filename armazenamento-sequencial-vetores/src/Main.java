
/**
 * Vetores sao estruturas que armazenam elementos lado a lado, de maneira sequencial
 * */
public class Main {
	public static void main(String[] args) {
		ArmazenamentoSequencial as = new ArmazenamentoSequencial();
		
		as.addItemArray('A');
		as.addItemArray('B');
		as.addItemArray('C');
		as.addItemArray('D');
		as.addItemArray('E');
		as.imprimirArray();
		as.addByIndex('X', 2);
		
		as.imprimirArray();
		
		as.removeItem(2);
		as.imprimirArray();
		
		as.addItemArray('F');
		as.addItemArray('G');
		as.addItemArray('H');
		as.addItemArray('I');
		as.addItemArray('J');
		
		as.imprimirArray();
		
		for (int i = 0; i < 10; i++) {
			as.removeItem(2);
			as.addByIndex('Z', 6);
			as.imprimirArray();
		}
		
	}
}
