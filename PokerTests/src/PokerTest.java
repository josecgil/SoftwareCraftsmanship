import static org.junit.Assert.*;

import org.junit.Test;

public class PokerTest {

	@Test
	public void IsFourOfAKindWithOnlyNumbers() {
		Hand hand=new Hand("4♣ 4♦ 4♠ 4♥ 10♥");
		assertEquals("Four of a kind", hand.type());
	}

	@Test
	public void IsThreeOfAKindWithOnlyNumbers() {
		Hand hand=new Hand("4♣ 4♦ 4♠ 9♦ 10♥");
		assertEquals("Three of a kind", hand.type());
	}

	
}
