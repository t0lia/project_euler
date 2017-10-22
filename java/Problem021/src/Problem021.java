public class Problem021 {
	public static boolean isAmiable(int source) {
		int firstLevelInverse = sum(getDivisors(source));
		int secondLevelInverse = sum(getDivisors(firstLevelInverse));
		if (secondLevelInverse == source && firstLevelInverse != source) {
			StdOut.printf("% 4d - % 4d: ", source, firstLevelInverse);
			return true;
		}
		return false;
	}
	public static int sum(int source[]) {
		int sum = 0;
		for (int i = 0; i < source.length; i++) {
			sum += source[i];
		}
		return sum;
	}
	public static int[] getDivisors(int source) {
		int number = source;
		int divisors[] = new int[2];
		for (int i = 1, j = 0; i < source / 2 + 1; i++) {
			//	resize divisors array
			if (divisors.length - 1 == j) {
				int divisorsCopy[] = new int[divisors.length * 2];
				for (int k = 0; k < divisors.length; k++) {
					divisorsCopy[k] = divisors[k];
				}
				divisors = divisorsCopy;
			}

			if (number % i == 0	) {
				divisors[j++] = i;
			}
		}
		return divisors;
	}
	public static void main(String args[]) {
		int UPPER_BOUND = 10000;
		/*int divisors[] = getDivisors(UPPER_BOUND);
		for (int i = 0; i < divisors.length && divisors[i] != 0; i++) {

			StdOut.printf("%d\t", divisors[i]);
		}*/
		int sum = 0;
		for (int i = 1; i < UPPER_BOUND; i++) {
			if (isAmiable(i)) { 
				sum += i;
				StdOut.printf("%d%n", i);
			}
		}
		StdOut.printf("%d%n", sum);
		
	}
}