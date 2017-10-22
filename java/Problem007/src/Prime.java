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

	public void generate(int count) {
		size = 10;
		a = new long[count];
		a[0] = 2;
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		a[4] = 11;
		a[5] = 13;
		a[6] = 17;
		a[7] = 19;
		a[8] = 23;
		a[9] = 29;

		long current = 30;
		while(size < count) {
			boolean flag = false;
			for (int i = 0; i < size; i++) {
				if (current % a[i] == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				a[size] = current;
				size++;

			}
			else 
				current++;

		}
	}
	public void printCurrentSequence() {
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
	}
	public static long getFirst() {
		return 2;
	}
	public long[] getCurrentSequence() {
		return a;
	}

}