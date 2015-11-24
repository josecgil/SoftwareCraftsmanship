import static org.junit.Assert.*;

import org.junit.Test;

public class PokerTest {

	@Test
	public void IsFourOfAKindWithOnes() {
		Hand hand=new Hand("1♣ 1♦ 1♠ 1♥ 10♥");
		assertEquals("Four of a kind", hand.type());
	}

	@Test
	public void IsFourOfAKindWithTwos() {
		Hand hand=new Hand("2♣ 2♦ 2♠ 2♥ 10♥");
		assertEquals("Four of a kind", hand.type());
	}
	
	@Test
	public void IsThreeOfAKindWithFives() {
		Hand hand=new Hand("5♣ 5♦ 5♠ 9♥ 10♥");
		assertEquals("Three of a kind", hand.type());
	}

	
	@Test
	public void IsThreeOfAKindWithOnlyNumbers() {
		Hand hand=new Hand("4♣ 4♦ 4♠ 9♦ 10♥");
		assertEquals("Three of a kind", hand.type());
	}

	
}
