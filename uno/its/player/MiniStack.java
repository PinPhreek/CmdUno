package uno.its.player;

import java.util.*;

import uno.its.card.Card;
import uno.its.main.Main;

public class MiniStack {

	private List<Card> pStack = new ArrayList<Card>();
	private List<Integer> buf = new ArrayList<Integer>();
	
	public MiniStack() {
		
	}
	public void setCards(Card[] cards) {
		
		for(Card c : cards) {
			pStack.add(c);
		}
		
	}
	public ArrayList<Card> getMiniStack() {
		return  (ArrayList<Card>) pStack;
	}
	public Card getCard(Card c) {
		if(pStack.contains(c)) {
			for (int i = 0; i < pStack.size(); i++) {
				if(pStack.get(i).equals(c)) {
					Card r = pStack.get(i);
					pStack.remove(i);
					return r;
				}
			}
		}
		return new Card(Card.EMPTY, 1);
	}
	public void newGame() {
		pStack.clear();
	}
	public void printStack(Card now) {
		int j = 0;
		for(int i = 0; i < pStack.size(); i++) {
	
			buf.clear();
			if (Main.canPlay(pStack.get(i), now)) {
				j++;
				System.out.println(j + ": " + pStack.get(i).toString());
				buf.add(j);
			}
			else {
				System.out.println("   " + pStack.get(i).toString());
				buf.add(0);
			}
		}
		Main.max_choices = j;
	}
	public Card getCard(int choice) {
		
		for(int i = 0; i < buf.size(); i++) {
			if(buf.get(i) == choice) {
				Card c = pStack.get(i);
				pStack.remove(i);
				buf.remove(i);
				return c;
			}
		}
		return new Card();
		
	}
	public boolean isEmpty() {
		return pStack.isEmpty();
	}
	public void addCard(Card c) {
		if(c.getFarbe() != Card.EMPTY)
			pStack.add(c);
	}
}
