package poogb;

public class Ex02Dog extends Ex02Animal {
	private String breed;
	private boolean trained;
	private boolean adopted;
	
	@Override
	public void sound() {
		System.out.println("Au! Au! Au!");
	}
	
	public void run() {
		System.out.println("Correndo...");
	}
	
	public void dogOut() {
		System.out.println("Nome: "+this.getName()+"\nIdade: "+this.getAge()+"\nRaÁa: "+this.getBreed()+"\n… treinado? "+this.getTrained()+"\n… adotado? "+this.getAdopted());
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean getTrained() {
		return trained;
	}

	public void setTrained(boolean trained) {
		this.trained = trained;
	}

	public boolean getAdopted() {
		return adopted;
	}

	public void setAdopted(boolean adopted) {
		this.adopted = adopted;
	}
	
}
