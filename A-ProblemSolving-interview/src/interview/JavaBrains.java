package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

	public static int[] returnIndex(int[] arr, int target) {
		Map<Integer, Integer> vistedNumber = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int tar = target - arr[i];
			if (vistedNumber.containsKey(tar)) {
				return new int[] { i, vistedNumber.get(tar) };

			}
			vistedNumber.put(arr[i], i);
		}
		return new int[] { -1, -1 };
	}

	// reverse String
	public static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static String ReverseManually(String str) {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sBuilder.append(str.charAt(i));
		}
		return sBuilder.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers(7);
		System.out.println("***********");

		int[] num = { 2, 3, 6, 4, 8 };
		System.out.println(Arrays.toString(returnIndex(num, 5)));
		System.out.println("***********");

		System.out.println(reverseWithStringBuilder("seli"));
		System.out.println(ReverseManually("seli"));
	}

}
