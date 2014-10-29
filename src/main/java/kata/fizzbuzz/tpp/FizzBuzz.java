package kata.fizzbuzz.tpp;

public class FizzBuzz {

	public static String say(int number) {
		String result = "";
		for(Rules rule : Rules.values()) {
			result = rule.getResult(number, result);
		}
		return result;
	}

}
