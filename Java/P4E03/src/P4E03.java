public class P4E03 {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		try {
			veiculo.acelera(150);
			System.out.println("Velocidade: " + veiculo.getVelocidade() + " km/h");
		} catch (VelocidadeAcima e) {
			System.out.println(e.getMessage());
		}
		
		try {
			veiculo.acelera(80);
			System.out.println("Velocidade: " + veiculo.getVelocidade() + " km/h");
		} catch (VelocidadeAcima e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			veiculo.desacelera(60);
			System.out.println("Velocidade: " + veiculo.getVelocidade() + " km/h");
		} catch (VelocidadeAbaixo e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			veiculo.desacelera(70);
			System.out.println("Velocidade: " + veiculo.getVelocidade() + " km/h");
		} catch (VelocidadeAbaixo e) {
			System.out.println(e.getMessage());
		}

	}

}
