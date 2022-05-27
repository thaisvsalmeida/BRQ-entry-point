public class P2E05 {

	public static void main(String[] args) {
		
		Relogio r01 = new Relogio(1, 0, 0);
		Relogio r02 = new Relogio();
		
		r02.setHora(23);
		r02.setMinuto(59);
		r02.setSegundo(50);
		
		r01.exibeHorario();
		r02.exibeHorario();

		r01.atrasar(4000);
		r02.adiantar(86400);
		
		System.out.println();
		r01.exibeHorario();
		r02.exibeHorario();

	}

}
