package AtividadeRepeticao.ExercicioRepeticao029;

import java.util.Scanner;

public class ExercicioRepeticao029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = 0;
        while (tipo != 4) {
            tipo = input.nextInt();

            if (tipo == 1) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            } else if (tipo == 4) {
                System.out.println("\nMUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                break;
            } else {
                System.out.println("Código inválido. Tente novamente.");
            }
        }

        input.close();
    }
}
