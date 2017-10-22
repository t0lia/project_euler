/*************************************************************************
 *  Compilation:  javac Problem3.java
 *  Execution:    java Problem3
 *  Data files:   
 *  
 *
 *************************************************************************/

public class Prime {
	long a[];
	int size;

	public void generateCount(int count) {
		size = 2;
		a = new long[count];
		a[0] = 2;
		a[1] = 3;
		long candidate = 5;
		while(size < count) {
			boolean isPrime = true;
			for (int i = 0; a[i]*a[i] <= candidate; i++) {
				if (candidate % a[i] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				a[size] = candidate;
				size++;

			}
			candidate+=2; 
		}
	}
		public void generateMax(int bound) {
		size = 2;
		a = new long[4];
		a[0] = 2;
		a[1] = 3;
		long candidate = 5;
		while (candidate < bound) {
			if (size > a.length-1) {
				long[] b = new long[a.length * 2];
				for (int i = 0; i < a.length; i++) {
					b[i] = a[i];
				}
				a = b;
			}


			boolean isPrime = true;
			for (int i = 0; a[i]*a[i] <= candidate; i++) {
				if (candidate % a[i] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				a[size] = candidate;
				size++;

			}
			candidate+=2; 
		}
	}
	public void printCurrentSequence() {
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + "\t");
			if (i % 15 == 0)
				System.out.println("");
		}
		System.out.println("");
	}
	public static long getFirst() {
		return 2;
	}
	public long[] getCurrentSequence() {
		return a;
	}

}