import java.util.Arrays;
public class Problem029 {
	public static String powToString(int i, int j) {
	//  pow of 2
		if (i == 4) {
			i = 2;
			j *= 2;
		}
		if (i == 8) {
			i = 2;
			j *= 3;
		}
		if (i == 16) {
			i = 2;
			j *= 4;
		}
		if (i == 32) {
			i = 2;
			j *= 5;
		}
		if (i == 64) {
			i = 2;
			j *= 6;
		}
	//	pow of 3
		if (i == 9) {
			i = 3;
			j *= 2;
		}
		if (i == 27) {
			i = 3;
			j *= 3;
		}
		if (i == 81) {
			i = 3;
			j *= 4;
		}
	//	pow of 5
		if (i == 25 ) {
			i = 5;
			j *= 2;
		}
	//	pow of 6
		if (i == 36) {
			i = 6;
			j *= 2;
		}
	//  pow of 7
		if (i == 49) {
			i = 7;
			j *= 2;
		}
	//  pow of 10
		if (i == 100) {
			i = 10;
			j *= 2;
		}
		return Integer.toString(i) + "^" + Integer.toString(j);
	}
	public static int distinctCount(String[] arr) {
		Arrays.sort(arr);
		int count = 0;
		String prevValue = "";
		for(int i = 0; i < arr.length; i++) {
			if (!prevValue.equals(arr[i])) {
				count++;
			}
			prevValue = arr[i];
		
		}
		return count;
	}
	public static void main(String[] args) {
				Stopwatch stopwatch = new Stopwatch();

		String[] arr = new String[99*99];
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j <= 100; j++) {
				arr[(i - 2) * 99 + j - 2] = powToString(i,j);
			}
		}
		//for(int i = 0; i < arr.length; i++) {
		//	StdOut.println(arr[i]);
		//}
		StdOut.println(distinctCount(arr));
		StdOut.println(stopwatch.elapsedTime());
	}
}