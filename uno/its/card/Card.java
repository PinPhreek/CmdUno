package uno.its.card;

public class Card {

	private int farbe, zahl;

	public Card(int farbe, int zahl) {
		setFarbe(farbe);
		setZahl(zahl);
	}
	public Card() {
		
	}

	public int getFarbe() {
		return farbe;
	}

	public void setFarbe(int farbe) {
		if (farbe < 6 && farbe > -1)
			this.farbe = farbe;
	}

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		if (zahl > 0 && zahl < 15)
			this.zahl = zahl;
	}
	
	@Override
	public String toString() {
		if(this.farbe == YELLOW) {
			return "\033[33mZ: " + this.zahl + " \033[0m";
		}
		else if(this.farbe == RED) {
			return "\u001B[31mZ: " + this.zahl + " \u001B[0m";
		}
		else if(this.farbe == GREEN) {
			return "\033[32mZ: " + this.zahl + " \033[0m";
		}
		else if(this.farbe == BLUE) {
			return "\033[34m" + "Z: " + this.zahl + " \033[0m";
		}
		return "Z: " + this.zahl;
	}
	
	public static final int EMPTY = 0;
	public static final int YELLOW = 1;
	public static final int RED = 2;
	public static final int GREEN = 3;
	public static final int BLUE = 4;
	public static final int BLACK = 5;

	public static final int REVERSE_CARD = 10;
	public static final int DRAW2_CARD = 11;
	public static final int WISH_CARD = 12;
	public static final int WISH_DRAW4_CARD = 13;
	public static final int SUSPEND_CARD = 14;

}
