import java.math.*;


public class Problem048 {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		for (int i = 1; i <= 1000; i++) {
			if (i % 50 == 0) 
				StdOut.printf("%d%%%n",i/10);
			BigInteger current =  BigInteger.valueOf(i);
			sum = sum.add(current.pow(i));
			//for (int j = 1; j <= i; j++) {
			//	temp *= i;
			//}
			//sum += temp;
		}
		String result = sum.toString();
		StdOut.printf("%s%n",result.substring(result.length()-10,result.length()));
	}

}