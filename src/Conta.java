public class Conta {
	private double saldo; // atributo do objeto
	private int agencia; // atributo do objeto
	private int numero; // atributo do objeto
	private Cliente titular; // atributo do objeto
	private static int total; // atributo da classe

	public Conta(int agencia, int numero) {
		// construtor = como se fosse uma rotina de inicializacao

		Conta.total++;
		// System.out.println("o total de contas é "+Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("estou criando uma conta " + this.numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			// this.saldo -= valor;
			this.saca(valor); // usando o metodo
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode valor <= 0");
			return;
		}
		this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
}