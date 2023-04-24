package Atividade009;

import java.util.Scanner;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void status() {
        System.out.println("\nNome do produto -> " + this.nome);
        System.out.println("Preço do preco -> " + this.preco);
        System.out.println("Quantidade do quantidade -> " + this.quantidade);
        System.out.println();
    }

    public void questionario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os dados do produtos!");
        System.out.println("\nNome do produto: ");
        nome = input.nextLine();
        System.out.println("\nDigite o preço: ");
        preco = input.nextDouble();
        System.out.println("\nQuantidade: ");
        quantidade = input.nextInt();
        input.close();
    }

}





