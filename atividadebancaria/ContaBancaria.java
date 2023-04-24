package atividadebancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numero_conta = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Informe o nome do titular da conta: ");
        String nome_titular = sc.nextLine();

        System.out.print("Deseja realizar um depósito inicial? (s/n) ");
        char opcao = sc.next().charAt(0);

        double saldo_inicial = 0.0;
        if (opcao == 's') {
            System.out.print("Informe o valor do depósito inicial: ");
            saldo_inicial = sc.nextDouble();
        }

        Banco conta = new Banco(numero_conta, nome_titular, saldo_inicial);

        int escolha = 0;
        while (escolha != 4) {
            System.out.println("\n----------MENU----------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção desejada: ");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Informe o valor a ser depositado: ");
                    double valor_deposito = sc.nextDouble();
                    conta.depositar(valor_deposito);
                    break;

                case 2:
                    System.out.print("Informe o valor a ser sacado: ");
                    double valor_saque = sc.nextDouble();
                    conta.sacar(valor_saque);
                    break;

                case 3:
                    System.out.println("Saldo: R$" + conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}


