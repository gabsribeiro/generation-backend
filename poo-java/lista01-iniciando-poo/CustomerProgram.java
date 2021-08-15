package poogb;

public class CustomerProgram {
	public static void main (String[] args) {
		Customer[] list = new Customer[3];
		list[0]=new Customer ("Juliana Siqueira da Silva",415604210,959020258,"Rua Rio Negro, 348 - Lapa/SP","julianassilva@gmail.com",1249.90f);
		list[1]=new Customer ("Paulo Nogueira",405217856,985632541,"Rua Amazonas, 451 - Apto 04 - Bela Vista, Osasco/SP", "não possui",764.50f);
		list[2]=new Customer ("Maria Francisca Medeiros", 405876593,947235874,"Avenida Dep. Emilio Carlos, 527 - Limão/SP", "@mfmedeiros@bol.com.br",2175.90f);
		
		System.out.println("--------------------- BANCO DE DADOS: CLIENTES -----------------------\n");
		for(Customer wheel:list) {
			wheel.print();
			System.out.println("\n\n----------------------------------------------------------------------\n");
		}		
	}
}
