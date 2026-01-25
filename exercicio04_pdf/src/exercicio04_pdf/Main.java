package exercicio04_pdf;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String id;
		String hTrabalhadas;
		String valorHora;
		
		System.out.println("=========================================");
		System.out.println("=============== BEM-VINDO ===============");
		System.out.println("=========================================");
		System.out.println("ENTRE COM O COM SEU ID :");
		
		id = sc.nextLine();
		System.out.println("ENTRE COM AS HORAS TRABALHADAS :");
		hTrabalhadas = sc.nextLine();
		System.out.println("ENTRE COM O TVALOR GANHO POR HORA :");
		valorHora = sc.nextLine();
		
		float calculo = Integer.parseInt(hTrabalhadas) * Float.parseFloat(valorHora);
		
		
		

		System.out.println("Entrada: ");
		System.out.println(id);
		System.out.println(hTrabalhadas);
		System.out.println(valorHora);
		System.out.println("=========================================");
		System.out.println("Saída ");
		System.out.println("NUMBER: " + id);
		System.out.println("SALARY = U$ " + calculo);
		
		
		sc.close();
	}
	
	
}
