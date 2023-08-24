package br.newtonpaiva.exercicios;

import java.util.Scanner;

public class Ex2_Dignostica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int armario, prateleira;
        int[][] estoque = new int[4][5];
        boolean continuar = true;

        while (continuar){
            System.out.println("Entre com o número do armário (0 à 4): ");
            armario = ler.nextInt();
            System.out.println("Entre com o número da prateleira (0 à 3): ");
            prateleira = ler.nextInt();

            if(armario > 4 | armario < 0 | prateleira > 3 | prateleira < 0) {
                System.out.println("Armario ou prateleira inexistente !");
            }
            if (estoque[prateleira][armario] >= 10){
                System.out.println("Espaço insuficiente na prateleira e armário selecionados !");
            }
            else {
                estoque[prateleira][armario]++;
                System.out.println("Caixa adicionada com sucesso à prateleira " + prateleira + " e ao armário " + armario);
            }
            System.out.println("Deseja continuar adicionando caixas ? (S/N)");
            String opcao = ler.next();
            if (opcao.equalsIgnoreCase("N")){
                continuar = false;
            }
        }
        System.out.println("A quantidade de caixas em cada prateleira/armário é ");
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(estoque[i][j] + " ");
            }
            System.out.println();
        }
    }
}
