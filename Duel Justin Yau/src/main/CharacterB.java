package main;

public class CharacterB implements Dueler {

	public void taunt() {
		System.out.println("");
	}
	
	public String getName() {
		return "Sunny";
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
