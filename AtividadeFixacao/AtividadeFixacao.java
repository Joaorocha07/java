package AtividadeFixacao;

import java.util.Scanner;

public class AtividadeFixacao {
        
    private double largura;
    private double altura;

    public AtividadeFixacao(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea() {
        return largura * altura;
    }

    public double getPerimetro() {
        return 2 * (largura + altura);
    }

    public double getDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a largura e a altura do retângulo:");
        double largura = scanner.nextDouble();
        double altura = scanner.nextDouble();

        AtividadeFixacao retangulo = new AtividadeFixacao(largura, altura);

        System.out.printf("AREA = %.2f%n", retangulo.getArea());
        System.out.printf("PERIMETERO = %.2f%n", retangulo.getPerimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.getDiagonal());

        scanner.close();

    }
}


