package matriz.ativididadetresmatriz;

import java.util.Random;

public class Atividade03 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][5];

        Random random = new Random();

        // preenche a matriz com valores aleatórios entre 0 e 9
        for (int cont = 0; cont < matriz.length; cont++) {
            for (int j = 0; j < matriz[cont].length; j++) {
                matriz[cont][j] = random.nextInt(10);
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

    }
}
