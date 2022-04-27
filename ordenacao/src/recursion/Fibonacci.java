package recursion;

/**
 * Cada elemento da sequencia de fibonacci é a soma dos Dois elementos anteriores.
 * fib(n) = fib(n - 2) + fib(n - 1) se n >= 2
 * fib(n) = n se n = 0 ou n = 1
 * */
public class Fibonacci {
	public static void main(String[] args) {
//		System.out.println(fib(6));
		System.out.println(fibIterativo(9));
	}

	// 0,1,1,2,3,5,8,13,21,34
	private static int fibIterativo(int n) {
		int penultimo = 0;
		int ultimo = 1;
		int temp = 0;
		for (int i = 2; i <= n; i++) {
			temp = penultimo;
			penultimo = ultimo;
			ultimo = penultimo + temp;
		}
		return ultimo;
	}

	private static int fib(int i) {
		int retorno = 0;
		
		if(i >= 2)
			retorno = fib(i - 2) + fib(i - 1);
			
		return retorno;
	}
	
}






