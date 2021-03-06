import java.util.ArrayList;
import java.util.HashMap;

public class Hand {

	private ArrayList<Card> cards=new ArrayList();
	public Hand() {
	}

	public String type(String hand) throws InvalidHandException {
		String[] cardStrings=hand.split(" ");
		if (cardStrings.length==4) {
			throw new InvalidHandException("A Hand is invalid if its not 5 cards");
		}
		
		for(String cardString: cardStrings) {
			cards.add(new Card(cardString));
		}
		
		SuitCounter suitCounter=new SuitCounter(cards);
		int maxSuits=suitCounter.max();
		if (maxSuits==5) {
			return "Flush";
		}
		
		
		ComboCounter comboCounter=new ComboCounter(cards);
		int maxCombo=comboCounter.max();
		switch(maxCombo) {
			case 4:
				return "Four of a kind";
			case 3:
				return "Three of a kind";
		}		
		return "One pair";
	}

	
}
