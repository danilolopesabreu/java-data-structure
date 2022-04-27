package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(6));
		System.out.println(fibIterativo(9));
	}

	// 0,1,1,2,3,5,8,13,21,34
	private static int fibIterativo(int n) {
		int ultimo = 0;
		int penultimo = 0;
		int resultado = 1;
		for (int i = 2; i <= n; i++) {
			penultimo = ultimo;
			ultimo = resultado;
			resultado = penultimo + ultimo;
		}
		return resultado;
	}

	private static int fib(int i) {
		int retorno = 0;
		
		if(i >= 2)
			retorno = fib(i - 2) + fib(i - 1);
			
		return retorno;
	}
	
}






