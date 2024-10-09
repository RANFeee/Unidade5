package Unidade_5;

import java.util.Scanner;

public class Uni5Exe9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quatidade de alunos...");
        int qtdAluno = teclado.nextInt();
        String aluno18 = "";
        int contagemDeAlunos20 = 0;
        for (int i = 0; i < qtdAluno; i++) {
            System.out.print("Nome do aluno "+(i + 1)+": ");
            String nome = teclado.next();
            System.out.print("Idade do "+ nome +": ");
            int idade = teclado.nextInt();
            
            if (idade == 18){
                aluno18 += nome ;
            
            } 
            if (idade > 20){
                contagemDeAlunos20 ++;
                
            }
        }
        System.out.println("Alunos com 18 anos: " + aluno18 + " ");
        System.out.println("Quantidade de alunos com mais de 20 anos: " + contagemDeAlunos20);
        teclado.close();
    }
}
