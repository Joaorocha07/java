package vetores.atividade03;

public class Class {
    private String nome;
    private int idade;
    private double altura;
    
    public Class(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public double getAltura() {
        return altura;
    }
}
