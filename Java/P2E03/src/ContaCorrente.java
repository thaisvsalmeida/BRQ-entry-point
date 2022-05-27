public class ContaCorrente {
	
	private int numCC;
	private double saldoCC;
	
	public ContaCorrente() {}
	
	public ContaCorrente(int numCC, double saldoCC) {
		super();
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}

	public int getNumCC() {
		return numCC;
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
	
	public void depositar(double valor) {
		saldoCC = saldoCC + valor;
	}
	
	public void sacar(double valor) {
		saldoCC = saldoCC - valor;
	}
}
