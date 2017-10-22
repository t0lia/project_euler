public class Problem039 {
	public static void main(String[] args) {
		//int p = 120;
		int maxcounter= 0;
		int maxP = 0;
		for (int p = 3; p <= 1000; p++) {
			int counter = 0;
			for (int a = 1; a < p - 2; a++) {
				for (int b = 1; a + b < p - 1; b++) {
					if (a*a + b*b == (p - a - b)*(p - a - b)) {
					//	StdOut.printf("%d, %d, %d%n", a, b, p - a - b);
						counter++;
					}
				}	
			}
			//StdOut.printf("%d - %d%n",p,counter/2);
			if (maxcounter < counter) {
				maxP = p;
				maxcounter = counter;
			}
		}

			StdOut.printf("- %d%n",maxP);
	}
}