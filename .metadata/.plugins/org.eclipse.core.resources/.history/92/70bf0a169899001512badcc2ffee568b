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

	@Test
	public void IsOnePair() {
		Hand hand=new Hand("3♣ 3♦ 4♠ 7♥ 9♥");
		assertEquals("One pair", hand.type());
	}

	@Test
	public void IsFlush() {
		Hand hand=new Hand("2♦ 3♦ 4♦ 7♦ 9♦");
		assertEquals("Flush", hand.type());
	}

	
	
	
}
