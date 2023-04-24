package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        metodo1();
        System.out.println("Programa Encerrado");
    }

    public static void metodo1() {
        System.out.println("*** INICIO MÉTODO 1 ***");
        metodo2();
        System.out.println("*** FIM MÉTODO 1 ***");
    }

    public static void metodo2() {
        System.out.println("*** INICIO MÉTODO 2 ***");
        Scanner input = new Scanner(System.in);

        try {
            String[] vetor = input.nextLine().split(" ");
            int posicao = input.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!");
            e.printStackTrace();
            input.next();
        } catch(InputMismatchException e) {
            System.out.println("Erro na entrada de dados!");
        }

        input.close();
        System.out.println("*** FIM MÉTODO 2 ***");
    }

}
