package estrutura_cond02;
import java.util.Scanner;

public class Main {
	
	public void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número: ");
		int numero = sc.nextInt();
		
		
		if (numero % 2 == 0 ) {

			System.out.println("O NÚMERO É PAR");
		}else
			System.out.println("O NÚMERO É IMPAR");
		
		
		
		sc.close();
		
	}

}
