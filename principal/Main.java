package principal;

import java.util.ArrayList;
import java.util.List;

import entidade.Conta;
import entidade.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(7, "Igor", 1000, 2000);
		Conta d = new ContaCorrente(10, "Emerson", 1000000, 20000000);
		
		List<Conta> lista = new ArrayList<>();
		
		
		lista.add(c);
		lista.add(d);
		System.out.println(lista);


	}

}
