public class Calculadora {

	public static void main(String[] args) {
		//Imprime o resultado de 5 + 5
		Contas.mostrarCalculo(new Soma(), 5, 5);
		
		//Imprime o resultado de 3.5 * 2
		Contas.mostrarCalculo(new Multiplicacao(), 3.5, 2);

		//Imprime o resultado de 10 - 20
		Contas.mostrarCalculo(new Subtracao(), 10, 20);

		//Imprime o resultado de 50/80
		Contas.mostrarCalculo(new Divisao(), 50, 80);

		//Imprime o resultado de 5 % 2
		Contas.mostrarCalculo(new Resto(), 5, 2);
	}

}
