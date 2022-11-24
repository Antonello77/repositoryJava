

public class Ricorsione {
	public static void main(String[] args) {
		int A =130;
		int risultato = f(A);
		System.out.println(risultato);
	}

	public static int f(int n) {
		if (n % 2 == 1) {
			return 0;
		} else {
			return 1 + f(n / 2);
		}
	}
}