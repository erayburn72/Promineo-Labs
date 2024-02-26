package week05;

import java.util.ArrayList;
import java.util.List;

public class Player {

	int pos;
	String name;
	List<Card> hand = new ArrayList<Card>();

	public Player(int pos, String name, List<Card> hand) {
		this.pos = pos;
		this.name = name;
		this.hand = hand;
		
		
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}
