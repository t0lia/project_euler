import java.util.Arrays;

public class Problem027 {
	public static void main(String args[]) {
		boolean[] primes = eratosthenes(1000000);
		int max = 0;
		int maxA = 1;
		int maxB = 1;
		for (int a = -999; a < 1000; a++) {
			if((a + 1000) % 100 == 0)
				StdOut.printf("%d%% %n",(a + 1000) / 20);
			for (int b = -999; b < 1000; b++) {
				for (int i = 0;; i++) {
					int candidate = i*i + a*i + b;
					if (candidate < 0)
						break;
					if (!primes[candidate]) {		
						if (max < i) {
							max = i;
							maxA = a;
							maxB = b;
						}
						break;
					}
				}
			}
		}
		StdOut.printf("%nmax: %d product: %d * %d = %d%n",max ,maxA ,maxB, maxA*maxB);
	}

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
}
