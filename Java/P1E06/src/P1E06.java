import java.util.Scanner;

public class P1E06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � a medida do raio?");
		double raio = sc.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("O per�metro do c�rculo � " + perimetro + 
							" e sua �rea � de " + area);
		
		sc.close();
	}

}
