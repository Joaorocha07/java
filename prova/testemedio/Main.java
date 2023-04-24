package testemedio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("\nDigite o número da conta bancária: ");
        int numero = input.nextInt();
        
        System.out.println("\nDigite o saldo inicial da conta bancária: ");
        double saldo = input.nextDouble();
        
        System.out.println("\nDigite o limite de crédito disponível na conta bancária: ");
        double limite = input.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(numero, saldo, limite);

        double valorDeposito = 0.0;

        double valorSaque = 0.0;

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n------------MENU------------");
            System.out.println("1 - VER SALDO");
            System.out.println("2 - VER EXTRATO");
            System.out.println("3 - DEPOSITAR");
            System.out.println("4 - SACAR");
            System.out.println("5 - SAIR DO CONTA");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("--------VER SALDO--------");
                    System.out.println("Seu saldo atual é: " + conta.consultarSaldo());
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("--------EXTRATO DA CONTA--------");
                    System.out.println("Saldo inicial: " + conta.getSaldo());
                    System.out.println("Depósito em dinheiro: " + valorDeposito);
                    System.out.println("Saque em dinheiro: " + valorSaque);
                    System.out.println("Saldo final: " + conta.consultarSaldo()); 
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println();
                    System.out.println("--------DEPOSITO DA CONTA--------");
                    System.out.println("Digite o valor do depósito: ");
                    valorDeposito = input.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("--------SACAR--------");
                    System.out.println("Digite o valor do saque: ");
                    valorSaque = input.nextDouble();
                    conta.sacar(valorSaque); 
                    System.out.println();
                    break;
                
                case 5:
                    System.out.println();
                    System.out.println("PROGRAMA ENCERRADO!");
                    System.out.println();
                    input.close();
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
    }
}
