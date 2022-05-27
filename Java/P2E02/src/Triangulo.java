public class Triangulo {
	
	private double base;
	private double altura;
	
	public Triangulo () {}
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		return (this.altura * this.base / 2);
	}
	
	public double getPerimetro() {
		return (this.altura + this.base + Math.sqrt(Math.pow(this.altura, 2)) + Math.pow(this.base, 2));
	}
}
