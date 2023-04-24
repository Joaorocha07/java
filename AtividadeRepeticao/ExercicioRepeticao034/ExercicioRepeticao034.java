package AtividadeRepeticao.ExercicioRepeticao034;

import java.util.Scanner;

public class ExercicioRepeticao034 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        System.out.println("\nDivisores de " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        
        input.close();
    }
}
