package poogb;

public abstract class Ex02Animal {
	protected String name;
	protected String age;
	
	public abstract void sound();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}	
	
}
