package poogb;

public class Sloth extends Animal {
	private String gender;
	
	public Sloth (String name, String age, String gender){
		super(name,age);
		this.gender=gender;		
	}
	public void slothOut() {
		System.out.print("BICHO-PREGUI�A\nNome: "+getName()+"\nIdade: "+getAge()+"\nG�nero: "+gender);

	}
}	
