public class metodos {

	public static void metodoA() throws Exception {
		System.out.println("Início método A");
		try {
			metodoB();
		}catch(Exception e) {
			System.out.println("Exceção capturada");
		}finally{
			System.out.println("Final A");
		}
	}
	
	public static void metodoB() throws Exception {
		System.out.println("Início método B");
		try {
			metodoC();
		}finally{
			System.out.println("Final B");
		}
	}

	public static void metodoC() throws Exception {
		System.out.println("Início método C");
		try {
			metodoD();
		}finally{
			System.out.println("Final C");
		}
	}

	public static void metodoD() throws Exception {
		System.out.println("Início método D");
		try {
			throw new Exception();
		}finally{
			System.out.println("Final D");
		}
	}
}
