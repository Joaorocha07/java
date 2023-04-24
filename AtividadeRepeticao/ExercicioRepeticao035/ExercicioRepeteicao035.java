package AtividadeRepeticao.ExercicioRepeticao035;

import java.util.Scanner;

public class ExercicioRepeteicao035 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        
        do {
            System.out.println();
            System.out.print("Informe um número positivo: ");
            n = sc.nextInt();
            
            if (n <= 0) {
                System.out.println("\nO número deve ser positivo.");
            }
        } while (n <= 0);
        
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }
        System.out.println();
        
        sc.close();

    }
}
