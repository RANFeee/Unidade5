package Unidade5;
import java.util.Scanner;

public class Uni5Exe6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("informe a altura do aluno: ");
            double altura = teclado.nextDouble();
            soma += altura;

        }
        System.out.printf("a soma total é: %.2f",soma);


        teclado.close();
    }
}
