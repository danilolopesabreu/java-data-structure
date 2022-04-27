package recursion;

/**
 * 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136
 * */
public class Tribonacci {
	public static void main(String[] args) {
		System.out.println(trib(6));
	}

	private static int trib(int n) {
		int ultimo = 2, penultimo = 1, antepenultimo = 1, temp = 0;
		for(int i = 3; i<=n; i++) {
			temp = ultimo;
			ultimo = penultimo + antepenultimo + temp;
			antepenultimo = penultimo;
			penultimo = temp;
		}
		return ultimo;
	}
}
