import java.util.Scanner;

public class P1E03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a temperatura em Celsius?");
		double C = sc.nextDouble();
		
		double F = C * 1.8 + 32;
		double K = C + 273.15;
		double Ra = C * 1.8 + 32 + 459.67;
		double Re = C * 0.8;
		
		System.out.println("Temperaturas:");
		System.out.println("Fahrenheit: " + F);
		System.out.println("Kelvin: " + K);
		System.out.println("Rankine: " + Ra);
		System.out.println("Réaumur: " + Re);
		
		sc.close();
	}

}
