import java.util.Scanner;

public class P1E05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a profundidade grande da piscina?");
		double PG = sc.nextDouble();
		System.out.println("Qual é a profundidade pequena da piscina?");
		double PP = sc.nextDouble();
		
		double PM = (PP + PG) / 2.0;
		
		System.out.println("Qual é o diâmetro grande da piscina?");
		double DG = sc.nextDouble();
		System.out.println("Qual é o diâmetro pequeno da piscina?");
		double DP = sc.nextDouble();
		
		double QTDLITROS = DG * DP * PM * 785;
		
		System.out.println("A quantidade total de litros da piscina necessária é " + 
							QTDLITROS);
		
		sc.close();
	}
	
}
