package Unidade_5;

import java.util.Scanner;

public class Uni5Exe5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("quantos numeros vc quer");
        int n = teclado.nextInt();
        int numero = 8;
        int soma = 0;
        for (int i = 2; i <= n; i++) {
            System.out.print(numero + " , " + (numero + 2) + " , ");
            soma = soma + numero + (numero + 2);
            numero = numero * 2;
        }
        
    }
}
