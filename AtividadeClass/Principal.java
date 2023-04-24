package AtividadeClass;

import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();
        
        System.out.println();
        
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();
    
        double p = (x.a + x.b + x.c) / 2;
        double areaX = (Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c) ));
        
        p = (y.a + y.b + y.c) / 2;
        double areaY = (Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c) ));

        System.out.println();
        if (areaX > areaY) {
            System.out.println("A area1 é o menor " + areaX);
            System.out.println("A area2 é o maior " + areaY);
        } else {
            System.out.println("A area1 é o menor " + areaX);
            System.out.println("A area2 é o maior " + areaY);
        }

        input.close();

    }
}

