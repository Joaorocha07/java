package atividade012;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de funcionários: ");
        int n = input.nextInt();

        ArrayList<Class> lista = new ArrayList<>();
        for (int cont=0; cont<n; cont++) {
            System.out.println("\nFuncionário #" + (cont+1) + ":");
            
            System.out.print("Id: ");
            int id = input.nextInt();
            input.nextLine();
            
            System.out.print("Nome: ");
            String nome = input.nextLine();
            
            System.out.print("Salário: ");
            double salario = input.nextDouble();
            lista.add(new Class(id, nome, salario));
        }

        System.out.print("\nDigite o id do funcionário que terá o salário aumentado: ");
        int id = input.nextInt();
        int pos = posicaoFuncionario(lista, id);
        if (pos == -1) {
            System.out.println("Funcionário não encontrado.");
        } else {
            System.out.print("Digite a porcentagem de aumento: ");
            double porcentagem = input.nextDouble();
            lista.get(pos).aumentarSalario(porcentagem);
        }

        System.out.println("\nLista de funcionários atualizada:");
        for (Class func : lista) {
            System.out.println(func);
        }

        input.close();
    }

    public static int posicaoFuncionario(ArrayList<Class> lista, int id) {
        for (int cont=0; cont<lista.size(); cont++) {
            if (lista.get(cont).getId() == id) {
                return cont;
            }
        }
        return -1;
    }
    
}
