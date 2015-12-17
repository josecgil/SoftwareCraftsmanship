import static org.junit.Assert.*;

import org.junit.Test;

public class KataRangeTest {

	@Test
	public void test() {
		//allPoints()
		
		//arrange
		Range range=new Range("[1,1]");
		//act
		boolean result=range.contains("{1}");
		//assert
		assertEquals(true, result);
		
		assertEquals("{2,3,4,5}", "[2,6)");		
		assertEquals("{2,3,4,5,6}", "[2,6]");
	}

}
