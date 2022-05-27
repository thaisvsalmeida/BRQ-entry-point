import java.util.Scanner;

public class CD extends Midia {
	public static Scanner sc = new Scanner(System.in);

	private int nMusicas;

	public CD() {}

	public CD(int c, double p, String n, int m) {
		super(c, p, n);
		this.nMusicas = m;
	}
	
	public String getTipo() {
		return super.getTipo();
	}
	
	public String getDetalhes() {
		return super.getDetalhes() + "\nNúmero de Músicas: " + this.nMusicas;
	}
	
	public void setMusicas(int m) {
		this.nMusicas = m;
	}
	
	public void inserirDados() {
		super.inserirDados();
		System.out.print("Insira a quantidade de músicas: ");
		this.nMusicas = sc.nextInt();
	}
}
