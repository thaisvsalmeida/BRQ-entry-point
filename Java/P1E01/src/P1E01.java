import java.util.Scanner;

public class P1E01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Para determinar a quantidade de cavalos necessários insira os dados:");
		System.out.println("Massa (kg):");
		double massa = sc.nextDouble();
		System.out.println("Altura (m):");
		double altura = sc.nextDouble();
		System.out.println("Tempo (seg):");
		double tempo = sc.nextDouble();
		
		double cavalos = massa * altura / tempo / 745.6999;
		
		System.out.println("A quantidade de cavalos necessária é de " + cavalos);
		
		sc.close();
	}

}
