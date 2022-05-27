import java.util.Scanner;

public class P3E03 {

	public static void main(String[] args) {
		Turma t = new Turma();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o id da turma: ");
        int id = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos: ");
        int qtdeAlunos = scanner.nextInt();

        double v[] = new double[qtdeAlunos];

        for(int i = 0; i < v.length; i++) {
            System.out.print("Digite a " + (i+1) + "ª nota da turma: ");
            v[i] = scanner.nextInt();
        }
        t.mediaTurma(v);
        
        System.out.println("Id da turma: " + id);
        System.out.println("Média da turma: " + t.mediaTurma(v));
        
        scanner.close();
    }
}
