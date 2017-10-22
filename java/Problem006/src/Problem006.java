/*************************************************************************
 *  Compilation:  javac Problem6.java
 *  Execution:    java Problem6
 *  Data files:   
 *  
 *
 *************************************************************************/

public class Problem006 {
	public static int resolve(int upperBound) {
		return 0;
	}
	public static int sumOfSquare(int bound)
	{
		if (bound < 1)
			return 0;
		int sum = 0;
		for (int i = 0; i <= bound; i++)
			sum += i*i;
		return sum;
	}
	public static int squareOfSum(int bound)
	{
		if (bound < 1)
			return 0;
		int sum = 0;
		for (int i = 0; i <= bound; i++)
			sum += i;
		return sum*sum;
	}
	public static void main(String args[]) {
		int sum = sumOfSquare(100);
		int square = squareOfSum(100);
		System.out.println(sum);
		System.out.println(square);
		System.out.println(square-sum);

	}
}