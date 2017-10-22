public class Problem007 {
	public static void main(String args[]) {
		Prime prime = new Prime();
		prime.generate(10001);
		long a[];
		a = prime.getCurrentSequence();
		for (int i = 0; i < a.length; i++)
			System.out.println("" + (i + 1) + ": " + a[i]);	
		
	}
}