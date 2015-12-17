import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DressMeForTheWeekTest {

	@Test
	public void test() {
		MockProductRepository mockProductRepository=new MockProductRepository();
		mockProductRepository.addProduct("111");
		
		DressMeForTheWeek dressMeForTheWeek=new DressMeForTheWeek(mockProductRepository);
		
		ArrayList<String> productIds= dressMeForTheWeek.findProducts(5);
		
		assertEquals(productIds.size(), 1);
		assertEquals(productIds.get(0), "111");
		
	}

}
