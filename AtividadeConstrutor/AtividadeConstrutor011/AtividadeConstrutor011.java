package AtividadeConstrutor.AtividadeConstrutor011;

import java.util.Scanner;

public class AtividadeConstrutor011 {
    public static void main(String[] args) {

        Produtos teste = new Produtos("Computer", "Ofice Desk", 30, 5290, 'F', 2100.0, 650.0, 53.234567);

        teste.mostrarVariaveis();

        Scanner input = new Scanner(System.in);
        
        int idade;
        double salario;
        String nome;

        System.out.println("Digite a sua idade:");
        idade = input.nextInt();

        System.out.println("\nDigite seu salario:");
        salario = input.nextDouble();

        System.out.println("\nDigite seu nome:");
        nome = input.next();

        System.out.println("\nSeu nome é " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Seu salario é " + salario + "\n");

        input.close();


    }
}
