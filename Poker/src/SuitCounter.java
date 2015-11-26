import java.util.ArrayList;
import java.util.HashMap;

public class SuitCounter {
	private HashMap<String, Integer> cardCounter=new HashMap<String, Integer>();

	public SuitCounter(ArrayList<Card> cards) {
		for(Card card: cards) {
			String suit=card.suit();
			if (!cardCounter.containsKey(suit)) {
				cardCounter.put(suit,1);
			} else {
				int counter=cardCounter.get(suit);
				counter++;
				cardCounter.put(suit, counter);
			}
		}		
		
	}
	
	public int max() {
		int maxCombo=1;
		for(String rank: cardCounter.keySet()) {
			int counter=cardCounter.get(rank);
			if (counter>maxCombo) {
				maxCombo=counter;
			}
		}
		return maxCombo;
	}

}
