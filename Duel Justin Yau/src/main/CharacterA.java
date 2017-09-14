package main;

public class CharacterA implements Dueler {
	
	private int hp;
	
	public CharacterA() {
	
	}
	
	public void taunt() {
		
		System.out.println("You will never shoot me!");
	}
	
	public String getName() {
		return "Justin";
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp)
	{
		return d.getHP() == hp;
	}
	
}
