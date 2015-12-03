import static org.junit.Assert.*;

import org.junit.*;

public class PokerTest {
	private Hand hand;
	
	@Before
	public void setupHand() {
		hand=new Hand();
	}
	
	@Test(expected=InvalidHandException.class)
	public void ThrowsErrorIfThereAre4Cards() throws InvalidHandException {
		hand.type("1♦ 1♠ 1♥ 10♥");
	}
	
	
	@Test
	public void IsFourOfAKindWithOnes() throws InvalidHandException {
		assertEquals("Four of a kind", hand.type("1♣ 1♦ 1♠ 1♥ 10♥"));
	}

	@Test
	public void IsFourOfAKindWithTwos() throws InvalidHandException {
		assertEquals("Four of a kind", hand.type("2♣ 2♦ 2♠ 2♥ 10♥"));
	}
	
	@Test
	public void IsThreeOfAKindWithFives() throws InvalidHandException {
		assertEquals("Three of a kind", hand.type("5♣ 5♦ 5♠ 9♥ 10♥"));
	}

	
	@Test
	public void IsThreeOfAKindWithOnlyNumbers() throws InvalidHandException {
		assertEquals("Three of a kind", hand.type("4♣ 4♦ 4♠ 9♦ 10♥"));
	}

	@Test
	public void IsOnePair() throws InvalidHandException {
		assertEquals("One pair", hand.type("3♣ 3♦ 4♠ 7♥ 9♥"));
	}

	@Test
	public void IsFlush() throws InvalidHandException {
		assertEquals("Flush", hand.type("2♦ 3♦ 4♦ 7♦ 9♦"));
	}

	
	
	
}
