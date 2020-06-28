
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(2222,2222222);
		Conta conta1 = new Conta(3333,3333333);
		Conta conta2 = new Conta(4444,4444444);
		Conta conta3 = new Conta(5555,5555555);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		System.out.println(conta1.getAgencia());
		System.out.println(conta1.getNumero());
		
		System.out.println(conta2.getAgencia());
		System.out.println(conta2.getNumero());
		
		System.out.println(conta3.getAgencia());
		System.out.println(conta3.getNumero());
		
		System.out.println("Total de Contas = " + Conta.getTotal());
		
	//utilizamos atributo static para saber quantas Contas existem, todo static é um ATRIBUTO DA CLASSE, no caso da Conta
		
		
	}

}
