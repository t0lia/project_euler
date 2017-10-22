public class Problem036{
	public static boolean isDecPalindrome(int input) {
		int reverseInput = 0;
		for (int i = input;i != 0; i /= 10) {
			reverseInput *= 10;
			reverseInput += i % 10;
		}
		return reverseInput == input;
	}
	public static boolean isBinPalindrome(int input) {
		int candidate = input;
		int[] hex = new int[32];
		int length = 0;
		for (int i = input; i > 0; i = i>>1) {
			if (i % 2 == 0)
				hex[length] = 0;
			else
				hex[length] = 1;
			length++;
		}
		boolean isPalindrome = true;
		for (int i = length - 1; i >= 0; i--) {
			if (hex[i] != hex[length-i-1]) 
				isPalindrome = false;
		}
		return isPalindrome;
	}
	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		int sum = 0;

		for (int i = 1; i < 1000000; i++) {
			if(isDecPalindrome(i) && isBinPalindrome(i)) {
//				StdOut.println(i);
				sum += i;
			}
		}
		StdOut.println(sum);	
//		StdOut.println("\t\t\t" + stopwatch.elapsedTime());	
	}
}