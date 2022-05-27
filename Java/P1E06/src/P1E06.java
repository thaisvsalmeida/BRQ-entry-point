import java.util.Scanner;

public class P1E06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a medida do raio?");
		double raio = sc.nextDouble();
		
		double perimetro = 2 * Math.PI * raio;
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("O perímetro do círculo é " + perimetro + 
							" e sua área é de " + area);
		
		sc.close();
	}

}
