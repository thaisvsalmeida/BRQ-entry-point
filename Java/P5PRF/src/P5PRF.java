import java.util.Scanner;

public class P5PRF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual lâmpada você quer construir?\n(1)Incandescente\n(2)Fluorescente");
		int tipo = sc.nextInt();
		FabricaLampada fab = new FabricaLampada();
		Lampada lamp = fab.construir(tipo);
		lamp.ligar();
		lamp.desligar();

		sc.close();
	}

}
