package AtividadeRepeticao.ExercicioRepeticao031;

import java.util.Scanner;

public class ExercicioRepeticao031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int in = 0;
        int out = 0;
        
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        
        System.out.printf("%d \nDentro do intervalo %n", in);
        System.out.printf("%d Fora do intervalo %n", out);
        
        input.close();
    }
}
