/*************************************************************************
 *  Compilation:  javac -cp ./src:./lib/stdlib.jar -d ./bin scr/Problem015.java
 *  Execution:    java -cp ./src:./lib/stdlib.jar:./bin Problem015
 *  Data files:   
 *  
 *
 *************************************************************************/

public class Problem015 {
	public static long fact(long number) {
		long n = number;
		long f = 1;
		while (n > 0) {
			f *= n;
			n--;
		}
		return f;
	}
	public static void main(String args[]) {
		long INPUT_VALUE = 20;
		
		// (2n)!/(n! x n!)
		long j = 2;
		long result = 1;
		for (long i = INPUT_VALUE + 1; i <= INPUT_VALUE * 2; i++) {
			result *= i;
			while (result % j == 0 && j <= INPUT_VALUE) {
				result /= j;
				j++;
			}
		}
		StdOut.println(result);

	}
}