public class Calculadora {

	private double memoria = 0;

	public Calculadora() {}
	
	public Calculadora(double memoria) {
		super();
		this.memoria = memoria;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	
	public double somar(double valor) {
		return (memoria = memoria + valor);
	}
	
	public double subtrair(double valor) {
		return (memoria = memoria - valor);
	}
	
	public double multiplicar(double valor) {
		return (memoria = memoria * valor);
	}
	
	public double dividir(double valor) {
		return (memoria = memoria / valor);
	}
	
	public void exibeMemoria() {
		System.out.println(memoria);
	}
}
