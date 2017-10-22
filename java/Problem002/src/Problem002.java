public class Problem002 {
	public static long resolve(long upperBound) {
		int first 	= 1;
		int second 	= 2;
		int sum = 0;
		while (second < upperBound) {
			//System.out.print("\t" + second);
			if (second % 2 == 0)
				sum += second;
			int temp = first + second;
			first = second;
			second = temp;
		}
		//System.out.println("");
		return sum;
	}
	public static void main(String args[]) {
		System.out.println(resolve(4000000));
	}
}