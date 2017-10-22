public class Problem014 {
	public static void main(String args[]) {
		//System.out.println(b);
		
		Stopwatch stopwatch = new Stopwatch();
		//System.out.println(Long.MAX_VALUE);
		Collatz collatz = new Collatz();
		int max = 0;
		int number = 0;
		for(int i = 1; i <= 1000000; i++) {
			int temp = collatz.calculate(i,0);
			if (max < temp) {
				max = temp;
				number = i;
			}
		}
		System.out.format("Number:%d - %d steps%n",number,max);
		//	System.out.format("%06d: %d %n",i,collatz.calculate(i,0));
		//collatz.printAllRoutes();
		//collatz.printMax();
	}

}