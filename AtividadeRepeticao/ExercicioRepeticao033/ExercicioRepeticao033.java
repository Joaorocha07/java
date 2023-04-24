package AtividadeRepeticao.ExercicioRepeticao033;

import java.util.Scanner;

public class ExercicioRepeticao033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int fatorial = 1;
        
        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }
        
        System.out.println(fatorial);
        
        input.close();
    }
}
