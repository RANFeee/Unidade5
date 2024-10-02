package Unidade_5;

import java.util.Scanner;

public class TesteUni5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalPares = 0;
        for (int i = 1; i <= 100; i++){
            //totalPares += i % 2 == 0 ? i : 0; uso ternario
            if (i % 2 == 0) {
                totalPares++;
            }
        }
        System.out.println(totalPares);
        teclado.close();
    }
}
