public class Problem028 {
	public static void main(String[] args) {
		long step = 2;
		long counter = 1;
		long sum = 1;
		for (long i = 1; i < (1001+1)/2; i++) {
			for (long j = 0; j < 4; j++) {
				counter += step;
				//StdOut.println(counter);
				sum += counter;
			}
			step += 2;
		}

		StdOut.println(sum);

	}
}