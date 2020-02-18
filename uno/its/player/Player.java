package uno.its.player;

public class Player {

	private String name = "Günther";
	public MiniStack stack = new MiniStack();
	
	public Player() {
		
	}
	public Player(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		if(name.length() > 0) {
			this.name = name;
		}
	}
	public String getName() {
		return this.name;
	}
	
}
