
public class TestaValores {
	
	public static void main(String[] args) {
	
		Conta conta = new Conta(1337,24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1231231);
		Conta conta2 = new Conta(1293,2346);
		Conta conta3 = new Conta(2112,121321);
		System.out.println(Conta.getTotal());
	}

}
