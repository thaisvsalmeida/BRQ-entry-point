public class PortaAvioes extends NavioDeGuerra {

	private int numAvioes;

	public PortaAvioes() {}

	public PortaAvioes(int numTripulantes, String nome, double blindagem, double ataque, int numAvioes) {
		super(numTripulantes, nome, blindagem, ataque);
		this.numAvioes = numAvioes;
	}

	public int getNumAvioes() {
		return numAvioes;
	}

	public void setNumAvioes(int numAvioes) {
		this.numAvioes = numAvioes;
	}
	
	public void poderDeFogo() {
		double pf = ataque * Math.pow(numAvioes, 2);
		System.out.println("Poder de Fogo: " + pf);
	}
	
}
