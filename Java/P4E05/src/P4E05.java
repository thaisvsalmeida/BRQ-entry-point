import java.util.Scanner;

public class P4E05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean erro = false;
		
		do {
			try {
				System.out.print("Digite um inteiro: ");
				int num = sc.nextInt();
				erro = false;
				System.out.println("Voc� digitou " + num);
			}
			catch(Exception e) {
				System.out.println("Este n�o � um inteiro num�rico\n");
				erro = true;
				sc.nextLine();
			}
		} while (erro);
		
		sc.close();
	}

}
