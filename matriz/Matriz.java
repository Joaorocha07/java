package matriz;

import java.util.Scanner;

public class Matriz
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leitura dos valores M e N
        System.out.print("Digite a quantidade de linhas da matriz: ");
        int m = sc.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int n = sc.nextInt();

        // criação da matriz e leitura dos valores
        int[][] matriz = new int[m][n];
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // leitura do valor a ser buscado na matriz
        System.out.print("Digite o valor a ser buscado na matriz: ");
        int x = sc.nextInt();

        // busca por todas as ocorrências de x na matriz e exibe os valores ao redor
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Ocorrência de " + x + " na posição (" + i + ", " + j + ")");
                    if (j > 0) {
                        System.out.println("Valor à esquerda: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Valor acima: " + matriz[i-1][j]);
                    }
                    if (j < n-1) {
                        System.out.println("Valor à direita: " + matriz[i][j+1]);
                    }
                    if (i < m-1) {
                        System.out.println("Valor abaixo: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}

