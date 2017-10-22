/*************************************************************************
 *  Compilation:  javac Problem4.java
 *  Execution:    java Problem3
 *  Data files:   
 *  
 *
 *************************************************************************/

public class Problem004 {
	public static int resolve(int upperBound) {
		return 0;
	}
	public static boolean isPalindrome(int candidate) {
		/*int a[];
		a = new int[100];
		int temp = candidate;
		int i = 0, j;
		for (j = 0; j < a.length && temp > 0; j++) {
			a[j] = temp % 10;
			temp /= 10;
		}
		j--;
		while(j > i) {
			if (a[i++] != a[j--])
				return false;
		}	
		return true;
		*/
/*
		if (candidate % 10 / 1 == candidate % 10000 / 1000 
			&& candidate % 100 / 10 == candidate % 1000 / 100 
			)
			return true;

		else 
			return false;

*/
		if (candidate % 10 / 1 == candidate % 1000000 / 100000 
			&& candidate % 100 / 10 == candidate % 100000 / 10000 
			&& candidate % 1000 / 100 == candidate % 10000 / 1000
			)
			return true;
		else 
			return false;
		
	}
	public static void main(String args[]) {
		//resolve(1000);
		//Stopwatch stopwatch = new Stopwatch();
		int max = 0;
		int count = 0;
		for (int i = 999; i > 900; i--) {
			for (int j = 999; j > 900; j-- ) {
				if(isPalindrome(i*j)) {
					System.out.println("" + i + "x" + j + "=" + i*j );
					if (max < i*j) {
						max = i*j;
					}
					else
						break;
				}
			}
		}
		System.out.println(max);
		//double time = stopwatch.elapsedTime();
		//System.out.println(time);
	}
}