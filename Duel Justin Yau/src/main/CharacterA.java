package main;

public class CharacterA implements Dueler {
	
	public void taunt() {
		String theTaunt ;
		
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
