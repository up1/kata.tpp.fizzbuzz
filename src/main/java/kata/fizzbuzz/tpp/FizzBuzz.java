package kata.fizzbuzz.tpp;

public class FizzBuzz {

	public static String say(int number) {
		return other(number, buzzy(number, fizzy(number, "")));
	}

	private static String other(int number, String result) {
		return ( result.isEmpty() ? String.valueOf(number) : result );
	}

	private static String buzzy(int number, String result) {
		return result + ( isBuzz(number) ? "Buzz" : "" );
	}

	private static String fizzy(int number, String result) {
		return result + ( isFizz(number) ? "Fizz" : "" );
	}

	private static boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private static boolean isFizz(int number) {
		return number % 3 == 0;
	}

}
