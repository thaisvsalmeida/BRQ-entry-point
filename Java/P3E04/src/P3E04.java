public class P3E04 {

	public static void main(String[] args) {
		
		Cosseno c01 = new Cosseno(1);
		
		c01.calculaParcelas();
		System.out.println("Parcelas:");
		c01.somaParcelas();
		System.out.println();
		System.out.println("Valor do cosseno aproximado:");
		System.out.println(c01.getCosseno());
	}
}
