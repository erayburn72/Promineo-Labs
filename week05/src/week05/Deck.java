package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private final List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
	private final List<String> names = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Jack", "Queen", "King", "Ace");

	private List<Card> cards = new ArrayList<Card>();

	public Deck() {

		for (int pos = 0; pos < names.size(); pos++) {
			int value = pos + 1;
			String name = names.get(pos);

			for (String suit : suits) {
				Card card = new Card(name, suit, value);
				cards.add(card);
			}
		}
	}
	
	public void describe() {
		System.out.println("Deck of cards contains: ");
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
	}

	public void draw() {
		// TODO Auto-generated method stub
		
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public List<String> getSuits() {
		return suits;
	}

	public List<String> getNames() {
		return names;
	}

	
}
