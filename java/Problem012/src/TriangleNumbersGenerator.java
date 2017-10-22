public class TriangleNumbersGenerator {
	public int current;
	public int sum;
	TriangleNumbersGenerator() {
		current = 1;
		sum = 1;
	}
	public int next(){
		return sum += ++current;
	}
}