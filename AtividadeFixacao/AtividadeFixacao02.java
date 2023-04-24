package AtividadeFixacao;

import java.util.Scanner;

public class AtividadeFixacao02 {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public AtividadeFixacao02(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double percentage) {
        salarioBruto += salarioBruto * (percentage / 100.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Salario Bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Imposto: ");
        double tax = scanner.nextDouble();

        AtividadeFixacao02 funcionario = new AtividadeFixacao02(name, salarioBruto, tax);

        System.out.printf("Funcionario: %s, $ %.2f%n", funcionario.getNome(), funcionario.getSalarioLiquido());

        System.out.print("Qual percentual quer aumentar o seu salário?");
        double percentage = scanner.nextDouble();
        funcionario.aumentarSalario(percentage);

        System.out.printf("Dados atualizados: %s, $ %.2f%n", funcionario.getNome(), funcionario.getSalarioLiquido());

        scanner.close();
    }
}
