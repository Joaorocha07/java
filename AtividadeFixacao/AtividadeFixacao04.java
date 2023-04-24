package AtividadeFixacao;

import java.util.Scanner;

public class AtividadeFixacao04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o valor do raio: ");
        double raio = input.nextDouble();

        final double pi = 3.14; 

        double circunferencia = 2 * pi * raio;

        System.out.println("\nA circunferência é: " + circunferencia);

        input.close();

    }
}
