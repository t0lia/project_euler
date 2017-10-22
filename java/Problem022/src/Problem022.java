import java.util.Arrays;
public class Problem022 {
	public static int alphaValue(String in) {
		int sum = 0;
		for (int i = 0; i < in.length(); i++) {
			sum += in.charAt(i) - 'A' + 1;
		}
		return sum;
	}
	public static void main(String[] args) {
        // 	read in the input
        In in = new In("ext/names.txt");
        String s = in.readString();
        String[] array = s.split(",");
        //	remove quotes
        for( int i = 0; i < array.length; i++) {
        	array[i] = array[i].substring(1,array[i].length()-1);
        }

        Arrays.sort(array);
        long sum = 0;
        for( int i = 0; i < array.length; i++) {
        	sum += (i + 1) * alphaValue(array[i]);
    	}
/*
        for( int i = 0; i < array.length; i++) {
        	StdOut.println(array[i]);
    	}
  */
  		StdOut.println(sum);
	}
}