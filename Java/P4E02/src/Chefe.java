public class Chefe extends Funcionario {

	private double contas;
	private double gastosExtras;
	private double adicionalChefia;
	
	public Chefe() {}

	public Chefe(String nome, String rg, double salarioMensal, double contas, double gastosExtras, double adicionalChefia) {
		super(nome, rg, salarioMensal);
		this.contas = contas;
		this.gastosExtras = gastosExtras;
		this.adicionalChefia = adicionalChefia;
	}

	public double getContas() {
		return contas;
	}

	public double getGastosExtras() {
		return gastosExtras;
	}

	public double getAdicionalChefia() {
		return adicionalChefia;
	}

	public void setContas(double contas) {
		this.contas = contas;
	}

	public void setGastosExtras(double gastosExtras) {
		this.gastosExtras = gastosExtras;
	}

	public void setAdicionalChefia(double adicionalChefia) {
		this.adicionalChefia = adicionalChefia;
	}
	
	public double pagamentoExtra() {
		return super.pagamento() + contas + gastosExtras + adicionalChefia;
	}
}
