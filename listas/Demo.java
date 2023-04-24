package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Marco");

        System.out.println(list.size());
        for(String cont : list) {
            System.out.println(cont);
        }

        System.out.println("-------------------");
        list.removeIf(cont -> cont.charAt(0) == 'M');
        for(String cont : list) {
            System.out.println(cont);
        }

        System.out.println("------------------------");
        System.out.println("Índice do Bob: " + list.indexOf("Bob"));
        System.out.println("Índice do Marco: " + list.indexOf("Marco"));
        System.out.println("------------------------");
        List<String> resultado = list.stream().filter(cont -> cont.charAt(0) == 'A').collect(Collectors.toList());
    
        for(String cont : resultado) {
            System.out.println(cont);
        }

        System.out.println("------------------------");
        String nome = list.stream().filter(cont -> cont.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);

    }
}
