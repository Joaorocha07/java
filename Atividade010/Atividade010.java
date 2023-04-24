package Atividade010;

import java.util.Scanner;

public class Atividade010 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            double media;
            int x, qtdPessoa;
            
            double soma = 0.0;

            System.out.println("\nDigite quantas pessoas quer cadastrar: ");
            qtdPessoa = input.nextInt();
            double[] vetor = new double[qtdPessoa]; 

            System.out.println();

            for(x = 0;x < qtdPessoa; x++) {
                System.out.println("Digite a altura da " + (x + 1) + "° pessoa:");
                vetor[x] = input.nextDouble(); 
                soma += vetor[x];
            }
      
            media = soma / qtdPessoa;
            
            System.out.println("Sua média é: " + media);

            input.close();
        }

    }
}
