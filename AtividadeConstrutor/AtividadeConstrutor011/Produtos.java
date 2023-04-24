package AtividadeConstrutor.AtividadeConstrutor011;

import java.util.Locale;

public class Produtos {
    
    // Atributos
    private String produto1;
    private String produto2;
    private int idade;
    private int codigo;
    private char genero;
    private double preco1;
    private double preco2;
    private double medir;

    // Contrutor
    public Produtos(String produto1, String produto2, int idade, int codigo, char genero, double preco1, double preco2, double medir) {
        this.setProduto1(produto1);
        this.setProduto2(produto2);
        this.setIdade(idade);
        this.setCodigo(codigo);
        this.setGenero(genero);
        this.setPreco1(preco1);
        this.setPreco2(preco2);
        this.setMedir(medir);
    }

    // Metodos especiais
    public void setProduto1(String produto1) {
        this.produto1 = produto1;
    }

    public String getProduto1() {
        return produto1;
    }

    public void setProduto2(String produto2) {
        this.produto2 = produto2;
    }

    public String getProduto2() {
        return produto2;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setMedir(double medir) {
        this.medir = medir;
    }

    public double getMedir() {
        return medir;
    }

    public void mostrarVariaveis() {
        System.out.println();
        System.out.println("Produtos");
        System.out.printf("%s, Computador, cujo preço é $%.2f%n", this.getPreco1(), this.getPreco2());
        System.out.printf("%s, Mesa de escritório, cujo preço é $%.2f%n", this.getPreco1(), this.getPreco2());
        System.out.printf("Registro: %d anos, código %d e gênero: %c%n", this.getIdade(), this.getCodigo(), this.getGenero());
        System.out.printf("Medida com oito casas decimais %.8f%n", this.getMedir());
        System.out.printf("Arredondado (há casas decimais): %.3f%n", this.getMedir());
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal dos EUA: %.3f%n", this.getMedir());
        System.out.println();
    }
    

}
