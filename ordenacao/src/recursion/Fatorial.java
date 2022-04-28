package recursion;

/**
 * Fatorial é um número natural inteiro positivo, o qual é representado por n! 
 * O fatorial de um número é calculado pela multiplicação desse número por todos os seus antecessores até chegar ao número 1
 * */
public class Fatorial {
	public static void main(String[] args) {
		System.out.println(fat(4));
	}

	/**
	 * fat(5) = 5 * fat(4)...
	 *  
	 * */
	private static int fat(int n) {
		if(n <= 1) return 1;
		return n * fat(n-1);
	}
}
