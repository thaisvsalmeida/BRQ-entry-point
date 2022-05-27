public class P4E02 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Jos� Alves", "1122334455", 8500.00);
		Chefe chefe = new Chefe("Marta Oliveira", "7788994455", 12000.50, 200.00, 80.60, 200.00);
		
		System.out.println("Antes do aumento:");
		System.out.println("Funcion�rio: " + funcionario.getNome() + "\nSal�rio: " + funcionario.getSalarioMensal());
		System.out.println("Chefe: " + chefe.getNome() + "\nSal�rio: " + chefe.getSalarioMensal() + 
							"\nPagamento Extra: " + chefe.pagamentoExtra());
		
		funcionario.aumento(100.00);
		chefe.aumento(150.00);
		
		System.out.println("---------------------------");
		System.out.println("Ap�s aumento:");
		System.out.println("Funcion�rio: " + funcionario.getNome() + "\nSal�rio: " + funcionario.getSalarioMensal());
		System.out.println("Chefe: " + chefe.getNome() + "\nSal�rio: " + chefe.getSalarioMensal() +
							"\nPagamento Extra: " + chefe.pagamentoExtra());
	}

}
