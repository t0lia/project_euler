public class Problem095 {
	public static void main(String args[]) {
		Stopwatch stopwatch = new Stopwatch();
		int oneCount = 0;
		int eightyNineCount = 0;
		boolean array[] = new boolean[1000];
		int i = 0;

		//array initialize
		for (i = 1; i < 1000; i++) {
			int current = i;
			//StdOut.printf("%d", current);	
			while (true) {
				if (current == 1) {
					array[i] = false;
					oneCount++;
					break;
				}
				if (current == 89) {
					array[i] = true;
					eightyNineCount++;
					break;
				}
				int sumOfSquares = 0;
				while (current != 0) {
					int temp = current % 10;
					sumOfSquares += (temp)*(temp);
					current /= 10;
				}
				current = sumOfSquares;
				//StdOut.printf(" => %d", current);	
			}
			//StdOut.printf("%n");	
		}

		//tail of sequence
		for (; i < 10000000; i++) {
			int current = i;
			//if(i % 10000 == 0)
			//	StdOut.printf("%d%n", current);	
			while (true) {
				if (current < 1000) {
					if(array[current])
						eightyNineCount++;
					else
						oneCount++;
					break;
				}

				int sumOfSquares = 0;
				while (current != 0) {
					int temp = current % 10;
					sumOfSquares += (temp)*(temp);


					current /= 10;
				}
				current = sumOfSquares;
				//StdOut.printf(" => %d", current);	
			}
			//StdOut.printf("%n");	
		}

		StdOut.printf("%n1-%d, 89-%d%n", oneCount, eightyNineCount);	
		double time = stopwatch.elapsedTime();
		System.out.println(time);

	}
}