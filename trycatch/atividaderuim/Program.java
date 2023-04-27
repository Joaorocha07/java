package trycatch.atividaderuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int numeroDoQuarto = sc.nextInt();
        
        System.out.println("Digite a data de entrada:");
        Date entrada = sdf.parse(sc.next());
        
        System.out.println("Digite a data de saída:");
        Date saida = sdf.parse(sc.next());

        if(!saida.after(entrada)) {
            System.out.println("ERRO NA RESERVA: DATA DE SAÍDA ANTERIOR A DATA DE ENTRADA!!");
        } else {
            Reserva reserva = new Reserva(numero, entrada, saida);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.print("Entre com a data para atulizar a reserva");
            System.out.print("Data de entrada: (dd/MM/yyyy): ");
            entrada = sdf.parse(sc.next());
            
            System.out.print("Data de Saída: (dd/MM/yyyy): ");
            saida = sdf.parse(sc.next());

            Date dataAtual = new Date();
            if(entrada.before(dataAtual) || saida.before(dataAtual)) {
                System.out.println("ERRO NA RESERVA: RESERVAS SOMENTE PODEM SER FEITAS COM DATAS FUTURAS!! ");
            } else if(!saida.after(entrada)) {
                System.out.println("ERRO NA RESERVA: DATA DE SAÍDA ANTERIOR A DATA DE ENTRADA!!");
            } else {
                reserva.atualizaData(entrada, saida);
                System.out.println("Reserva: " + reserva);
            }
        }
        sc.close();

    }

}
