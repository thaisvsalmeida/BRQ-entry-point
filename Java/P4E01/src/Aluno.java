import java.util.Date;

public class Aluno extends Pessoa {
	
	private String matricula;
	
	public Aluno() {}

	public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public double tirarCopias(int qtd) {
		double custo = 0.07;
		return custo * qtd;
	}
	
}
