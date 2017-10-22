public class Problem042 {
	public void run() {
		String[] words = extractWords();
		boolean[] triangleNumbers = generateTriangle(300);
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (triangleNumbers[weight(words[i])]) {
				count++;
			}
		}
		StdOut.println(count);
	}
	public boolean[] generateTriangle(int max) {
		boolean[] triangleNumbers = new boolean[max];

		for (int i = 0 ;i < max; i++) {
			triangleNumbers[i] = false;
		}

		for (int i = 1 ;i*(i+1)/2 < max ; i++) {
			triangleNumbers[i*(i+1)/2] = true;
		}
		return triangleNumbers;
	}
	public int weight(String s) {
		int w = 0;
		for(int i = 0; i < s.length(); i++) {
			w += s.charAt(i) - 'A' + 1;
		}
		return w;
	}
	public String[] extractWords() {
		In in = new In("ext/words.txt");
		String s = in.readString();
		String[] words = s.split("\",\"");
		words[0] = words[0].substring(1);
		words[words.length-1] = words[words.length-1].substring(0,words[words.length-1].length()-1);
		return words;
	}
	public static void main(String[] args) {
		Problem042 problem = new Problem042();
		problem.run();
	}
}