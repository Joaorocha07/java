package AtividadeCondicional.ExercicioCondicional022;

import java.util.Scanner;

public class ExercicioCondicional022 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();
    
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
    
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    
        input.close();
    }
}
