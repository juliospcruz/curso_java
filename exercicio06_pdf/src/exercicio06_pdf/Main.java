package exercicio06_pdf;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pi = 3.14159;

        // a) Área do triângulo retângulo
        double triangulo = (A * C) / 2.0;

        // b) Área do círculo
        double circulo = pi * C * C;

        // c) Área do trapézio
        double trapezio = ((A + B) * C) / 2.0;

        // d) Área do quadrado
        double quadrado = B * B;

        // e) Área do retângulo
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
