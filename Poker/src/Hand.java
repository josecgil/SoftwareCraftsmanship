
public class Hand {

	private String hand;
	public Hand(String hand) {
		this.hand=hand;
	}

	public String type() {
		if (this.hand=="4♣ 4♦ 4♠ 9♦ 10♥") {
			return "Three of a kind";
		}
		return "Four of a kind";
	}

}