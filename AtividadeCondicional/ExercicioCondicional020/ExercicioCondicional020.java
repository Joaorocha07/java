package AtividadeCondicional.ExercicioCondicional020;

import java.util.Scanner;

public class ExercicioCondicional020 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        if(valor %2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        input.close();

    }    
}
