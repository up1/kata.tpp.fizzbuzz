package kata.fizzbuzz.tpp;

public class FizzBuzz {

	public static final String EMPTY_STRING = "";

	public static String say(int number) {
		String result = EMPTY_STRING;
		for(Rules rule : Rules.values()) {
			result = rule.getResult(number, result);
		}
		return result;
	}

}
