package poogb;

public class Horse extends Animal {
	private String breed;
	private String color;
	private String height;
	
	public Horse (String name, String age, String breed, String color, String height) {
		super(name,age);
		this.breed=breed;
		this.color=color;
		this.height=height;
		}
		
		public void horseOut() {
		System.out.print("CAVALO\nNome: "+getName()+"\nIdade: "+getAge()+"\nRaça: "+breed+"\nCor: "+color+"\nAltura: "+height);
	}

}
