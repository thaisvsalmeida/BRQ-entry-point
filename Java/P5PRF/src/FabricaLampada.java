public class FabricaLampada {

	public class Incandescente implements Lampada{
		public void ligar() {
			System.out.println("L�mpada incandescente ligada");
		}
		
		public void desligar() {
			System.out.println("L�mpada incandescente desligada");
		}
	}
	
	public class Fluorescente implements Lampada{
		public void ligar() {
			System.out.println("L�mpada fluorescente ligada");
		}
		
		public void desligar() {
			System.out.println("L�mpada fluorescente desligada");
		}
	}
	
	public Lampada construir(int tipo) {
		if(tipo == 1) {
			return new Incandescente();
		}
		else {
			return new Fluorescente();
		}
	}
}
