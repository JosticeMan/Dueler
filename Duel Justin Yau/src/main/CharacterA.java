package main;

public class CharacterA implements Dueler {
	
	private int hp = -1;
	
	public CharacterA() {
	
	}
	
	public void taunt() {
		
		System.out.println("You will never shoot me!");
	}
	
	public String getName() {
		
		return "Justin";
	}
	
	public void setStartingHP(int hp) {
		
		if(this.hp == -1) {
			this.hp = hp;
		}
		
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp)
	{
		return d.getHP() == hp;
	}
	
}
