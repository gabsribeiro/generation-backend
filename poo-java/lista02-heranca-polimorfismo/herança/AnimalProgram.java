package poogb;

public class AnimalProgram {

	public static void main(String[] args) {
		Dog dog = new Dog ("Mel", "12 anos", "Poodle", "Não", "Não");
		Horse horse = new Horse("Trovão","17 anos", "Cavalo árabe", "Branco", "1.47m");
		Sloth sloth = new Sloth("Chô", "8 anos", "Bradypus. Bichos-preguiça desse gênero possuem três unhas em cada mão.");
		
		System.out.println("----------BANCO DE DADOS DE ANIMAIS----------\n");
		dog.dogOut();
		System.out.println("\n---------------------------------------------\n");
		horse.horseOut();
		System.out.println("\n---------------------------------------------\n");
		sloth.slothOut();			
		
	}

}
