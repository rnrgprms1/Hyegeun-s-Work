package events.remote;

import coms362.cards.streams.Marshalls;
import model.Card;

public class HideCardRemote implements Marshalls {
	private Card c; 
	
	public HideCardRemote(Card c) {
		this.c = c;
	}
	public String marshall() {
		return String.format("allCards[%d].hideCard();", c.getId());
	}
	public String stringify() {
		return "HideCardRemote card = "+ c.getId();
	}

}
