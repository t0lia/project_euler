import java.math.*;

public class Problem025 {
	public static void main(String args[]) {
		fib(1000); 
	}
	public static int fib(int digitCount) {
		BigInteger a = new BigInteger("1"), b = new BigInteger("1");
		for (int i = 1 ;; i++) {
			if (a.toString().length() == digitCount) {
				StdOut.printf("%d-th %n",i );
				break;
			}
			BigInteger temp = new BigInteger(a.toString());
			a = b;
			b = b.add(temp);
		}
		return 0;
	}
}
