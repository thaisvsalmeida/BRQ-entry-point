public class P2E04 {

	public static void main(String[] args) {
		
		AlunoDisciplina a01 = new AlunoDisciplina();
		AlunoDisciplina a02 = new AlunoDisciplina(1234567);
		AlunoDisciplina a03 = new AlunoDisciplina(8901234, 1, 7.8, 8.9);
		
		a01.setIdAluno(9517536);
		a01.setIdDisciplina(2);
		a01.setNotaB1(5.8);
		a01.setNotaB2(8.3);
		
		a02.setIdDisciplina(3);
		a02.setNotaB1(10.0);
		a02.setNotaB2(7.5);
		
		System.out.println("Id do aluno: " + a01.getIdAluno() + "\nDisciplina: " + 
							a01.getIdDisciplina() + "\nNotas (B1 e B2): " + a01.getNotaB1() + " e " +
							a01.getNotaB2() + "\nMédia Aritmética: " + a01.mediaAritmetica() + 
							"\nMédia Ponderada: " + a01.mediaPonderada());
		
		System.out.println("\nId do aluno: " + a02.getIdAluno() + "\nDisciplina: " + 
							a02.getIdDisciplina() + "\nNotas (B1 e B2): " + a02.getNotaB1() + " e " +
							a02.getNotaB2() + "\nMédia Aritmética: " + a02.mediaAritmetica() + 
							"\nMédia Ponderada: " + a02.mediaPonderada());
		
		System.out.println("\nId do aluno: " + a03.getIdAluno() + "\nDisciplina: " + 
							a03.getIdDisciplina() + "\nNotas (B1 e B2): " + a03.getNotaB1() + " e " +
							a03.getNotaB2() + "\nMédia Aritmética: " + a03.mediaAritmetica() + 
							"\nMédia Ponderada: " + a03.mediaPonderada());
	}

}
