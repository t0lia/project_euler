/*************************************************************************
 *  Compilation:  javac Problem1.java
 *  Execution:    java Problem1 
 *  Data files:   
 *  
 *
 *************************************************************************/

public class Problem001 {
	public static int resolve(int upperBound) {
		if(upperBound < 2)
			throw new IllegalArgumentException();
		int i 	= 2;
		int sum = 0;
		for (i = 2; i < upperBound; i++) {
			if (i % 3 == 0 || i % 5 ==0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		System.out.println(resolve(1000));
	}
}