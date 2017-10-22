public class Problem031 {
	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		int counter = 0;

		for (int i = 0; i <= 200; i += 200) {
			for (int j = 0; j + i <= 200; j += 100) {
				for (int k = 0; k + j + i <= 200; k += 50) {
					for (int l = 0; l + k + j + i <= 200; l += 20) {
						for (int m = 0; m + l + k + j + i <= 200; m += 10) {
							for (int n = 0; n + m + l + k + j + i <= 200; n += 5) {
								for (int o = 0; o + n + m + l + k + j + i <= 200; o += 2) {
									for (int p = 0; p + o + n + m + l + k + j + i <= 200; p += 1) {
										if (i + j + k + l + m + n + o + p == 200) {
											counter++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		StdOut.println(counter);
		StdOut.printf("elapsed time: " + stopwatch.elapsedTime() + " ms%n");
	}
}