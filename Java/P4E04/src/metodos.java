public class metodos {

	public static void metodoA() throws Exception {
		System.out.println("In�cio m�todo A");
		try {
			metodoB();
		}catch(Exception e) {
			System.out.println("Exce��o capturada");
		}finally{
			System.out.println("Final A");
		}
	}
	
	public static void metodoB() throws Exception {
		System.out.println("In�cio m�todo B");
		try {
			metodoC();
		}finally{
			System.out.println("Final B");
		}
	}

	public static void metodoC() throws Exception {
		System.out.println("In�cio m�todo C");
		try {
			metodoD();
		}finally{
			System.out.println("Final C");
		}
	}

	public static void metodoD() throws Exception {
		System.out.println("In�cio m�todo D");
		try {
			throw new Exception();
		}finally{
			System.out.println("Final D");
		}
	}
}
