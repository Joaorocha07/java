package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try {
            String[] vetor = input.nextLine().split(" ");
            int posicao = input.nextInt();
            System.out.println(vetor[posicao]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Invalida!");
        } catch(InputMismatchException e) {
            System.out.println("Erro na entrada de dados!");
        }

        System.out.println("Programa Encerrado!");
        
        input.close();

    }
}
