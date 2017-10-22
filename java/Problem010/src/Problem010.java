public class Problem010 {
	public static void main(String args[]) {
		Prime primeGenerator = new Prime();
		
		Stopwatch stopwatch = new Stopwatch();
		
		primeGenerator.generateMax(2000000);
//		primeGenerator.generate(1000000, 400);

		double time = stopwatch.elapsedTime();
	//	System.out.println(time);
		
		primeGenerator.printCurrentSequence();
//		System.out.println(primeGenerator.getCurrentSequence().length);
		long primes[] = primeGenerator.getCurrentSequence();
		long sum = 0;


		for (int i = 0; i < primes.length && primes[i] < 2000000; i++) {
			sum += primes[i];
		}
		System.out.println("sum: " + sum);

	}
}