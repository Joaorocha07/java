package AtividadeSequencial.ExercicioSequencial015;

import java.util.Scanner;

public class ExercicioSequencial015 {
    public static void main(String[] args) {

        int codigo, horas;
        float valor, salario;

        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("\nInforme seu codigo de funcionario: ");
            codigo = input.nextInt();

            System.out.println("\nInforme suas horas trabalhadas: ");
            horas = input.nextInt();

            System.out.println("\nInforme o valor de sua hora trabalhada: ");
            valor = input.nextInt();

        }
        
        salario = (float) (horas * valor);
        
        System.out.println("Dados de entrada: ");
        System.out.println("Codigo do funcionario = " + codigo);
        System.out.println("Horas trabalhadas = " + horas);
        System.out.println("Valor da hora = " + valor);
        System.out.println("Dados de saida: ");
        System.out.printf("Salario do funcionario = R$ %.2f reais. %n", salario);

    }
}
