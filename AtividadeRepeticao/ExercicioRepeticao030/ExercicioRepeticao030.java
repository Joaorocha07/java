package AtividadeRepeticao.ExercicioRepeticao030;

import java.util.Scanner;

public class ExercicioRepeticao030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println("\nValores impares");

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
