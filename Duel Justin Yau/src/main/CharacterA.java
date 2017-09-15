package main;

public class CharacterA implements Dueler {
	
	private int hp = 0;
	private boolean loaded = false;
	
	public CharacterA() {
	
	}
	
	public void taunt() {
		
		System.out.println(this.getName() + ": You will never shoot me!");
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
			if(loaded) {
				int random = (int) (Math.random() * 2 + 1);
				if(random == 1) {
					loaded = false;
				}
				return random;
			}
			else
			{
				int random = (int) (Math.random() * 2);
				//This prevents the AI from shooting an unloaded gun which means it has more intelligence. 
				if(random == 1) {
					random = 2;
				}
				if(random == 0) {
					loaded = true;
				}
				return random;
			}
		}
		
	}
	
	public void hit(Object caller) {
		if(caller instanceof Duel) {
			hp = hp - 10;
		}
	}
	
}
