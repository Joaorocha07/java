package Exemplos;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        double preco, desconto;

        Scanner input = new Scanner(System.in);
        preco = input.nextDouble();

        desconto =  (preco < 20.0) ? preco * 0.1 : preco * 0.5;

        System.out.println("Seu desconto é: " + desconto);
        
        input.close();

    }
}
