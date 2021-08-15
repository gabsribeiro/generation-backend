package poogb;

public class Ex02Horse extends Ex02Animal {
	private String breed;
	private String color;
	private String height;
	
	@Override
	public void sound() {
		System.out.println("Iiirrrrí-rilinchin...");
	}
	
	public void run() {
		System.out.println("Correndo...");
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
