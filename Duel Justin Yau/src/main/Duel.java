package main;

public class Duel {

	

	private Dueler d1;
	private Dueler d2;
	
	public static final String[] GLOBALTAUNTS = {"I dare you to shoot me!", "You have no chance!"};
	
	
	public static void main(String[] args){
		Duel duel = new Duel();
		duel.dukeItOut();
	}
	
	public Duel() {
		d1 = new CharacterA();
		d2 = new CharacterB();
	}
	
	public void dukeItOut(){
		
	}
	
	public class CharacterA implements Dueler {
		
		public void taunt() {
			System.out.println("");
		}
		
		public String getName() {
			return "Hello";
		}
		
	}
	
	public class CharacterB implements Dueler {
		
		public void taunt() {
			System.out.println("");
		}
		
		public String getName() {
			return "Hello";
		}
		
	}

}