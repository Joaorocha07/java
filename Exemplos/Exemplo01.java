package Exemplos;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        String dia;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        switch(x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-Feira";
                break;
            case 4:
                dia = "";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6: 
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }

        input.close();

        System.out.println("Dia da semana " + dia);

    }
}
