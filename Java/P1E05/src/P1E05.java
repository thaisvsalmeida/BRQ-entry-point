import java.util.Scanner;

public class P1E05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � a profundidade grande da piscina?");
		double PG = sc.nextDouble();
		System.out.println("Qual � a profundidade pequena da piscina?");
		double PP = sc.nextDouble();
		
		double PM = (PP + PG) / 2.0;
		
		System.out.println("Qual � o di�metro grande da piscina?");
		double DG = sc.nextDouble();
		System.out.println("Qual � o di�metro pequeno da piscina?");
		double DP = sc.nextDouble();
		
		double QTDLITROS = DG * DP * PM * 785;
		
		System.out.println("A quantidade total de litros da piscina necess�ria � " + 
							QTDLITROS);
		
		sc.close();
	}
	
}
