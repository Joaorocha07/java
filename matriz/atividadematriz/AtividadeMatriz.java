package matriz.atividadematriz;

public class AtividadeMatriz {
    public static void main(String[] args) {
        
        char[][] matriz = 
        {{'a', 'b', 'c', 'd', 'e'},
        {'f', 'g', 'h', 'i', 'j'},
        {'l', 'm', 'n', 'o', 'p'},
        {'q', 'r', 's', 't', 'u'}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
