package AtividadeSequencial.ExercicioSequencial018;

import java.util.Scanner;

public class ExercicioSequencial018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double triangulo = (a * c) / 2.0;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2.0;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("\nTRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        input.close();
    }
}
