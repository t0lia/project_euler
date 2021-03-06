import java.util.Arrays;


public class Problem037 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		boolean[] primes = eratosthenes(1000000);
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] && check(i)) {
				

				boolean isTruncatablePrime = true;
				for(int j = i; j != 0; j /= 10) {
					if (!primes[j])
						isTruncatablePrime = false;
				}
				for(int j = i; j != 0; j = j % ipow(10,(rank(j))-1)) {
					if (!primes[j])
						isTruncatablePrime = false;
				}
				if (isTruncatablePrime) {
					sum += i;
					count++;
					StdOut.printf("%d - %d%n", count, i);
				}


			}
		}

		StdOut.printf("count=%d%n",count);
		
		StdOut.printf("sum=%d%n",sum);
		//StdOut.println(rotate(135));
		//StdOut.println(rotate(rotate(135)));
		//StdOut.println(rotate(rotate(rotate(135))));
	}
	public static int ipow(int base, int exp)
	{
	    int result = 1;
	    while (exp != 0)
	    {
	        if ((exp & 1) == 1)
	            result *= base;
	        exp >>= 1;
	        base *= base;
	    }

	    return result;
	}
	public static boolean check(int input) {
		if (input < 10) 
			return false;
		/*
		int var = input;
		while(var != 0) {
			if (var % 2 == 0)
				return false;
			var /= 10;
		}
*/
		return true;
	}
	public static int rotate(int input) {
		int result = input/10 + input%10 * (int)Math.pow(10,rank(input)-1);
		return result;
	}
	public static int rank(int input) {
		if (input < 10)
			return 1;
		if (input < 100)
			return 2;
		if (input < 1000)
			return 3;
		if (input < 10000)
			return 4;
		if (input < 100000)
			return 5;
		if (input < 1000000)
			return 6;
		if (input < 10000000)
			return 7;
		return 8;
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