package interview;

public class ReverseString {
	// public static String reverseStr(String str) {
	// if (str == null || str.length() == 1) {
	// return str;
	// }
	// return reverseStr(str.substring(1)) + str.charAt(0);
	// }
	public static String reverse(String str) {
		if (str == null || str.length() == 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);

	}

	/*
	 * public static boolean isPrime(int n) { if (n < 2) { return false; } for (int
	 * i = 2; i <= n / 2; i++) { if (n % i == 0) { return false; } } return true; }
	 */
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// fibonachi

	public static boolean isFibonanchi(int n) {
		if (n == 0 || n == 1) {
			return true;
		}
		int fib1 = 1;
		int fib2 = 1;
		int fibonnachi = 0;
		while (fibonnachi < n) {
			fibonnachi = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonnachi;
		}
		if (fibonnachi == n) {
			return true;
		}
		return false;

	}
	// concurrent modification exception

	// public void main(String args[]) {
	public static void main(String[] args) {

		System.out.println(ReverseString.reverse("seli"));
		System.out.println(ReverseString.reverse("king"));
		System.out.println(ReverseString.reverse("123"));
		System.out.println("*****************");

		System.out.println(ReverseString.isPrime(7));
		System.out.println(ReverseString.isPrime(4));

		System.out.println("*****************");
		System.out.println();

	}

}
