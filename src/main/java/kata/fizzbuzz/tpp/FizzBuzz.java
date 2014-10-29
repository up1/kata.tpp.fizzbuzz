package kata.fizzbuzz.tpp;

public class FizzBuzz {

	enum Rules {
		Fizz {
			public String getResult(int number, String result) {
				return result + (isFizz(number) ? "Fizz" : "");
			}

			private boolean isFizz(int number) {
				return number % 3 == 0;
			}
		},
		Buzz {
			public String getResult(int number, String result) {
				return result + (isBuzz(number) ? "Buzz" : "");
			}

			private boolean isBuzz(int number) {
				return number % 5 == 0;
			}
		},
		Other {
			public String getResult(int number, String result) {
				return (result.isEmpty()) ? String.valueOf(number) : result;
			}

		};
		public abstract String getResult(int number, String result);
	}

	public static String say(int number) {
		String result = "";
		result = Rules.Fizz.getResult(number, result);
		result = Rules.Buzz.getResult(number, result);
		result = Rules.Other.getResult(number, result);
		return result;
	}

}
