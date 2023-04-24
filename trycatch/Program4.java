package trycatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        File arquivo = new File("teste");
        Scanner input = null;

        try {
            input = new Scanner(arquivo);
            while(input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
