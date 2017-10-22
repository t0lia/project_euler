import java.math.*;

public class Problem030 {
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i <10000000; i++) {
			if (i == sumOfDigit(i)) {
				sum += i;
				StdOut.printf("%d%n", i);
			}
		}
		/*
		for (int i = 10000; i < 100000; i++) {
			if ((int)Math.pow(i%10,5) + (int)Math.pow(i%100/10,5) + (int)Math.pow(i%1000/100,5) + (int)Math.pow(i%10000/1000,5) + (int)Math.pow(i%100000/10000,5) == i) {
				StdOut.printf("%d%n",i);
				sum += i;
			}
		}*/
			StdOut.printf("sum=%d%n",sum);
	}
	public static long sumOfDigit(long input) {
		long current = 0;
		long result = 0;
		for (long i = input; i > 0; i /= 10) {
			result += (long)Math.pow(i % 10, 5);
			//StdOut.printf("%d%n", i % 10);
		}
		return result;
	}
}