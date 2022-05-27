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
				System.out.println("Você digitou " + num);
			}
			catch(Exception e) {
				System.out.println("Este não é um inteiro numérico\n");
				erro = true;
				sc.nextLine();
			}
		} while (erro);
		
		sc.close();
	}

}
