public class Navio {

	protected int numTripulantes;
	protected String nome;
	
	public Navio() {}

	public Navio(int numTripulantes, String nome) {
		this.numTripulantes = numTripulantes;
		this.nome = nome;
	}

	public void exibirInfoGeral() {
		System.out.println("N�mero de tripulantes: " + numTripulantes + "\nNome: " + nome);
	}
	
}
