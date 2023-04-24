package testefacil;

public class Main {
    public static void main(String[] args) {

        double[] notas = {7.5, 8.0, 6.5, 9.0};
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Aluno aluno = new Aluno("João", 20, notas, matriz);

        aluno.status();

    }

}
