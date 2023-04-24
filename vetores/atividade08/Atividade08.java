package vetores.atividade08;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = input.nextInt();
        
        int[] vetor = new int[N];
        int somaPares = 0;
        int numPares = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                numPares++;
            }
        }
        
        if (numPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double mediaPares = (double) somaPares / numPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        }

        input.close();

    }
}
