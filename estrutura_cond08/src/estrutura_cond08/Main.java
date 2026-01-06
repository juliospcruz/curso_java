package estrutura_cond08;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public void main (String []args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTRE COM O SEU SALÁRIO: ");
		double salario = sc.nextDouble();
		
		
		if(salario <= 2000.00 && salario >= 0)
			System.out.println("Você esta isento!");
		else if (salario >= 2000.01 && salario <= 3000.00 )
			System.out.println("Você deve pagar 8% de imposto!");
		else if (salario >= 3000.01 && salario <= 4500.00 )
			System.out.println("Você deve pagar 18% de imposto!");
		else if (salario > 4500.01)
			System.out.println("Você deve pagar 28%");
		else
			System.out.println("Este valor está incorreto!");
		
		sc.close();
	}

}
