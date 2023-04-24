package vetores.atividade10;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        double[][] notas = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nDigite nome, primeira e segunda nota do %do aluno:\n", i+1);
            scanner.nextLine();
            nomes[i] = scanner.nextLine();
            notas[i][0] = scanner.nextDouble();
            notas[i][1] = scanner.nextDouble();
        }

        System.out.println("\nAlunos aprovados:");

        for (int i = 0; i < n; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }

}

