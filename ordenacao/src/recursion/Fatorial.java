package recursion;

/**
 * Fatorial � um n�mero natural inteiro positivo, o qual � representado por n! 
 * O fatorial de um n�mero � calculado pela multiplica��o desse n�mero por todos os seus antecessores at� chegar ao n�mero 1
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
