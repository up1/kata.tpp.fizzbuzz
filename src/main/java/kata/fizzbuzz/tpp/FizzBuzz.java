package kata.fizzbuzz.tpp;

public class FizzBuzz {

	public static final String EMPTY_STRING = "";

	static int[] firstNumber = { 3, 5, 15, 7 };
	static String[] firstResult = { "Fizz", "Buzz", "FizzBuzz", "ByeBye" };

	public static String say(int number) {
		String result = String.valueOf(number);

		for (int i = 0; i < firstNumber.length; i++) {
			if (isValid(number, i)) {
				result = firstResult[i];
			}
		}

		return result;
	}

	private static boolean isValid(int number, int i) {
		return number % firstNumber[i] == 0;
	}

}
