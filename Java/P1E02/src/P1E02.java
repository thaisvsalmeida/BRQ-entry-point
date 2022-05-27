import java.util.Scanner;

public class P1E02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int q1, q2, q3, q4, q5, q6;
		double R;
		double D = 5.24; //cotação do dólar
		
		System.out.println("Qual a quantidade de moedas de $1?");
		q1 = sc.nextInt();
		System.out.println("Qual a quantidade de moedas de 50 cents?");
		q2 = sc.nextInt();
		System.out.println("Qual a quantidade de moedas de 25 cents?");
		q3 = sc.nextInt();
		System.out.println("Qual a quantidade de moedas de 10 cents?");
		q4 = sc.nextInt();
		System.out.println("Qual a quantidade de moedas de 5 cents?");
		q5 = sc.nextInt();
		System.out.println("Qual a quantidade de moedas de 1 cent?");
		q6 = sc.nextInt();
		
		R = (q1 + 0.5 * q2 + 0.25 * q3 + 0.1 * q4 + 0.05 * q5 + 0.01 * q6) * D;
		
		System.out.println("A quantia corresponde à " + R + " reais.");
		
		sc.close();
	}

}
