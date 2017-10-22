public class Problem040 {
	public static void main(String[] args) {
		int counter = 0;
		long a=0,b=0,c=0,d=0,e=0,f=0,h=0;
		for (long i = 1l; ; i++) {
			if (i < 10) {
				counter++;
			}
			else if (i < 100) {
				counter+=2;
			}
			else if (i < 1000) {
				counter+=3;
			}
			else if (i < 10000) {
				counter+=4;
			}
			else if (i < 100000) {
				counter+=5;
			}
			else if (i < 1000000) {
				counter+=6;
			}
			if (counter == 1 ) {
				StdOut.printf("%d:\t\t%d%n",counter,i%10);
				a = i%10;
			}
			if (counter == 11) {
				StdOut.printf("%d:\t\t%d%n",counter,i/10%10);
				b = i/10%10;
			}
			if (counter == 101) {
				StdOut.printf("%d:\t\t%d%n",counter,i/10%10);
				c=i/10%10;
			}
			if (counter == 1002) {
				StdOut.printf("%d:\t\t%d%n",counter,i/100%10);
				d=i/100%10;
			}
			if (counter == 10001) {
				StdOut.printf("%d:\t\t%d%n",counter,i/10%10);
				e=i/10%10;
			}
			if (counter == 100004) {
				StdOut.printf("%d:\t\t%d%n",counter,i/10000%10);
				f=i/10000%10;
			}
			if (counter > 1000000) {
				StdOut.printf("%d:\t%d%n",counter,i/100000%10);
				h=i/100000%10;
				break;
			}
		}
		
			StdOut.println(a * b * c * d * e * f * h);
		/*
		StdOut.println(s);
		StdOut.printf("%d:\t%c%n",1,		s.charAt(1));
		StdOut.printf("%d:\t%c%n",10,		s.charAt(10));
		StdOut.printf("%d:\t%c%n",100,		s.charAt(100));
		StdOut.printf("%d:\t%c%n",1000,		s.charAt(1000));
		StdOut.printf("%d:\t%c%n",10000,	s.charAt(10000));
		StdOut.printf("%d:\t%c%n",100000,	s.charAt(100000));
		StdOut.printf("%d:\t%c%n",1000000,	s.charAt(1000000));
		*/
	}
}