package poogb;

public class Ex02Sloth extends Ex02Animal {
	private String gender;

	@Override
	public void sound() {
		System.out.println("Aaaarn arrrn...");
	}
	
	public void climb() {
		System.out.println("Escalando uma árvore...");
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}	
