package estruturas_repetitiva01;
import java.util.Scanner;


public class Main {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rep = sc.nextInt();
		
		for (int i=0; i<rep; i++) {
			System.out.println("Valor de i : " + i);
		}
		
		
		sc.close();
	}

}
