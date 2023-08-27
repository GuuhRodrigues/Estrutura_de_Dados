package br.newtonpaiva.exercicios;

import java.util.Scanner;

public class Ex2_Dignostica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int armario, prateleira, quantidade;
        int[][] estoque = new int[4][5];
        boolean continuar = true;

        while (continuar) {
            System.out.println("Entre com o número do armário (0 à 4): ");
            armario = ler.nextInt();
            System.out.println("Entre com o número da prateleira (0 à 3): ");
            prateleira = ler.nextInt();
            System.out.println("Entre com a quantidade de caixa que deseja adicionar: ");
            quantidade = ler.nextInt();

            if (armario >= 0 && armario < 5 && prateleira >= 0 && prateleira < 4) {
                for (int i = 0; i < 5; i++) {
                    int somaArmario = 0;
                    somaArmario += quantidade;
                    for (int j = 0; j < 4; j++) {
                        somaArmario += estoque[j][armario];
                    }
                    if (somaArmario > 10) {
                        System.out.println("Espaço insuficiente, armário cheio !");
                        break;
                    }
                    else{
                        estoque[prateleira][armario] += quantidade;
                        System.out.println("Caixa adicionada com sucesso à prateleira " + prateleira + " e ao armário " + armario);
                    }
                    int somaPrateleira = 0;
                    somaPrateleira += quantidade;
                    somaPrateleira += estoque[prateleira][i];
                    if (somaPrateleira > 10) {
                        System.out.println("Espaço insuficiente, prateleira cheia !");
                        break;
                    }
                    else{
                        estoque[prateleira][armario] += quantidade;
                        System.out.println("Caixa adicionada com sucesso à prateleira " + prateleira + " e ao armário " + armario);
                    }
                }
            }
            else {
                System.out.println("Armario ou prateleira inexistente !");
            }
            if (quantidade > 10) {
                System.out.println("Quantidade inválida, máximo 10 caixas !");
            }
            System.out.println("Deseja continuar adicionando caixas ? (S/N)");
            String opcao = ler.next();
            if (opcao.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        System.out.println("A quantidade de caixas em cada prateleira/armário é ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(estoque[i][j] + " ");
            }
            System.out.println();
        }
    }
}
