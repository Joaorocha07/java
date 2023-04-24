package AtividadeSequencial.ExercicioSequencial013;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial013 {
    public static void main(String[] args, Scanner scanner) {

        double raio, area, pi = 3.14159;
        Locale.setDefault(Locale.US);
            
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("\nDigite o valor do raio: ");
            
            raio = input.nextDouble();
            
        }

        area = (pi) * (raio * raio);

        System.out.printf("\nO valor total é: %.4f area %n", area);
            

        

    }
}
