public class Problem034 {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 3; i < 100000 ; i++ ) {
			int sum = 0;
			for (int current = i; current != 0; current/=10) {
				sum += digitFactorial(current%10);
				//StdOut.printf("%d%n",current%10);
			}

			if (sum == i) {
				result += sum;
				StdOut.printf("%d%n", sum);
			}
		}
		StdOut.printf("sum:%n");
		StdOut.printf("\t%d%n", result);
		
	}
	public static int digitFactorial(int input) {
		if (input == 0)
			return 1;
		if (input == 1)
			return 1;
		if (input == 2)
			return 2;
		if (input == 3)
			return 6;
		if (input == 4)
			return 24;
		if (input == 5)
			return 120;
		if (input == 6)
			return 720;
		if (input == 7)
			return 5040;
		if (input == 8)
			return 40320;
		if (input == 9)
			return 362880;
		return -1;
	}
	public static int factorial(int input) {
		int result = 1;
		for (int i = 2; i <= input; i++) {
			result *= i;
		}
		return result;
	}
}