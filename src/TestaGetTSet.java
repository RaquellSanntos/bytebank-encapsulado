
public class TestaGetTSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println("Número da conta é: "+ conta.getNumero());

		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silva");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
	}

}
