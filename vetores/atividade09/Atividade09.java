package vetores.atividade09;

import java.util.Scanner;

public class Atividade09{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = input.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Dados da %da pessoa:\n", i+1);
            
            System.out.println("Nome: ");
            nomes[i] = input.next();
            
            System.out.println("Idade: ");
            idades[i] = input.nextInt();
        }
        
        int indiceMaiorIdade = 0;
        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[indiceMaiorIdade]) {
                indiceMaiorIdade = i;
            }
        }

        input.close();
        
        System.out.println("PESSOA MAIS VELHA: " + nomes[indiceMaiorIdade]);
    }
}
