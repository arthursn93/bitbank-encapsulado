
public class TestaGeteSet {

	public static void main(String[] args) {
		Conta conta = new Conta(136,1333);
		conta.setNumero(136);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente("333.333.333-33");
		paulo.setNome("Paulo Silveira");
		paulo.setProfissao("Designer");
		
				
		conta.setTitular(paulo);
		Cliente titularConta = conta.getTitular();
		//titularConta.setCpf("333.333.333-33");
		
		System.out.println(paulo.getCpf());
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(conta.getTitular());
		System.out.println(titularConta);
		System.out.println(paulo);
		

	}

}
