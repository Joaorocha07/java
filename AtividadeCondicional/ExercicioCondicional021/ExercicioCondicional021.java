package AtividadeCondicional.ExercicioCondicional021;

import java.util.Scanner;

public class ExercicioCondicional021 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("\nDigite o segundo número: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("\nSao Multiplos");
        } else {
            System.out.println("\nNao sao Multiplos");
        }

        input.close();

    }
}
