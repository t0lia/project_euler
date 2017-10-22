import java.util.Arrays;

public class Problem050 {
	public static boolean[] eratosthenes(int n) {
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i*i < primes.length; i++) {
			if (primes[i]) {
				for (int j = i*2; j < n; j += i) {
					primes[j] = false;
				}
			}
		}
		return primes;
	}
	public static int nextPrime(boolean[] primes, int current) {
		int i = current;
		i++;
		while(!primes[i]) {
			i++;
		}
		return i;
	}
	public static void main(String[] args) {
		//Stopwatch sw = new Stopwatch();
		boolean[] primes = eratosthenes(2000000);
		//StdOut.printf("Elapsed time: %.3f s.%n",sw.elapsedTime());
		int max = 0;
		for (int initialPrime = 2; initialPrime < 100; initialPrime = nextPrime(primes,initialPrime)) {

			int currentPrime = initialPrime;
			int sum = 0;
			do {
				sum += currentPrime;
				if (primes[sum]) {
					StdOut.println(sum);
					if (max < sum && sum < 1000000) {
						max = sum;
					}
				}
			currentPrime = nextPrime(primes,currentPrime);
			}	while (sum < 1000000);
		}
		StdOut.println();
		StdOut.println(max);
	}
}