package versaodolar.terceiraversao;

import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o preço do dólar?");
        double precoDolar = input.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        double quantidadeDolar = input.nextDouble();

        Conversor conversor = new Conversor(precoDolar, quantidadeDolar);

        System.out.printf("Valor a ser pago em reais = %.2f", conversor.calcularValorEmReais());

        input.close();
    }

}