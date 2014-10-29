package kata.fizzbuzz.tpp;


public class FizzBuzz {

	public static String say(int number) {
		if(number % 3 == 0)
			return "Fizz";
		return String.valueOf(number);
	}

}
