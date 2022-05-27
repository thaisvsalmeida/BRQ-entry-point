import java.util.Scanner;

public class P3E01 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Quantas pessoas você deseja inserir?");
		int quant = scanner.nextInt();
		
		Pessoa[] p = new Pessoa[quant];
		
		for (int i = 0; i < p.length; i++) {
			p[i] = new Pessoa();
			
			System.out.println("Entre com os dados:");
			System.out.println("Id:");
			scanner.nextLine();
			int idPessoa = scanner.nextInt();
		
			System.out.println("Nome:");
			scanner.nextLine();
			String nomePessoa = scanner.nextLine();
		
			System.out.println("Altura:");
			double alturaPessoa = scanner.nextDouble();
			
			p[i] = new Pessoa(idPessoa, nomePessoa, alturaPessoa);
		}
		
		System.out.println("Média: " + mediaAltura(p));
		
		scanner.close();
	}
	
	public static double mediaAltura(Pessoa[] p) {
		double soma = 0;
		for (int i = 0; i < p.length; i++) {
			soma = soma + p[i].getAlturaPessoa();
		}
		return soma / p.length;
	}
}
