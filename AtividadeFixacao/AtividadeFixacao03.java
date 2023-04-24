package AtividadeFixacao;

import java.util.Scanner;

public class AtividadeFixacao03 {
    private double grau1, grau2, grau3;
    
    public AtividadeFixacao03(String nome, double grau1, double grau2, double grau3) {
        this.grau1 = grau1;
        this.grau2 = grau2;
        this.grau3 = grau3;
    }
    
    public double notaFinal() {
        return grau1 + grau2 + grau3;
    }
    
    public boolean aprovados() {
        return notaFinal() >= 60.0;
    }
    
    public double faltandoPontos() {
        if (aprovados()) {
            return 0.0;
        } else {
            return 60.0 - notaFinal();
        }
    }
    
    public void printInfo() {
        System.out.printf("NOTA FINAL = %.2f%n", notaFinal());
        if (aprovados()) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
            System.out.printf("FALTANDO %.3f PONTOS%n", faltandoPontos());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Insira a nota do primeiro trimestre: ");
        double grau1 = sc.nextDouble();
        System.out.print("Insira a nota do segundo trimestre: ");
        double grau2 = sc.nextDouble();
        System.out.print("Insira a nota do terceiro trimestre: ");
        double grau3 = sc.nextDouble();
        AtividadeFixacao03 estudante = new AtividadeFixacao03(nome, grau1, grau2, grau3);
        estudante.printInfo();
        sc.close();
    }
}
