public class P5E02 {

	public static void main(String[] args) {
		
		Midia banda1 = new DVD(20, 39.90, "Banda1", 10);
		Midia banda2 = new CD(53, 19.90, "Banda2", 12);
		
		banda1.printDados();
		System.out.println();
		banda2.printDados();
		System.out.println();
		
		Midia banda3 = new CD();
		inserirDados(banda3);
		System.out.println();
		banda3.printDados();
	}
	
	public static void inserirDados(Midia m) {
		m.inserirDados();
	}
}
