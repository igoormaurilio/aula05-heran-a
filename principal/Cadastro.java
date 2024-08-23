package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Cadastro {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Digite o nome: ");
		String nome = scn.next();
		
		System.out.println("Número da conta: ");
		int num = scn.nextInt();
		
		System.out.println("Saldo: ");
		double saldo = scn.nextDouble();
		
		System.out.println("Limite: ");
		double limite = scn.nextDouble();
		
		
		Conta c = new ContaCorrente(num, nome, saldo, limite);
		Conta p = new ContaPoupanca(num, nome, saldo);
		


		
		System.out.println("Você deseja cadastrar em qual conta?");
		System.out.println("1- Conta Corrente");
		System.out.println("2- Conta Poupança");
		System.out.println("3- Exibir informações da conta: ");
		System.out.println("4- Sair");
		int opcao = scn.nextInt();
		scn.nextLine();
		
		switch (opcao) {
		case 1:
			System.out.println("Conta Corrente criada!!");
			break;
		case 2: 
			System.out.println("Conta Poupança criada!");
			break;
		case 4: 
			System.out.println("Saindo..");
			return;
			default:
				System.out.println("Opção inválida, tente mais tarde...");
		} if(opcao == 1) {
			List<Conta> lista = new ArrayList<>();
			lista.add(c);
			System.out.println(lista);
		} else if (opcao == 2) {
			List<Conta> lista = new ArrayList<>();
			lista.add(p);
			System.out.println(lista);
		}
		
		
		
	

	}

}
