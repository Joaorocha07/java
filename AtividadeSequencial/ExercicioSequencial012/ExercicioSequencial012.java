package AtividadeSequencial.ExercicioSequencial012;

import java.util.Scanner;

public class ExercicioSequencial012 {
    public static void main(String[] args) {

        int valor1, valor2, soma;

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("\nDigite o primeiro valor: ");
            valor1 = input.nextInt();

            System.out.println("\nDigite o segundo valor: ");
            valor2 = input.nextInt();
            
        }

        soma = valor1 + valor2;

        System.out.println("\nO valor total é: " + soma + "\n");

    }
}
