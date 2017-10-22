import java.math.*;

public class Problem016 {
	public static void main(String args[]) {
		
		BigInteger a = new BigInteger("2");
		a=a.pow(1000);
		String result = a.toString();
		int sum = 0;
		for (int i = 0; i < result.length(); i++) {
			sum += (int)(result.charAt(i)-'0');	
		}
		System.out.println(sum); 

	}
}