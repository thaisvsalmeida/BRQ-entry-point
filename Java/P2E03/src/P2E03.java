public class P2E03 {

	public static void main(String[] args) {
		
		//Cria��o de objetos
		ContaCorrente c01 = new ContaCorrente();
		ContaCorrente c02 = new ContaCorrente(10, 8000.0);

		//Set do objeto 1
		c01.setNumCC(200);
		c01.setSaldoCC(6000.0);
		
		//Impress�o dos dados
		System.out.println("1� conta corrente:\nN�mero: " + c01.getNumCC() + 
							"\tSaldo: " + c01.getSaldoCC());
		System.out.println("\n2� conta corrente:\nN�mero: " + c02.getNumCC() + 
							"\tSaldo: " + c02.getSaldoCC());
		
		//Opera��o de saque/dep�sito
		c01.depositar(100.5);
		c02.sacar(600.5);
		
		//Impress�o dados ap�s a opera��o de saque/dep�sito
		System.out.println("\nDados ap�s opera��o:");
		System.out.println("1� conta corrente:\nN�mero: " + c01.getNumCC() + 
							"\tSaldo: " + c01.getSaldoCC());
		System.out.println("\n2� conta corrente:\nN�mero: " + c02.getNumCC() + 
							"\tSaldo: " + c02.getSaldoCC());
		
	}
}
