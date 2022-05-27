public class P4PRF {

	public static void main(String[] args) {
		
		PortaAvioes time1navio1 = new PortaAvioes(1500,"Time 1 - Navio 1", 1000, 500, 10);
		PortaAvioes time2navio1 = new PortaAvioes(1000,"Time 2 - Navio 1", 800, 600, 15);
		Cruzador time1navio2 = new Cruzador(50,"Time 1 - Navio 2",500, 200, 20);
		Cruzador time2navio2 = new Cruzador(70,"Time 2 - Navio 2",200, 500, 40);
		
		if(BatalhaAvioes(time1navio1, time2navio1) == 1) {
			System.out.println("Time 1 venceu a batalha dos aviões!");
		} else {
			System.out.println("Time 2 venceu a batalha dos aviões!");
		}
		
		if(BatalhaCruzador(time1navio2, time2navio2) == 1) {
			System.out.println("Time 1 venceu a batalha do cruzador!");
		} else {
			System.out.println("Time 2 venceu a batalha do cruzador!");
		}
		
		System.out.println();
		BatalhaFinal(time1navio1, time2navio1,time1navio2, time2navio2);
		
	}

	public static int BatalhaAvioes(PortaAvioes n1, PortaAvioes n2) {
		if ((n1.getAtaque() * n1.getNumAvioes()) > (n2.getAtaque() * n2.getNumAvioes())) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public static int BatalhaCruzador(Cruzador n1, Cruzador n2) {
		if ((n1.getAtaque() * n1.getNumCanhoes()) > (n2.getAtaque() * n2.getNumCanhoes())) {
			return 1;
		} else {
			return 2;
		}
	}
	
	public static void BatalhaFinal(PortaAvioes n1, PortaAvioes n2,Cruzador n3, Cruzador n4) {
		if (BatalhaAvioes(n1, n2) == 1 && BatalhaCruzador(n3, n4) == 1) {
			System.out.println("Time 1 venceu a batalha!");
		} else if (BatalhaAvioes(n1, n2) == 2 && BatalhaCruzador(n3, n4) == 2){
			System.out.println("Time 2 venceu a batalha!");
		} else {
			System.out.println("Deu empate.");
		}
	}
}
