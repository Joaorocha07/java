package exercicioresolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        System.out.print("\nEntre com o número de funcionários: ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++) {
            System.out.print("Dados do Funcionários #" + i);
            System.out.print("Funcionário tercerizado? (y/n) ");
            char ch = input.next().charAt(0);
            System.out.print("Nome do funcionário: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Quantidade de horas: ");
            int horas = input.nextInt();
            System.out.print("Valor por horas: ");
            double valorHoras = input.nextDouble();
            if(ch == 'y') {
                System.out.print("Digite a taxa adicional: ");
                double taxaAdicional = input.nextDouble();
                Funcionarios emp = new FuncionarioTerceiro(nome, horas, valorHoras, taxaAdicional);
                list.add(emp);
            } else {
                Funcionarios emp = new Funcionarios(nome, horas, valorHoras);
                list.add(emp);
            }

            System.out.println();
            System.out.println("PAGAMENTOS");
            for(Funcionarios emp : list) {
                System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
            }
        }

        input.close();

    }
}
