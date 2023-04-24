package vetores.atividade06;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = input.nextInt();
        
        double[] vetor = new double[N];
        double soma = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();
            soma += vetor[i];
        }
        
        double media = soma / N;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < N; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f%n", vetor[i]);
            }
        }

        input.close();

    }
}

