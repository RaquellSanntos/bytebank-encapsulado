
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	
	public Conta(int agencia, int numero) {
		// super();
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Criando o Construtor de uma conta" +
		this.numero);
	}
	public void deposita(double valor) {
		this.saldo +=valor;
	}
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor iguala 0");
		}
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero<=0) {
			System.out.println("Não pode valor menor iguala 0");
		}
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
