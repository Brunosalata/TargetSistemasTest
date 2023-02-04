package fibonacci;

public class Application2 {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1, n3 = 0;
		int N = 8;

		while (N > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

		if (N == 0) {
			System.out.println(N + " belongs to Fibonacci sequence");
		} else if (N == n3) {
			System.out.println(N + " belongs to Fibonacci sequence");
		} else {
			System.out.println(N + " doesn't belong to Fibonacci sequence");
		}

	}

}
