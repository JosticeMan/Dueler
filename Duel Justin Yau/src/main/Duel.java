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
		System.out.print(d1.getName());
		pause(600);
		System.out.print(" vs ");
		pause(600);
		System.out.println(d2.getName());
		pause(600);
		d1.taunt();
		pause(2000);
		d2.taunt();
		pause(2000);
		d1.setStartingHP(dueler1HP);
		d2.setStartingHP(dueler2HP);
	}
	
	public class CharacterA implements Dueler {
		
		public void taunt() {
			System.out.println("");
		}
		
		public String getName() {
			return "Hello";
		}
		
		public void setStartingHP(int hp) {
			
		}
		
		public int getHP() {
			return 0;
		}
		
	}
	
	public class CharacterB implements Dueler {
		
		public void taunt() {
			System.out.println("");
		}
		
		public String getName() {
			return "Hello";
		}
		
		public void setStartingHP(int hp) {
			
		}
		
		public int getHP() {
			return 0;
		}
		
	}
	
	/**
	 * This method involves "Threads" which we will get to much later in the year, essentially, it
	 * creates a pause in the execution of the program, which makes it more dramatic
	 * @param time
	 */
	public void pause(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}