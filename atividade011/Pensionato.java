package atividade011;

import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PensionatoClass[] quartos = new PensionatoClass[10];

        System.out.print("\nDigite a quantidade de estudantes que vão alugar quartos (1 a 10): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nRegistro de Aluguel #" + (i + 1));

            System.out.print("Digite o nome do estudante: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Digite o e-mail do estudante: ");
            String email = sc.nextLine();

            int quarto;
            do {
                System.out.print("Digite o número do quarto escolhido (0 a 9): ");
                quarto = sc.nextInt();

                if (quartos[quarto] != null) {
                    System.out.println("\n=========================================");
                    System.out.println("Quarto já ocupado. Escolha outro quarto.");
                    System.out.println("=========================================\n");
                }

            } while (quartos[quarto] != null);

            quartos[quarto] = new PensionatoClass(nome, email);
            System.out.println("\n===============================");
            System.out.println("Aluguel registrado com sucesso!");
            System.out.println("===============================\n");
        }

        System.out.println("Ocupações do Pensionato:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println("Quarto " + i + ": " + quartos[i]);
            } else {
                System.out.println("Quarto " + i + ": Livre");
            }
        }

        sc.close();
    }
}
