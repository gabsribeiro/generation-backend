package poogb;

public class Airplane {
	
	private String model;
	private int year;
	private int nSeats;
	
	public Airplane(String model, int year, int nSeats) {
		this.setModel(model);
		this.setYear(year);
		this.setnSeats(nSeats);
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getnSeats() {
		return nSeats;
	}
	public void setnSeats(int nSeats) {
		this.nSeats = nSeats;
	}
	public void print() {
		System.out.println("MODELO: "+model+"\nPERÍODO DE FABRICAÇÃO: "+year+"-presente\nNÚMERO MÁXIMO DE PASSAGEIROS: "+nSeats);
	}
}
