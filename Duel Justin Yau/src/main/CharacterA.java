package main;

public class CharacterA implements Dueler {
	
	private String[] taunts = {"Come and shoot me!", ""};
	
	public void taunt() {
		System.out.println("");
	}
	
	public String getName() {
		return "Justin";
	}
	
	public void setStartingHP(int hp) {
		
	}
	
	public int getHP() {
		return 0;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp)
	{
		return true;
	}
	
}
