package exercicio_for04;
import java.util.Scanner;


public class Main {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			if (x >=0) {
				System.out.println(x / y);
			}else {
				System.out.println("Divisão impossivel");
			}
				
			
		}
		
		
		sc.close();
	}
	
}
