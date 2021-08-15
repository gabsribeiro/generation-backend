package poogb;

public class AirplaneProgram {
	public static void main (String[] args) {
		Airplane[] list = new Airplane[4];
		
		list[0] = new Airplane("Airbus A320",1987,220);
		list[1] = new Airplane("Embraer 175",2001,124);
		list[2] = new Airplane("Boeing 767",1981,375);
		list[3] = new Airplane("Boeing 737",1968,215);
		
		for(Airplane wheel:list) {
			wheel.print();
			System.out.println("\n----------------------------------------------------------\n");
		}
	}
}
