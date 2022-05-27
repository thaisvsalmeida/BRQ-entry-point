import java.util.Scanner;

public class Midia {
	public Scanner sc = new Scanner(System.in);

	protected int codigo;
	protected double preco;
	protected String nome;
	
	public Midia() {}

	public Midia(int c, double p, String n) {
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}

	public String getTipo() {
		return this.getClass().toString();
	}
	
	public String getDetalhes() {
		return ("\nCódigo: " + this.codigo + "\nPreço: " + this.preco + "\nNome: " + this.nome);
	}
	
	public void printDados() {
		System.out.println("Tipo: " + getTipo() + getDetalhes());
	}
	
	public void inserirDados() {
		System.out.println("Entre com os dados:");
		
		System.out.print("Código: ");
		this.codigo = sc.nextInt();
		
		System.out.print("Preço: ");
		this.preco = sc.nextDouble();
		
		System.out.print("Nome: ");
		sc.nextLine();
		this.nome = sc.nextLine();
	}
}
