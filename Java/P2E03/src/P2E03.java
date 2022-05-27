public class P2E03 {

	public static void main(String[] args) {
		
		//Criação de objetos
		ContaCorrente c01 = new ContaCorrente();
		ContaCorrente c02 = new ContaCorrente(10, 8000.0);

		//Set do objeto 1
		c01.setNumCC(200);
		c01.setSaldoCC(6000.0);
		
		//Impressão dos dados
		System.out.println("1ª conta corrente:\nNúmero: " + c01.getNumCC() + 
							"\tSaldo: " + c01.getSaldoCC());
		System.out.println("\n2ª conta corrente:\nNúmero: " + c02.getNumCC() + 
							"\tSaldo: " + c02.getSaldoCC());
		
		//Operação de saque/depósito
		c01.depositar(100.5);
		c02.sacar(600.5);
		
		//Impressão dados após a operação de saque/depósito
		System.out.println("\nDados após operação:");
		System.out.println("1ª conta corrente:\nNúmero: " + c01.getNumCC() + 
							"\tSaldo: " + c01.getSaldoCC());
		System.out.println("\n2ª conta corrente:\nNúmero: " + c02.getNumCC() + 
							"\tSaldo: " + c02.getSaldoCC());
		
	}
}
