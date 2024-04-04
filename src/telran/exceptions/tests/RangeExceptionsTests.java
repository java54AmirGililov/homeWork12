package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import telran.exceptions.NumberGreaterRangeMaxException;
import telran.exceptions.NumberLessRangeMinException;
import telran.exceptions.RangeExceptions;

class RangeExceptionsTests {

	@Test
	@DisplayName("Test of the method factoryMethod")
	void factoryMethodTest() throws NumberGreaterRangeMaxException,
	NumberLessRangeMinException {
		RangeExceptions range = RangeExceptions.getRangeExceptions(3,30);
		assertThrowsExactly(IllegalArgumentException.class,
				() -> RangeExceptions.getRangeExceptions(30,3));
		range.checkNumber(5);
		assertThrowsExactly(NumberGreaterRangeMaxException.class,
				() -> range.checkNumber(35));
		assertThrowsExactly(NumberLessRangeMinException.class,
				() -> range.checkNumber(2));
		
	}
}
