import java.util.Date;

public class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected Date dataNascimento;
	
	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double tirarCopias(int qtd) {
		double custo = 0.1;
		return custo * qtd;
	}
}
