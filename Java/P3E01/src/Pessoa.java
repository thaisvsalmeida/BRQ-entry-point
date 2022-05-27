public class Pessoa {

	private int idPessoa;
	private String nomePessoa;
	private double alturaPessoa;
	
	public Pessoa() {}

	public Pessoa(int idPessoa, String nomePessoa, double alturaPessoa) {
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.alturaPessoa = alturaPessoa;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public double getAlturaPessoa() {
		return alturaPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public void setAlturaPessoa(double alturaPessoa) {
		this.alturaPessoa = alturaPessoa;
	}

}
