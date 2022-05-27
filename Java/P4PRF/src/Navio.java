public class Navio {

	protected int numTripulantes;
	protected String nome;
	
	public Navio() {}

	public Navio(int numTripulantes, String nome) {
		this.numTripulantes = numTripulantes;
		this.nome = nome;
	}

	public void exibirInfoGeral() {
		System.out.println("Número de tripulantes: " + numTripulantes + "\nNome: " + nome);
	}
	
}
