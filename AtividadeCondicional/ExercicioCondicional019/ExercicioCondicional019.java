package AtividadeCondicional.ExercicioCondicional019;

import java.util.Scanner;

public class ExercicioCondicional019 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        if(valor < 0) {
            System.out.println("NEGATIVO");
        } else if(valor == 0) {
            System.out.println("NEUTRO");
        } else {
            System.out.println("POSITIVO");
        }
        
        input.close();

    }
}
