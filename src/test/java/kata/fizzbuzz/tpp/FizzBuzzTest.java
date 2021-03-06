package kata.fizzbuzz.tpp;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void returnNumberByDefault() {
		assertEquals("1", FizzBuzz.say(1));
		assertEquals("2", FizzBuzz.say(2));
	}
	
	@Test
	public void returnFizzWhenNumberDivide3() {
		assertEquals("Fizz", FizzBuzz.say(3));
		assertEquals("Fizz", FizzBuzz.say(6));
	}
	
	@Test
	public void returnBuzzWhenNumberDivide5() {
		assertEquals("Buzz", FizzBuzz.say(5));
		assertEquals("Buzz", FizzBuzz.say(10));
	}
	
	@Test
	public void returnFizzBuzzWhenNumberDivide3And5() {
		assertEquals("FizzBuzz", FizzBuzz.say(15));
	}
	
	@Test
	public void returnByeByeWhenNumberDivide7() {
		assertEquals("ByeBye", FizzBuzz.say(7));
	}

}
