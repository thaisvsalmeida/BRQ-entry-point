import java.text.ParseException;
import java.text.SimpleDateFormat;

public class P4E01 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy");
		
		Aluno aluno1 = new Aluno("Maria Silva", "123.456.789-12", sf.parse("10.10.1990"), "987654");
		Professor professor1 = new Professor("Marcelo Fernandes", "789.456.123-85", sf.parse("20.07.1960"), 10000.50, "F�sica I");
		Funcionario funcionario1 = new Funcionario("Clara Barbosa", "456.123.789-23", sf.parse("08.12.1974"), 8000.00, sf.parse("01.03.2015"), "Financeiro");
		
		System.out.println("Aluno: " + aluno1.getNome() + "\nMatr�cula: " + aluno1.getMatricula() +
							"\nValor das c�pias: R$" + aluno1.tirarCopias(50));
		System.out.println("\nProfessor: " + professor1.getNome() + "\nDisciplina: " +
							professor1.getDisciplina() + "\nValor das c�pias: " + 
							professor1.tirarCopias(50));
		System.out.println("\nFuncion�rio: " + funcionario1.getNome() + "\nData de Admiss�o: " + 
							funcionario1.getDataAdmissao() + "\nValor das C�pias: " + 
							funcionario1.tirarCopias(80));
	}

}
