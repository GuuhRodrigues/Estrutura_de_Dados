package br.newtonpaiva.exercicios;

import java.util.Scanner;

public class Ex1_Diagnostica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[8];
        int somaMaior30 = 0, somaTotal = 0, qtdMaior30 = 0;

        for (int i = 0; i < 8; i++){
            System.out.println("Entre com " + (i + 1) + "º número inteiro: ");
            vetor[i] = ler.nextInt();
        }
        System.out.println("Imprimindo os números do vetor: ");
        for (int num : vetor) {
            System.out.print(num + " ");
            if (num > 30){
                qtdMaior30++;
                somaMaior30 += num;
            }
            somaTotal += num;
        }
        System.out.println("\nExistem " + qtdMaior30 + " números maior que 30");
        System.out.println("A soma dos números maior que 30 é " +somaMaior30);
        System.out.println("A soma total de todos os elementos do vetor é "+somaTotal);
    }
}
