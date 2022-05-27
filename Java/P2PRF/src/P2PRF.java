public class P2PRF {

	public static void main(String[] args) {
		
		Calculadora v01 = new Calculadora(10);
		Calculadora v02 = new Calculadora();
		
		v02.setMemoria(800);
		
		v01.exibeMemoria();
		v02.exibeMemoria();
		
		v01.somar(80);
		v01.multiplicar(5);
		v02.dividir(80);
		v02.subtrair(20);
		
		System.out.println();
		v01.exibeMemoria();
		v02.exibeMemoria();
		
	}

}
