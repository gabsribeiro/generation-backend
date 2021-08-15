package poogb;

public class Customer {
	private String name;
	private int id;
	private int phone;	
	private String address;
	private String email;
	private float valueP;
	
	public Customer(String name, int id, int phone, String address, String email, float valueP) {
		this.setName(name);
		this.setId(id);
		this.setPhone(phone);
		this.setAddress(address);
		this.setEmail(email);
		this.setValueP(valueP);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getValueP() {
		return valueP;
	}
	public void setValueP(float valueP) {
		this.valueP = valueP;
	}
	public void print() {
		System.out.print("NOME: "+name+"\nRG: "+id+"\nTELEFONE: "+phone+"\nENDEREÇO: "+address+"\nE-MAIL: "+email);
		System.out.printf("\nVALOR DA ÚLTIMA COMPRA: R$%.2f",valueP,"\n");
	}	
}
