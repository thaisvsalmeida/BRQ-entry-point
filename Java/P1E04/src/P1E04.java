import java.util.Scanner;

public class P1E04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as seguintes informações de um horário:");
		System.out.println("Hora:");
		int hora = sc.nextInt();
		System.out.println("Minuto:");
		int minuto = sc.nextInt();
		System.out.println("Segundo:");
		int segundo = sc.nextInt();
		
		int hora2 = 24 - hora;
		int minuto2 = 60 - minuto;
		int segundo2 = 60 - segundo;
		
		System.out.println("Passaram-se " + hora + "h" + minuto + "min" + segundo + 
							"s e faltam " + hora2 + "h" + minuto2 + "min" + segundo2 + 
							"s para meia noite.");
		
		sc.close();
	}

}
