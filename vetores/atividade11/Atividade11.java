package vetores.atividade11;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
    
        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        double somaAlturasMulheres = 0;
        int numHomens = 0;
    
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.printf("Altura da %da pessoa: ", i);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa (M/F): ", i);
            char genero = sc.next().charAt(0);
    
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (genero == 'F') {
                somaAlturasMulheres += altura;
            } else {
                numHomens++;
            }
        }
    
        double mediaAlturasMulheres = somaAlturasMulheres / (n - numHomens);
    
        System.out.println();
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturasMulheres);
        System.out.printf("Numero de homens = %d%n", numHomens);
    
        sc.close();
    }
    
}
