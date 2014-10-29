package kata.fizzbuzz.tpp;

enum Rules {
	Fizz {
		public String getResult(int number, String result) {
			return result + (isFizz(number) ? "Fizz" : FizzBuzz.EMPTY_STRING);
		}

		private boolean isFizz(int number) {
			return number % 3 == 0;
		}
	},
	Buzz {
		public String getResult(int number, String result) {
			return result + (isBuzz(number) ? "Buzz" : FizzBuzz.EMPTY_STRING);
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