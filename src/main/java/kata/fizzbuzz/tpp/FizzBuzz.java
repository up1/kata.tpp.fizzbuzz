package kata.fizzbuzz.tpp;


public class FizzBuzz {

	public static String say(int number) {
		String result = "";
		if(isFizz(number))
			result += "Fizz";
		if(isBuzz(number))
			result += "Buzz";
		if(result.isEmpty())
			result += String.valueOf(number);
		return result;
	}

	private static boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private static boolean isFizz(int number) {
		return number % 3 == 0;
	}

}
