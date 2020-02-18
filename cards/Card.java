package cards;

public class Card {
	
	private byte farbe = 0;
	private byte zahl = -1;
	
	public Card() {
		
	}

	public Card(byte farbe, byte zahl) {
		this.setFarbe(farbe);
		this.setZahl(zahl);
	}
	public byte getFarbe() {
		return farbe;
	}

	public void setFarbe(byte farbe) {
		if(farbe > 0)
			this.farbe = farbe;
	}

	public byte getZahl() {
		return zahl;
	}

	public void setZahl(byte zahl) {
		if(zahl > -2)
			this.zahl = zahl;
	}
	
	//Farben
	public static final byte RED = 1;
	public static final byte GREEN = 2;
	public static final byte BLUE = 3;
	public static final byte YELLOW = 4;
	public static final byte BLACK = 5;
	
	//Zahlen
	public static final byte DRAW2 = 10;
	public static final byte REVERSE = 11;
	public static final byte SKIP = 12;
	public static final byte DRAW4 = 13;
	public static final byte WISH = 14;
}
