package kata.fizzbuzz.tpp;

enum Rules {
	Fizz {
		public String getResult(int number, String result) {
			return result + (isValid(number) ? "Fizz" : FizzBuzz.EMPTY_STRING);
		}

		@Override
		public boolean isValid(int number) {
			return number % 3 == 0;
		}
	},
	Buzz {
		public String getResult(int number, String result) {
			return result + (isValid(number) ? "Buzz" : FizzBuzz.EMPTY_STRING);
		}

		@Override
		public boolean isValid(int number) {
			return number % 5 == 0;
		}
	},
	ByeBye {
		public String getResult(int number, String result) {
			return result + (isValid(number) ? "ByeBye" : FizzBuzz.EMPTY_STRING);
		}

		@Override
		public boolean isValid(int number) {
			return number % 7 == 0;
		}
	},
	Other {
		public String getResult(int number, String result) {
			return (result.isEmpty()) ? String.valueOf(number) : result;
		}

		@Override
		public boolean isValid(int number) {
			return false;
		}

	};
	public abstract String getResult(int number, String result);

	public abstract boolean isValid(int number);
}