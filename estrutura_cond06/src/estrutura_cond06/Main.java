package estrutura_cond06;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTRE COM O NÚMERO: ");
		float numero = sc.nextFloat();
		
		if (numero >= 0 && numero <= 25)
			System.out.println("Intervalo [0-25]");
		else if (numero >= 25.01 && numero <= 50)
			System.out.println("Intervalo [25-50]");
		else if (numero >= 50.01 && numero <= 75)
			System.out.println("Intervalo [50-75]");
		else if (numero >= 75.01 && numero <= 100)
			System.out.println("Intervalo [75-100]");
		else
			System.out.println("Fora do intervalo");
			
		
		
		
		sc.close();
	}
	
	
}
