public class Resto extends OperacaoMatematica {

	@Override
	public double calcular(double x, double y) {
		if(y == 0) {
			throw new ArithmeticException("Divisor n�o pode ser zero");
		}
		return x % y;
	}

}
