import java.math.*;

public class Problem020 {
	public static int sumOfDigit(String number) {
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += (int)(number.charAt(i)-'0');
		}
		return sum;
	}
	public static BigInteger factorial(int number) {
		BigInteger current = BigInteger.valueOf(number);
		BigInteger result = BigInteger.ONE;
		while (!current.equals(BigInteger.ONE)) {
			result = result.multiply(current);
			current = current.subtract(BigInteger.ONE);
		}
		return result;
	}
	public static void main(String args[]) {
		int i = 100;
		String fact = factorial(i).toString();
		StdOut.printf("%d!=%s sum of digit: %s%n", i, fact, sumOfDigit(fact));
		
		

	}
}