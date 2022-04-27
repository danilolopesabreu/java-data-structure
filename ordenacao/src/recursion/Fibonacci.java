package recursion;

/**
 * Cada elemento da sequencia de fibonacci é a soma dos Dois elementos anteriores.
 * fib(n) = fib(n - 2) + fib(n - 1) se n >= 2
 * fib(n) = n se n = 0 ou n = 1
 * */
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(6));
		System.out.println(fibIterativo(6));
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

	/**
	 * Encontrar o elemento da sexta posição (8).
	 * 
	 * 1, 1, 2, 3, 5, 8, 13, 21, 34
	 * 
	 *					 fib(5) = fib(3) + fib(4) = 2 + 3 -> 5
	 * fib(6) = fib(4) + fib(5) = 3 + 5 -> 8
	 * 			
	 * fib(4) = fib(3) + fib(2) = 2 + 1 -> 3
	 * 			
	 * fib(3) = fib(1) + fib(2) -> 2
	 * 					 fib(2) = fib(0) + fib(1) = 0 + 1 -> 1
	 * 					 
	 * fib(1) -> 1
	 * */
	private static int fib(int n) {
		
		if(n < 2)
			return n;
		
		int fibA = fib(n - 2);
		int fibB = fib(n - 1);
		
		return  fibA + fibB;
	}
	
}






