import java.util.ArrayList;
import java.util.HashMap;

public class ComboCounter {
	private HashMap<String, Integer> cardCounter=new HashMap<String, Integer>();

	public ComboCounter(ArrayList<Card> cards) {
		for(Card card: cards) {
			String rank=card.rank();
			if (!cardCounter.containsKey(rank)) {
				cardCounter.put(rank,1);
			} else {
				int counter=cardCounter.get(rank);
				counter++;
				cardCounter.put(rank, counter);
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
