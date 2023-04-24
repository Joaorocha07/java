package matriz.atividadedoismatriz;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();

        // preenche a matriz com valores aleatórios entre 0 e 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        // imprime a matriz
        System.out.println("Matriz gerada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // soma dos números ímpares
        int somaImpares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos números ímpares: " + somaImpares);

        // soma de cada coluna
        int[] somaColunas = new int[5];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }
        System.out.println("Soma de cada coluna:");
        for (int j = 0; j < somaColunas.length; j++) {
            System.out.println("Coluna " + (j+1) + ": " + somaColunas[j]);
        }

        // soma de cada linha
        int[] somaLinhas = new int[5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }
        System.out.println("Soma de cada linha:");
        for (int i = 0; i < somaLinhas.length; i++) {
            System.out.println("Linha " + (i+1) + ": " + somaLinhas[i]);
        }
    }
}
