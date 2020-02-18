package uno.its.card;

import java.util.Random;

public class Stack {

	Card[] stack = new Card[108];
	Random r = new Random();

	public Stack() {
		generateStack();
	}

	private void generateStack() {

		/*INIT*/
		for(int i = 0; i < stack.length; i++) {
			stack[i] = new Card(Card.EMPTY, 1);
		}
		
		/* +4 */
		int zahl = 0;
		for (int i = 0; i < 4; i++) {

			do {
				zahl = r.nextInt(stack.length);

				if (stack[zahl].getFarbe() == Card.EMPTY) {
					stack[zahl] = new Card(Card.BLACK, Card.WISH_DRAW4_CARD);// muss nicht funktionieren
					break;
				}
			} while (true);

		}
		/* Wünsche */
		for (int i = 0; i < 4; i++) {

			do {
				zahl = r.nextInt(stack.length);

				if (stack[zahl].getFarbe() == Card.EMPTY) {
					stack[zahl] = new Card(Card.BLACK, Card.WISH_CARD);// muss nicht funktionieren
					break;
				}
			} while (true);

		}
		/* +2 */
		for (int i = 0; i < 8; i++) {

			do {

				zahl = r.nextInt(stack.length);

				if (stack[zahl].getFarbe() == Card.EMPTY) {

					if (i < 2) {
						stack[zahl] = new Card(Card.YELLOW, Card.DRAW2_CARD);
					} else if (i < 4) {
						stack[zahl] = new Card(Card.GREEN, Card.DRAW2_CARD);
					} else if (i < 6) {
						stack[zahl] = new Card(Card.BLUE, Card.DRAW2_CARD);
					} else if (i < 8) {
						stack[zahl] = new Card(Card.RED, Card.DRAW2_CARD);
					}
					break;
				}

			} while (true);

		}
		/* Aussetzen */
		for (int i = 0; i < 8; i++) {

			do {

				zahl = r.nextInt(stack.length);

				if (stack[zahl].getFarbe() == Card.EMPTY) {

					if (i < 2) {
						stack[zahl] = new Card(Card.YELLOW, Card.SUSPEND_CARD);
					} else if (i < 4) {
						stack[zahl] = new Card(Card.GREEN, Card.SUSPEND_CARD);
					} else if (i < 6) {
						stack[zahl] = new Card(Card.BLUE, Card.SUSPEND_CARD);
					} else if (i < 8) {
						stack[zahl] = new Card(Card.RED, Card.SUSPEND_CARD);
					}
					break;
				}

			} while (true);

		}
		/* Richtungswechsel */
		for (int i = 0; i < 8; i++) {

			do {

				zahl = r.nextInt(stack.length);

				if (stack[zahl].getFarbe() == Card.EMPTY) {

					if (i < 2) {
						stack[zahl] = new Card(Card.YELLOW, Card.REVERSE_CARD);
					} else if (i < 4) {
						stack[zahl] = new Card(Card.GREEN, Card.REVERSE_CARD);
					} else if (i < 6) {
						stack[zahl] = new Card(Card.BLUE, Card.REVERSE_CARD);
					} else if (i < 8) {
						stack[zahl] = new Card(Card.RED, Card.REVERSE_CARD);
					}
					break;
				}

			} while (true);

		}
		for (int i = 0; i < 19; i++) {

			do {
				zahl = r.nextInt(stack.length);
				if (stack[zahl].getFarbe() == Card.EMPTY) {
					if (i == 0) {
						stack[zahl] = new Card(Card.BLUE, i);
					}
					else if (i < 3) {
						stack[zahl] = new Card(Card.BLUE, 1);
					}
					else if (i < 5) {
						stack[zahl] = new Card(Card.BLUE, 2);
					}
					else if (i < 7) {
						stack[zahl] = new Card(Card.BLUE, 3);
					} 
					else if (i < 9) {
						stack[zahl] = new Card(Card.BLUE, 4);
					}
					else if (i < 11) {
						stack[zahl] = new Card(Card.BLUE, 5);
					}
					else if (i < 13) {
						stack[zahl] = new Card(Card.BLUE, 6);
					}
					else if (i < 15) {
						stack[zahl] = new Card(Card.BLUE, 7);
					}
					else if (i < 17) {
						stack[zahl] = new Card(Card.BLUE, 8);
					} 
					else if (i < 19) {
						stack[zahl] = new Card(Card.BLUE, 9);
					}
					break;
				}
			} while (true);
		}
		
		for (int i = 0; i < 19; i++) {

			do {
				zahl = r.nextInt(stack.length);
				if (stack[zahl].getFarbe() == Card.EMPTY) {
					if (i == 0) {
						stack[zahl] = new Card(Card.RED, i);
					}
					else if (i < 3) {
						stack[zahl] = new Card(Card.RED, 1);
					}
					else if (i < 5) {
						stack[zahl] = new Card(Card.RED, 2);
					}
					else if (i < 7) {
						stack[zahl] = new Card(Card.RED, 3);
					} 
					else if (i < 9) {
						stack[zahl] = new Card(Card.RED, 4);
					}
					else if (i < 11) {
						stack[zahl] = new Card(Card.RED, 5);
					}
					else if (i < 13) {
						stack[zahl] = new Card(Card.RED, 6);
					}
					else if (i < 15) {
						stack[zahl] = new Card(Card.RED, 7);
					}
					else if (i < 17) {
						stack[zahl] = new Card(Card.RED, 8);
					} 
					else if (i < 19) {
						stack[zahl] = new Card(Card.RED, 9);
					}
					break;
				}
			} while (true);
		}
		for (int i = 0; i < 19; i++) {

			do {
				zahl = r.nextInt(stack.length);
				if (stack[zahl].getFarbe() == Card.EMPTY) {
					if (i == 0) {
						stack[zahl] = new Card(Card.GREEN, i);
					}
					else if (i < 3) {
						stack[zahl] = new Card(Card.GREEN, 1);
					}
					else if (i < 5) {
						stack[zahl] = new Card(Card.GREEN, 2);
					}
					else if (i < 7) {
						stack[zahl] = new Card(Card.GREEN, 3);
					} 
					else if (i < 9) {
						stack[zahl] = new Card(Card.GREEN, 4);
					}
					else if (i < 11) {
						stack[zahl] = new Card(Card.GREEN, 5);
					}
					else if (i < 13) {
						stack[zahl] = new Card(Card.GREEN, 6);
					}
					else if (i < 15) {
						stack[zahl] = new Card(Card.GREEN, 7);
					}
					else if (i < 17) {
						stack[zahl] = new Card(Card.GREEN, 8);
					} 
					else if (i < 19) {
						stack[zahl] = new Card(Card.GREEN, 9);
					}
					break;
				}
			} while (true);
		}
		for (int i = 0; i < 19; i++) {

			do {
				zahl = r.nextInt(stack.length);
				if (stack[zahl].getFarbe() == Card.EMPTY) {
					if (i == 0) {
						stack[zahl] = new Card(Card.YELLOW, i);
					}
					else if (i < 3) {
						stack[zahl] = new Card(Card.YELLOW, 1);
					}
					else if (i < 5) {
						stack[zahl] = new Card(Card.YELLOW, 2);
					}
					else if (i < 7) {
						stack[zahl] = new Card(Card.YELLOW, 3);
					} 
					else if (i < 9) {
						stack[zahl] = new Card(Card.YELLOW, 4);
					}
					else if (i < 11) {
						stack[zahl] = new Card(Card.YELLOW, 5);
					}
					else if (i < 13) {
						stack[zahl] = new Card(Card.YELLOW, 6);
					}
					else if (i < 15) {
						stack[zahl] = new Card(Card.YELLOW, 7);
					}
					else if (i < 17) {
						stack[zahl] = new Card(Card.YELLOW, 8);
					} 
					else if (i < 19) {
						stack[zahl] = new Card(Card.YELLOW, 9);
					}
					break;
				}
			} while (true);

		}
	}
	public Card[] getCards(int amount) {
		Card[] ret = new Card[amount];
		
		for(int i = 0; i < amount; i++) {
			ret[i] = stack[i];
		}
		
		for(int i = amount; i < stack.length; i++) {
			stack[i - amount] = stack[i];
		}
		
		for(int i = stack.length - 1; i > stack.length - amount; i--) {
			stack[i] = new Card(Card.EMPTY, 1);
		}
		return ret;
	}
}
