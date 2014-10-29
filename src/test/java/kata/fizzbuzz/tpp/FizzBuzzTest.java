package kata.fizzbuzz.tpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void returnNumberByDefault() {
		assertEquals("1", FizzBuzz.say(1));
	}

}
