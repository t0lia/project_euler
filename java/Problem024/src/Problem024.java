//Алгоритм Нарайаны
	/*


	*/
public class Problem024{
	public static void main(String args[]) {
		String current = "0123456789";
		StdOut.printf("1:\t%s%n", current);	
		
		for (int i = 2; i <= 1000000; i++) {
			current = nextPermutation(current);
			
			if (i % 10000 == 0) {
				StdOut.printf("%d %% complete%n", i/10000);
			}
			if (i == 1000000) {
				StdOut.printf("%dth permutation is %s%n", i, current);
			}

				
		}
		
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
		
		//StdOut.printf("firstCandidate- %s%n", source.charAt(firstCandidate));
		//StdOut.printf("secondCandidate- %s%n", source.charAt(secondCandidate));

		String result = source.substring(0, firstCandidate) + source.charAt(secondCandidate)
		+ new StringBuilder(source.substring(firstCandidate + 1, secondCandidate) + source.charAt(firstCandidate) + source.substring(secondCandidate + 1, source.length())).reverse().toString();

		return result;
	}
}