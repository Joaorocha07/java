package AtividadeRepeticao.ExercicioRepeticao028;

import java.util.Scanner;

public class ExercicioRepeticao028 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        while (true) {
            int x = input.nextInt();
            int y = input.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }

        input.close();
        
    }
}
