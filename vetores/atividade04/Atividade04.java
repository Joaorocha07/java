package vetores.atividade04;

import java.util.Scanner;

public class Atividade04{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        int quantidadePares = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
            
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        
        System.out.println("\nNUMEROS PARES:");
        
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        
        System.out.println("\n\nQUANTIDADE DE PARES = " + quantidadePares);
        
        scanner.close();
    }
}
