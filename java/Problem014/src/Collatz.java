public class Collatz {
	int a[];
	Collatz() {
		a = new int[2];
		a[1] = 1;
	}
	int get(int i) {
		return a[i];
	}
	int calculate(long index, int depth) {
		if (index < a.length && a[(int)index] != 0l) 
			return a[(int)index] - depth;
		if (index % 2 == 0) {
			int temp = calculate(index / 2, depth) + 1;
			if(index < a.length)
				a[(int)index] = temp;
			return temp - depth;
		}
		else {
			int temp = calculate(3 * index + 1, depth) + 1;
			if(index < a.length)
				a[(int)index] = temp;
			return temp - depth;
		}
		
	}
	void printAllRoutes() {
		for (int i = 0; i < a.length; i++) {
			System.out.print("" + i + ": " + a[i] + "\n");
			/*if(i % 10 == 0) {
				System.out.println();
			}*/

		}
		System.out.println();
	}
	void printMax() {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		System.out.println(max);
	}

}