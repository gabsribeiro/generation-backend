package poogb;

public class Ex02Programa {

	public static void main(String[] args) {		
		
		Ex02Dog dog = new Ex02Dog();
		Ex02Horse horse = new Ex02Horse();
		Ex02Sloth sloth = new Ex02Sloth();
		
		//OUTPUT DOG
		dog.setName("LeBron");
		dog.setAge("6 meses");
		dog.setBreed("Pastor Alemão");
		dog.setTrained(true);
		dog.setAdopted(false);
		dog.dogOut();
		dog.run();
		dog.sound();
		
	}
}
