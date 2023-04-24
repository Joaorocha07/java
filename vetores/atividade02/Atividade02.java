package vetores.atividade02;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Quantos números você vai digitar? ");
    int n = input.nextInt();

    Class vetor = new Class(n);
    vetor.lerNumeros();
    vetor.imprimirNumeros();
    vetor.calcularSomaEMedia();
    input.close();
    
    }
}

