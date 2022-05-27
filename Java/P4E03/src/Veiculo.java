public class Veiculo {
	
	private int velocidade = 0;
	private int velocidadeMax = 100;
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	
	public void acelera(int incremento) throws VelocidadeAcima {
		if(velocidade + incremento > velocidadeMax) {
			throw new VelocidadeAcima("Velocidade acima do permitido.");
		}
		else {
			velocidade += incremento;
		}
	}
	
	public void desacelera (int decremento) throws VelocidadeAbaixo {
		if (velocidade - decremento < 0) {
			throw new VelocidadeAbaixo("Velocidade abaixo de zero.");
		}
		else {
			velocidade-= decremento;
		}
	}
	
}
