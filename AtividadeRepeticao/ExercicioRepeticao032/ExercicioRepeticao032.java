package AtividadeRepeticao.ExercicioRepeticao032;

import java.util.Scanner;

public class ExercicioRepeticao032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanas vezes quer que o programa rode?");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            
            double media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("\nA sua media: %.1f%n", media);   

        }
        
        input.close();
    }
}
