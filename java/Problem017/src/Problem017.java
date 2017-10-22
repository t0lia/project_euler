public class Problem017 {
	public static String digitToString(int src) {
		int number = src;
		String str = "";
		if (number == 1000)
			return "onethousand";

		if (number / 100 % 10 == 1)
			str += "onehundred";
		if (number / 100 % 10 == 2)
			str += "twohundred";
		if (number / 100 % 10 == 3)
			str += "threehundred";
		if (number / 100 % 10 == 4)
			str += "fourhundred";
		if (number / 100 % 10 == 5)
			str += "fivehundred";
		if (number / 100 % 10 == 6)
			str += "sixhundred";
		if (number / 100 % 10 == 7)
			str += "sevenhundred";
		if (number / 100 % 10 == 8)
			str += "eighthundred";
		if (number / 100 % 10 == 9)
			str += "ninehundred";

		if (number / 100 % 10 != 0 && number % 100 != 0)
			str += "and";
		if (number % 100>=10 && number % 100<20) {
			if (number % 100 == 10)
				str += "ten";
			if (number % 100 == 11)
				str += "eleven";
			if (number % 100 == 12)
				str += "twelve";
			if (number % 100 == 13)
				str += "thirteen";
			if (number % 100 == 14)
				str += "fourteen";
			if (number % 100 == 15)
				str += "fifteen";
			if (number % 100 == 16)
				str += "sixteen";
			if (number % 100 == 17)
				str += "seventeen";
			if (number % 100 == 18)
				str += "eighteen";
			if (number % 100 == 19)
				str += "nineteen";
		}
		else {
			if ((number / 10) % 10 == 2)
				str += "twenty";
			if ((number / 10) % 10 == 3)
				str += "thirty";
			if ((number / 10) % 10 == 4)
				str += "forty";
			if ((number / 10) % 10 == 5)
				str += "forty";
			if ((number / 10) % 10 == 6)
				str += "sixty";
			if ((number / 10) % 10 == 7)
				str += "seventy";
			if ((number / 10) % 10 == 8)
				str += "eighty";
			if ((number / 10) % 10 == 9)
				str += "ninety";

			if (number % 10 == 1)
				str += "one";
			if (number % 10 == 2)
				str += "two";
			if (number % 10 == 3)
				str += "three";
			if (number % 10 == 4)
				str += "four";
			if (number % 10 == 5)
				str += "five";
			if (number % 10 == 6)
				str += "six";
			if (number % 10 == 7)
				str += "seven";
			if (number % 10 == 8)
				str += "eight";
			if (number % 10 == 9)
				str += "nine";
		}
	return str;
	}
	public static int calculateLetterCount(int src) {


		return 0;
	}
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			StdOut.printf("%s - %d%n",digitToString(i),digitToString(i).length());
			sum += digitToString(i).length();
		}
		StdOut.printf("result: %d%n", sum);
	}
}