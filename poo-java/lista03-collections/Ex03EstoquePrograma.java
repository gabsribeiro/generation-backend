package poogb;

import java.util.ArrayList;
import java.util.Collection;

public class Ex03EstoquePrograma {

	public static void main(String[] args) {
		
		String laranja = "laranjas";
		String banana = "bananas";
		String maca = "maçãs";

		Collection<String> estoque = new ArrayList <>();

		estoque.add(laranja);
		estoque.add(banana);
		estoque.add(maca);
		
		System.out.println("Produtos:\n"+estoque);
		
		estoque.remove(banana);
		
		System.out.println("\nProdutos:");
		for (String novaOrdem : estoque) {
			System.out.println(novaOrdem);
		}
	}

}
