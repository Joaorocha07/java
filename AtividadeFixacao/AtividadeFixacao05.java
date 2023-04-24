package AtividadeFixacao;

import java.util.Scanner;

public class AtividadeFixacao05 {

    public static void main(String[] args) {
        
        double cotacaoDolar;
        double valorReal;
        double valorDolar;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        cotacaoDolar = input.nextDouble();

        System.out.print("Digite o valor em reais: ");
        valorReal = input.nextDouble();

        valorDolar = valorReal / cotacaoDolar;
        System.out.printf("Valor em dólares: %.2f\n", valorDolar);

        System.out.printf("Valor total em reais: %.2f\n", valorReal);

        input.close();

    }
}

