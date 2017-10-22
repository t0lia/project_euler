import java.math.BigInteger; 

public class Problem097 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("28433");
		BigInteger b = new BigInteger("2");
		BigInteger c = new BigInteger("7830457");
		BigInteger d = new BigInteger("1");
		String result = a.multiply(b.modPow(new BigInteger("7830457"),new BigInteger("10000000000"))).add(d).toString();
		StdOut.println(result.substring(result.length() - 10, result.length()));
	}
}