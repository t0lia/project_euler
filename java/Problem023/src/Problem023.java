public class Problem023 {
	/*
		return -1 if number is deficient
		return 0 if number is perfect
		return 1 if number is abudant
	*/
	public static boolean isAbudant(int number) {
		int sum = 0;
		for (int i = 1; i < number / 2 + 1; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum > number)  return true;
		return false;

	}
	public static void main(String args[]){
		int MAX = 28123;

		//fill abudantNumbers array
		boolean abudantNumbers[] = new boolean[MAX];
		for (int i = 1; i < MAX; i++) {
			abudantNumbers[i] = false;
			if (isAbudant(i)) {
				abudantNumbers[i] = true;
			}
		}

		
		long sum = 0;
		long sumOfAllNumbers = 0;
		for (int i = 1; i < MAX; i++) {
			sumOfAllNumbers += i;
			for (int j = 1; j <= i; j++) {
				if (abudantNumbers[j] == true && abudantNumbers[i-j] == true) {
					sum += (long)i ;
					break;
				}
			}		
		}
		
		StdOut.printf("sum: %d%n", sumOfAllNumbers - sum);
	}
}