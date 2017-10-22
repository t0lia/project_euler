
import java.util.HashSet;
import java.util.Set;

public class Problem032 {

	public boolean isPandigital(String input) {
		
		for (int i = 0; i < input.length() - 1; i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	public void run() {
		int a, b, c;
		String s;
     	Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		
		for (a = 2; a < 5000; a++) {
			for (b = 2; b < 5000; b++) {
				c = a * b;
				s = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
				if (a % 10 == 0 || b % 10 == 0) {
					continue;
				}
				if (s.length() != 9) {
					continue;
				}
				if (s.contains("0")) {
					continue;
				}
				if (isPandigital(s)) {
					set.add(c);
				}
			}
		}
		for (int i : set) {
            sum += i;
        }
		StdOut.println(sum);
	}
	public static void main (String[] args){
		Problem032 problem = new Problem032();
		problem.run();
	}
}