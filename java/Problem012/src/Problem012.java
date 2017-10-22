public class Problem012 {
	public static int getDelimiterCount(int source, long primes[]) {
		//primeGenerator.printCurrentSequence();
		

		int count = 0;
		int i = 0;
		int sum = 1;
		while( i != primes.length && primes[i] != 0) {
			
			if(source % primes[i] == 0) {
				count++;
				source /= primes[i];
			}
			else {
				sum *= count + 1;
				count = 0;
				i++;
				if(source == 1)
					break;
			}
		}
		
		//primeGenerator.printCurrentSequence();
		return sum;
		/*
		int count = 2;
		for (int i = 2; i < source / 2 + 1; i++) {
			if (source % i == 0) 
				count++;
		}
		return count;*/
	}
	public static void main(String args[]) {
		
		//StdOut.printf("%d%n", getDelimiterCount(21));
		Prime primeGenerator = new Prime();
		primeGenerator.generateMax(1000000);
		long primes[] = primeGenerator.getCurrentSequence();
		
		TriangleNumbersGenerator generator = new TriangleNumbersGenerator();
		int maxnumber = 0;
		int maxsize = 0;
		for (int i = 1;	; i++) {
			int temp = generator.next();
			int count = getDelimiterCount(temp,primes);
			if (maxsize < count) {
				maxsize = count;
				maxnumber = temp;
			}

			StdOut.printf("Triangle number % 8d have % 4d delimiters \t\t\t", temp, count);
			StdOut.printf("%d - %d%n", maxnumber, maxsize);

			if (count > 500) 
				break;
		}
	
		
	}
}