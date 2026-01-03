package estrutura_cond05;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produtos> lista = new ArrayList<>();

        Produtos p1 = new Produtos();
        p1.codigo = "1";
        p1.espec = "Cachorro Quente";
        p1.valor = 4.00;

        Produtos p2 = new Produtos();
        p2.codigo = "2";
        p2.espec = "X-Salada";
        p2.valor = 4.50;

        Produtos p3 = new Produtos();
        p3.codigo = "3";
        p3.espec = "X-Bacon";
        p3.valor = 5.00;

        Produtos p4 = new Produtos();
        p4.codigo = "4";
        p4.espec = "Torrada simples";
        p4.valor = 2.00;

        Produtos p5 = new Produtos();
        p5.codigo = "5";
        p5.espec = "Refrigerante";
        p5.valor = 1.50;

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        
        System.out.print("Digite o código do produto: ");
        String codigoDigitado = sc.next();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double total = 0.0;
        boolean encontrado = false;

       
        for (Produtos p : lista) {
            if (p.codigo.equals(codigoDigitado)) {
                total = p.valor * quantidade;
                encontrado = true;

                System.out.println("Produto: " + p.espec);
                break;
            }
        }

        
        if (encontrado) {
            System.out.println("Total a pagar: R$ " + total);
        } else {
            System.out.println("Código de produto inválido!");
        }

        sc.close();
    }
}
