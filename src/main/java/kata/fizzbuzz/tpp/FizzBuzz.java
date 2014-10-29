package kata.fizzbuzz.tpp;


public class FizzBuzz {

	public static String say(int number) {
		String result = String.valueOf(number);
		if(isFizz(number))
			result += "Fizz";
		return result;
	}

	private static boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private static boolean isFizz(int number) {
		return number % 3 == 0;
	}

}
