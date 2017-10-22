public class Problem026 {
	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		int maxremainderSize = 0;
		int maxJ = 0;
		for (int divisor = 1; divisor <= 1000; divisor++) {
			int[] remainders = new int[1000];
			int remaindersSize = 0;	
			int divident = 1;
		//	StdOut.printf("%d/%d = ", divident, divisor);
		//	StdOut.print("0.");
	LOOP:	while (divident != 0) {
				remainders[remaindersSize] = divident;
				remaindersSize++;
				divident = divident % divisor * 10;
				
				for (int k = 0; k < remaindersSize; k++) {
					if (remainders[k] == divident) {
						break LOOP;
					}
				}
		//		StdOut.print(divident/divisor);
			}			
			if(maxremainderSize < remaindersSize) {
				maxremainderSize = remaindersSize;
				maxJ = divisor;
			}
		//	StdOut.println();
		}
		StdOut.println(maxJ);	
	//	StdOut.println("\t\t\ttime:" + stopwatch.elapsedTime());	
	}
}