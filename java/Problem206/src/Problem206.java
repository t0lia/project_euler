public class Problem206 {
	public static void main(String[] args) {
		long a = 143000000l;
		for (long i = 100000000l; i < 143000000l; i++) {
			long square = i * i;
			if (		square / 1l % 10 == 9 
					&&  square / 100l % 10 == 8
					&&  square / 10000l % 10 == 7
					&&  square / 1000000l % 10 == 6
					&&  square / 100000000l % 10 == 5
					&&  square / 10000000000l % 10 == 4
					&&  square / 1000000000000l % 10 == 3
					&&  square / 100000000000000l % 10 == 2) {
				StdOut.println(i * 10);
				StdOut.println(i * i * 100);
			}
		}
		StdOut.println("1_2_3_4_5_6_7_8_900");
	}
}