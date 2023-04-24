package Exemplos;

import java.util.Scanner;

public class Exemplo08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
    
        double p1 = (n1 + n2 + n3) / 2;

        double area1 = (Math.sqrt(p1 * (p1 - n1) * (p1 - n2) * (p1 - n3) ));
    
        System.out.println();

        double n4 = input.nextDouble();
        double n5 = input.nextDouble();
        double n6 = input.nextDouble();

        double p2 = (n4 + n5 + n6) / 2;

        double area2 = (Math.sqrt(p2 * (p2 - n4) * (p2 - n5) * (p2 - n6) ));

        System.out.println();
        if (area1 > area2) {
            System.out.println("A area1 é o menor " + area1);
            System.out.println("A area2 é o maior " + area2);
        } else {
            System.out.println("A area1 é o menor " + area1);
            System.out.println("A area2 é o maior " + area2);
        }

        input.close();

    }
}
