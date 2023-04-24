package testefacil;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas;
    private int[][] matriz;

    public Aluno(String nome, int idade, double[] notas, int[][] matriz) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
        this.matriz = matriz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public int contarNumerosPares() {
        int count = 0;
        for (int[] linha : matriz) {
            for (int num : linha) {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public void status() {
        System.out.println();
        System.out.println("Nome: "     + this.getNome());
        System.out.println("Idade: "    + this.getIdade());
        System.out.println("Notas: "    + notas[0] + ", " + notas[1]+ ", " + notas[2]+ ", " + notas[3] );
        System.out.println("Notas: "    + this.calcularMedia());
        System.out.println("Números pares na matriz: " + this.contarNumerosPares());
        System.out.println();
    }

}
