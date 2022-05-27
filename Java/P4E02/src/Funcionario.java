public class Funcionario {
	
	protected String nome;
	protected String rg;
	protected double salarioMensal;
	
	public Funcionario() {}

	public Funcionario(String nome, String rg, double salarioMensal) {
		this.nome = nome;
		this.rg = rg;
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	public void aumento(double valor) {
		salarioMensal += valor;  
	}
	
	public final double pagamento() {
		return salarioMensal * 0.85;
	}
	
}
