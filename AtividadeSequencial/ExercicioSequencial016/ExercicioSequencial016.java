package AtividadeSequencial.ExercicioSequencial016;
import java.util.Scanner;

public class ExercicioSequencial016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor recebido por hora: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}
