package uno.its.main;

import java.util.Scanner;

import uno.its.card.Card;
import uno.its.card.Stack;
import uno.its.player.MiniStack;
import uno.its.player.Player;

public class Main {

	public static int max_choices = 0;
	public static Scanner sc = new Scanner(System.in);
	public static int i = 0;
	public static Stack stack = new Stack();
//	public static void main(String[] args) {

//		Stack stack = new Stack();
//		Scanner sc = new Scanner(System.in);
//		int tanken = 0;
//		
//		MiniStack done = new MiniStack();
//		
//		Card actualCard = new Card(Card.EMPTY, 1);
//		
//		/*Player*/
//		Player p1 = new Player();
//		Player p2 = new Player();
//		
//		System.out.print("Spieler 1: ");
//		p1.setName(sc.nextLine());
//		System.out.print("Spieler 2: ");
//		p2.setName(sc.nextLine());
//		
//		p1.stack.setCards(stack.getCards(7));
//		p2.stack.setCards(stack.getCards(7));
//		
//		actualCard = stack.getCards(1)[0]; //Startkarte
//		System.out.println("\nStartkarte: " + actualCard.toString());
//		
//		do {
//			
//			System.out.println(p1.getName() + " ist dran.");
//			p1.stack.printStack(actualCard);
//			do {
//				if(max_choices == 0) {
//					p1.stack.addCard(stack.getCards(1)[0]);
//					break;
//				}
//				System.out.print(">");
//				tanken = sc.nextInt();
//			} while (tanken > max_choices || tanken < 1);
//			if(tanken != 0) {
//				done.addCard(actualCard);
//				actualCard = p1.stack.getCard(tanken);
//			}else {
//				System.out.println("Du hast eine Karte gezogen.");
//			}
//			break;
//			
//		}while(!p1.stack.isEmpty() || !p2.stack.isEmpty());
//		
//		sc.close();
//	}
	public static void main(String[] args) {
		// Spieler erstellen
		int playercount = 0;
		do {
			System.out.print("Spieleranzahl: ");
			playercount = sc.nextInt();
			if (playercount < 5 && playercount > 1) {// ja hier geh ich dem user auf dem keks
				break;
			}
			System.out.println("Bitte eine Spieleranzahl von 2 - 4 wählen.");
		} while (true);// nicht mehr als 5 Spieler && nicht weniger als 2

		Player players[] = new Player[playercount];
		for (i = 0; i < players.length; i++) {// Namen eingeben
			System.out.printf("Spieler%2d: ", i + 2);
			players[i].setName(sc.nextLine());
		}

		// Kartenhand austeilen
		for (i = 0; i < players.length; i++) {
			players[i].stack.setCards(stack.getCards(7));
		}
		System.out.println("Everybody has their cards!");

		int given = 0; // Spieler 1 hat gegeben

		// ==============================================================================================
		// INIT DONE ||
		// ==============================================================================================

		do {

		} while (!isFinished(players));

		
		sc.close();
	}

	private static boolean isFinished(Player p[]) {

		for (i = 0; i < p.length; i++) {
			
			if(p[i].stack.getMiniStack().size() == 0) {//Gewinner!!!
				return true;
			}
			
		}
		return false;
		
	}

	public static boolean canPlay(Card c, Card nowCard) {
		if (c.getFarbe() == Card.BLACK || c.getZahl() == nowCard.getZahl() || c.getFarbe() == nowCard.getFarbe()) {
			return true;
		}
		return false;
	}

}
