import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
public class Problem041 {
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
	public int maximumPrimeLexiograthicalPermutation(String initialValue) {

		boolean[] primes = eratosthenes(76543211);
		int result = 0;
		String finalValue = new StringBuilder(initialValue).reverse().toString();
		

		String current = initialValue;
		while ( !current.equals(finalValue)) {
			current = nextPermutation(current);

			if (primes[Integer.parseInt(current)]) {
				result = Integer.parseInt(current);
			}

		}		
		return result;
	}
	public void run() {
		StdOut.println(maximumPrimeLexiograthicalPermutation("1234567"));
	}


	public static String nextPermutation(String source) {
		int firstCandidate = 0;
		for (int i = source.length() - 2; i >= 0; i--) {
			if (source.charAt(i + 1) >= source.charAt(i)) {
				firstCandidate = i;
				break;
			}
		}

		int secondCandidate = source.length() - 1;

		for (int i = firstCandidate + 1; i < source.length(); i++) {
			if (source.charAt(i) - source.charAt(firstCandidate) < 0) {
				secondCandidate = i - 1;
				break;
			}
		}
	
		String result = source.substring(0, firstCandidate) + source.charAt(secondCandidate)
		+ new StringBuilder(source.substring(firstCandidate + 1, secondCandidate) + source.charAt(firstCandidate) + source.substring(secondCandidate + 1, source.length())).reverse().toString();

		return result;
	}

	public static void main(String[] args) {
		Problem041 problem = new Problem041();
		problem.run();
	}
}
