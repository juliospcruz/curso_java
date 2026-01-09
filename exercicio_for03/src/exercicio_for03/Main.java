package exercicio_for03;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /*DECLARA A VARIAVEL*/
        double N = sc.nextInt();
 
        double p1 = 2;
		double p2 = 3;
		double p3 = 5;
        
        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            double v1 = x * p1;
            double y = sc.nextDouble();
            double v2 = y * p2;
            double z = sc.nextDouble();
            double v3 = z * p3;
            double resultado = ((v1+v2+v3) / (p1+p2+p3));
            System.out.printf("Saída: %.1f",(resultado));
            
        }
        /*((v1 * p1) + (v2 * p2) + (v3 * p3) / p1 + p2 +p3)*/


        sc.close();
    }
}
