package vetores.atividade01;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos numeros quer digitar: ");
        int numeros = sc.nextInt();
        double[] vetor = new double[numeros]; 
        int numerosNegativos = 0;

        for(int x = 0; x < numeros; x++){ 

            System.out.println("Digite o " + (x + 1) + " número: ");
            double n = sc.nextDouble();
            vetor[x] = n; 

            if(n < 0) {
                numerosNegativos++;
            } 
        }

        if(numerosNegativos > 0) {
            System.out.println("Numeros negativos:");
            for (int i = 0; i < numeros; i++) {
                if(vetor[i] < 0) {
                    System.out.println(vetor[i]);
                }
            }
        } else {
            System.out.println("Não há números negativos.");
        }

        sc.close();
    }
}