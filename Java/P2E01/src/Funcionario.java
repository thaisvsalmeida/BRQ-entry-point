public class Funcionario {

	//atributos
	private int codFunc;
	private String nomeFunc;
	private double salarioMensal;
	
	//construtores
	public Funcionario() {}
	
	public Funcionario(int codFunc, String nomeFunc, double salarioMensal) {
		super();
		this.codFunc = codFunc;
		this.nomeFunc = nomeFunc;
		this.salarioMensal = salarioMensal;
	}
	
	//getters and setters
	public int getCodFunc() {
		return codFunc;
	}
	public String getNomeFunc() {
		return nomeFunc;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	//métodos
	public double getSalarioAnual() {
		return salarioMensal * 12;
	}
	
	public void setAumento(double per) {
		salarioMensal = salarioMensal + (salarioMensal * per / 100);
	}
}
