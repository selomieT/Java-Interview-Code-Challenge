package interview;

public class JavaBrains {
	public static void numbers(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers(20);
	}

}
