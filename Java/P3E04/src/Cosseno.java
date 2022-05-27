public class Cosseno {

	private double x;
	private double [] parcelas= new double[10];
	private double cosseno;

	public Cosseno(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public double[] getParcelas() {
		return parcelas;
	}

	public double getCosseno() {
		return cosseno;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setParcelas(double[] parcelas) {
		this.parcelas = parcelas;
	}

	public void setCosseno(double cosseno) {
		this.cosseno = cosseno;
	}
	
	public void calculaParcelas() {
		parcelas [0] = 1; 
		for (int i = 1; i < parcelas.length; i++) {
			double f = 1;
			int j = 2 * i;
			while (j > 1){ 
	             f = f * j;
	             j--;
			}
			parcelas[i] = Math.pow(-1, i) * Math.pow(x, 2*i) / f;	
	    }
	}
	
	public void somaParcelas() {
		this.cosseno = 0;
		for (int k = 0; k < parcelas.length; k++) {
			this.cosseno += parcelas[k];
			System.out.println(k + ": " + parcelas[k]);
		}
	}
}
