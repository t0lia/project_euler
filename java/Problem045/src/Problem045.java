public class Problem045 {
	public void run() {
		int count = 0;
		final int SIZE = 40000;
		long[] pentagonal = new long[SIZE];
		long[] hexagonal = new long[SIZE];
		for (int i = 1 ;i < SIZE ; i++) {
			pentagonal[i] = 1l*i*(3*i-1)/2;
			hexagonal[i] = 1l*i*(2*i-1);
		};
LOOP:	for (int i = 2; i < SIZE; i++) {
			for (int j = i; j < SIZE && pentagonal[j] <= hexagonal[i]; j++) {	
				if (hexagonal[i] == pentagonal[j]) {
					StdOut.printf("%d %n",hexagonal[i]);
					count++;
					if (count == 2) {
						break LOOP;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Problem045 problem = new Problem045();
		problem.run();
	}
}