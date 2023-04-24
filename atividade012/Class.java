package atividade012;

public class Class {
    
    private int id;
    private String nome;
    private double salario;

    public Class(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem) {
        double aumento = salario * porcentagem / 100.0;
        salario += aumento;
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

}
