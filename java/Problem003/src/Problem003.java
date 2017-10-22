/*************************************************************************
 *  Compilation:  javac Problem3.java
 *  Execution:    java Problem3
 *  Data files:   
 *  
 *
 *************************************************************************/

public class Problem003 {
	public static int resolve(int upperBound) {
		long a = 600851475143l;
		//System.out.println(a);
		Prime pr = new Prime();
		pr.generate(5000);
		long primes[];
		primes = pr.getCurrentSequence();



		for (int i = 0; i < primes.length; i++) {
			while(a % primes[i] == 0) {
				System.out.println(primes[i]);
				a /= primes[i];
			}
			if(a < 2) {
				System.out.println("====" + a);
				break;
			}
		}

		return 0;
	}
	public static void main(String args[]) {
		resolve(1000);
		//System.out.println(resolve(1000));
	}
}