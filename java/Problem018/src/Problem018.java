public class Problem018 {
	/*
		return level in piramid of current index
	*/
	public static int getLevel(int current) {
		int level = 0;
		int[] threshold = new int[]{0, 2, 5, 9, 14, 20, 27, 35, 44, 54, 65, 77, 90, 104, 119, 135, 152, 170, 189, 209, 230, 252, 275, 299, 324, 350, 377, 405, 434, 464, 495, 527, 560, 594, 629, 665, 702, 740, 779, 819, 860, 902, 945, 989, 1034, 1080, 1127, 1175, 1224, 1274, 1325, 1377, 1430, 1484, 1539, 1595, 1652, 1710, 1769, 1829, 1890, 1952, 2015, 2079, 2144, 2210, 2277, 2345, 2414, 2484, 2555, 2627, 2700, 2774, 2849, 2925, 3002, 3080, 3159, 3239, 3320, 3402, 3485, 3569, 3654, 3740, 3827, 3915, 4004, 4094, 4185, 4277, 4370, 4464, 4559, 4655, 4752, 4850, 4949};
		for (; level < threshold.length && threshold[level] < current; level++) {}
		return level+ 1;
	}
	/*
		recursive function. find weight to current using weight of right and left child.
	 	if weight of child is zero call function for child
	*/
	public static void findWeight(int current, int[] source, int[] weight) {
		int leftChildIndex, rightChildIndex;
		leftChildIndex 	= getLeftChildIndex(current);
		rightChildIndex = leftChildIndex + 1;
		if(weight[leftChildIndex] == 0) {
			findWeight(leftChildIndex, source, weight);
		} 
		if(weight[rightChildIndex] == 0) {
			findWeight(rightChildIndex, source, weight);
		} 


		weight[current] = weight[leftChildIndex];
		if (weight[rightChildIndex] > weight[current]) {
			weight[current] = weight[rightChildIndex];
		}
		weight[current] += source[current];
	}
	/*
		using for generate array that reffered array[LEVEL] = MAX_INDEX
	*/
	public static void generateThreshold() {
		int thr = 0;
		for (int i = 1; i < 100; i++) {
			thr += i;
			StdOut.printf("%d, ", thr-1);
		}
	}
	
	public static int getLeftChildIndex(int current) {
		return current + getLevel(current) ;
	}
/*
75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
*/
/*
							75
						  95  64
						17  47  82
					  18  35  87  10
					20  04  82  47  65
				  19  01  23  75  03  34
				88  02  77  73  07  63  67
			  99  65  04  28  06  16  70  92
  			41  41  26  56  83  40  80  70  33
		  41  48  72  33  47  32  37  16  94  29
		53  71  44  65  25  43  91  52  97  51  14
      70  11  33  28  77  73  17  78  39  68  17  57
    91  71  52  38  17  14  91  43  58  50  27  29  48
  63  66  04  68  89  53  67  30  73  16  69  87  40  31
04  62  98  27  23  09  70  98  73  93  38  53  60  04  23
*/

	public static void main(String args[]) {
		String s = "75 95 64 17 47 82 18 35 87 10 20 04 82 47 65 19 01 23 75 03 34 88 02 77 73 07 63 67 99 65 04 28 06 16 70 92 41 41 26 56 83 40 80 70 33 41 48 72 33 47 32 37 16 94 29 53 71 44 65 25 43 91 52 97 51 14 70 11 33 28 77 73 17 78 39 68 17 57 91 71 52 38 17 14 91 43 58 50 27 29 48 63 66 04 68 89 53 67 30 73 16 69 87 40 31 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 ";
		int[] source = new int[s.length() / 3];
		int[] weight = new int[s.length() / 3];
		for (int i = 0; i < source.length; i++) {
			source[i] = Integer.parseInt(s.substring(i * 3, i * 3 + 2));
		}
		for (int i = source.length - getLevel(source.length) + 1; i < source.length; i++) {
			weight[i] = source[i];
		}
		findWeight(0, source, weight);
		int[] threshold = new int[]{0, 2, 5, 9, 14, 20, 27, 35, 44, 54, 65, 77, 90, 104, 119, 135, 152, 170, 189, 209, 230, 252, 275, 299, 324, 350, 377, 405, 434, 464, 495, 527, 560, 594, 629, 665, 702, 740, 779, 819, 860, 902, 945, 989, 1034, 1080, 1127, 1175, 1224, 1274, 1325, 1377, 1430, 1484, 1539, 1595, 1652, 1710, 1769, 1829, 1890, 1952, 2015, 2079, 2144, 2210, 2277, 2345, 2414, 2484, 2555, 2627, 2700, 2774, 2849, 2925, 3002, 3080, 3159, 3239, 3320, 3402, 3485, 3569, 3654, 3740, 3827, 3915, 4004, 4094, 4185, 4277, 4370, 4464, 4559, 4655, 4752, 4850, 4949};
		int j = 0;
		for (int i = 0; i < source.length; i++) {
			if(threshold[j] == i -1) {
			//	StdOut.printf("%n");
				j++;
			}
			//StdOut.printf("% 4d ", source[i]);
		}
		StdOut.printf("%n");
		j = 0;
		for (int i = 0; i < source.length; i++) {
			if(threshold[j] == i - 1) {
			//	StdOut.printf("%n");
				j++;
			}
			//StdOut.printf("% 4d", weight[i]);
		}
		StdOut.printf("% 4d", weight[0]);
		StdOut.printf("%n");
		//generateThreshold();
		
	}
}