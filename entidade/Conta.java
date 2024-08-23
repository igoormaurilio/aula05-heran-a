package entidade;

public class Conta {
	private int numero;
	
	private  String nome;
	
	private double saldo;

	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public double saque (double saque) {
		return saldo -= saque;
		
		
	}
	public double depositar(double depositar) {
		return saldo += depositar;
		
	}
	public String mostrar() {
		return "O nome é: "+ nome + " O saldo é: " + saldo + " ";
		
	}
	

}
