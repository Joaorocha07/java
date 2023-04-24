package vetores.atividade05;

import java.util.Scanner;

public class Atividade05{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        int N = input.nextInt();
        
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < N; i++) {
            B[i] = input.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
        }
        
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < N; i++) {
            System.out.println(C[i]);
        }

        input.close();

    }
}


