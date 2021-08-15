package poogb;

public class Dog extends Animal {
	private String breed;
	private String trained;
	private String adopted;
	
	public Dog (String name, String age, String breed, String trained, String adopted) {
		super(name,age);
		this.breed=breed;
		this.trained=trained;
		this.adopted=adopted;
		}
	public void dogOut() {
		System.out.print("CACHORRO\nNome: "+getName()+"\nIdade: "+getAge()+"\nRaça: "+breed+"\nÉ adestrado(a)? "+trained+"\nFoi adotado(a)? "+adopted);
	}	
}

