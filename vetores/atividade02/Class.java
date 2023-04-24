

package vetores.atividade02;

import java.util.Scanner;

public class Class{
    private int n;
    private double[] numeros;

    public Class(int n) {
        this.n = n;
        numeros = new double[n];
    }

    public void lerNumeros() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = input.nextDouble();
        }
        input.close();
    }

    public void imprimirNumeros() {
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", numeros[i]);
        }
        System.out.println();
    }

    public void calcularSomaEMedia() {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += numeros[i];
        }
        double media = soma / n;
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);
    }
}