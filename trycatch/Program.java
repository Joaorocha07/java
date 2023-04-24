package trycatch;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] vetor = input.nextLine().split(" ");
        int posicao = input.nextInt();
        System.out.println(vetor[posicao]);

        input.close();

    }
}
