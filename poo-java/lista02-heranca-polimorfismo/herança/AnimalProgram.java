package poogb;

public class AnimalProgram {

	public static void main(String[] args) {
		Dog dog = new Dog ("Mel", "12 anos", "Poodle", "N�o", "N�o");
		Horse horse = new Horse("Trov�o","17 anos", "Cavalo �rabe", "Branco", "1.47m");
		Sloth sloth = new Sloth("Ch�", "8 anos", "Bradypus. Bichos-pregui�a desse g�nero possuem tr�s unhas em cada m�o.");
		
		System.out.println("----------BANCO DE DADOS DE ANIMAIS----------\n");
		dog.dogOut();
		System.out.println("\n---------------------------------------------\n");
		horse.horseOut();
		System.out.println("\n---------------------------------------------\n");
		sloth.slothOut();			
		
	}

}
