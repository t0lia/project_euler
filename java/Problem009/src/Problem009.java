public class Problem009 {
	public static void main(String args[]) {
		long a, b;
		for (a = 0; a < 1000l; a++)
			for (b = 0; b < 1000l; b++) {
				if(a*a+b*b == (a+b-1000l)*(a+b-1000l)) {
					System.out.print(a+"\t");			
					System.out.print(b+"\t");	
					System.out.println(-(a+b-1000l));		
					System.out.println(a*b*(1000l-a-b));
				}
			}
		
	}
}