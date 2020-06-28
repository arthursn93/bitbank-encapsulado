
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(null);
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		if(agencia <= 0 || numero <= 0) {
			System.out.println("N�o pode ser n�mero negativo");
			return;
		}else {		
			this.agencia = agencia;
			this.numero = numero;	
			total++; //Conta.total++
		}
		
		//System.out.println("Total de contas: " + total);
		// � a mesma coisa de cima -> System.out.println("Total de contas: " + Conta.total);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {

			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}
}
