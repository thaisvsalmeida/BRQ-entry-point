import java.util.Scanner;

public class DVD extends Midia {
	public static Scanner sc = new Scanner(System.in);

	private int nFaixas;

	public DVD() {}

	public DVD(int c, double p, String n, int f) {
		super(c, p, n);
		this.nFaixas = f;
	}
	
	public String getTipo() {
		return super.getTipo();
	}
	
	public String getDetalhes() {
		return super.getDetalhes() + "\nNúmero de Faixas: " + this.nFaixas;
	}
	
	public void setFaixas(int f) {
		this.nFaixas = f;
	}

	public void inserirDados() {
		super.inserirDados();
		System.out.print("Insira a quantidade de faixas: ");
		this.nFaixas = sc.nextInt();
	}
}
