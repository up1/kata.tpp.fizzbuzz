package kata.fizzbuzz.tpp;


public class FizzBuzz {

	public static String say(int number) {
		if(isFizz(number) && isBuzz(number))
			return "FizzBuzz";
		if(isFizz(number))
			return "Fizz";
		if(isBuzz(number))
			return "Buzz";
		return String.valueOf(number);
	}

	private static boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private static boolean isFizz(int number) {
		return number % 3 == 0;
	}

}
