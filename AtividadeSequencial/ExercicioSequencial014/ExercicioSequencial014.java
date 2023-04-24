package AtividadeSequencial.ExercicioSequencial014;

import java.util.Scanner;

public class ExercicioSequencial014 {
    public static void main(String[] args) {

    int A, B, C, D, diferenca;

    try (Scanner input = new Scanner(System.in)) {

        System.out.println("\nInforme o valor de A: ");
        A = input.nextInt();

        System.out.println("\nInforme o valor de B: ");
        B = input.nextInt();
        
        System.out.println("\nInforme o valor de C: ");
        C = input.nextInt();

        System.out.println("\nInforme o valor de D: ");
        D = input.nextInt();
        
    }

    diferenca = ((A * B) - (C * D));
    System.out.println("\nDados de entrada: ");
    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
    System.out.println(D);
    System.out.println("\nDados de saida: ");
    System.out.printf("Diferenca = " + diferenca + "\n");
    
    }
}
