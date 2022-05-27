import java.util.Arrays;
import java.util.Scanner;

public class P3E05{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("At� que n�mero voc� deseja saber a sequ�ncia?");
		int x = scanner.nextInt();
		
		boolean[] vetor = new boolean[x];
		
		Arrays.fill(vetor, true);
		
		for (int i = 0; i < x; i++) {
			int counter = 0;
            for (int k = 1; k <= i; k++) {
            	if (i % k == 0) ++counter;
	         }
         if (counter > 2) {
              vetor[i] = false;
          }
			
		}
		
		for (int i = 0; i < x; i++) {
			System.out.println("Posi��o "+ i + ": " + vetor[i]);
		}
		
		scanner.close();
	}
}