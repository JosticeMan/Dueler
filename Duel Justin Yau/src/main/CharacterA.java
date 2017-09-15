package main;

public class CharacterA implements Dueler {
	
	private int hp = 0;
	
	public CharacterA() {
	
	}
	
	public void taunt() {
		
		System.out.println("You will never shoot me!");
	}
	
	public String getName() {
		
		return "Justin";
	}
	
	public void setStartingHP(int hp) {
		
		if(this.hp == 0) {
			this.hp = hp;
		}
		
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return d.getHP() == hp;
	}
	
	public int getAction(Object caller) {
		if(caller instanceof CharacterB)
		{
			return 3;
		}
		else
		{
			int random = (int) (Math.random() * 3);
			return random;
		}
		
	}
	
	public void hit(Object caller) {
		if(caller instanceof Duel) {
			hp = hp - 10;
		}
	}
	
}
