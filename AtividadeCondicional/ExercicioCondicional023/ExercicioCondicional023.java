package AtividadeCondicional.ExercicioCondicional023;

import java.util.Scanner;

public class ExercicioCondicional023 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 

        int codigo = input.nextInt();
        int quantidade = input.nextInt();
    
        double total;
    
        if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }
    
        System.out.printf("Total: R$ %.2f\n", total);
    
        input.close();
    
    }
}
