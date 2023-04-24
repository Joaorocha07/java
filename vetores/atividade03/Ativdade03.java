package vetores.atividade03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativdade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        ArrayList<Class> pessoas = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Dados da " + i + "° pessoa:");
            
            System.out.print("Nome: ");
            String nome = sc.next();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            pessoas.add(new Class(nome, idade, altura));
        }
        
        double mediaAltura = calcularMediaAltura(pessoas);
        System.out.printf("%nAltura média: %.2f%n", mediaAltura);
        
        int countMenoresDe16 = 0;
        ArrayList<String> nomesMenoresDe16 = new ArrayList<>();
        
        for (Class p : pessoas) {
            if (p.getIdade() < 16) {
                countMenoresDe16++;
                nomesMenoresDe16.add(p.getNome());
            }
        }
        
        double percentMenoresDe16 = ((double) countMenoresDe16 / n) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentMenoresDe16);
        
        if (countMenoresDe16 > 0) {
            System.out.println("Nomes: ");
            for (String nome : nomesMenoresDe16) {
                System.out.println(nome);
            }
        }
        
        sc.close();
    }
    
    public static double calcularMediaAltura(ArrayList<Class> pessoas) {
        double somaAlturas = 0.0;
        
        for (Class p : pessoas) {
            somaAlturas += p.getAltura();
        }
        
        return somaAlturas / pessoas.size();
    }
}

