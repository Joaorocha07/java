// package composicao;

// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import java.util.Locale;
// import java.util.Scanner;

// import composicao.Trabalhador;

// public class Program {
//     public static void main(String[] args) {
    
//         Locale.setDefault(Locale.US);
    
//         Scanner input = new Scanner(System.in);

//         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//         System.out.print("\nDigite o nome do departamento: ");
//         String departamento = input.nextLine();

//         System.out.print("Insira os dados do trabalhador");
//         System.out.print("Nome: ");
//         String nome = input.nextLine();

//         System.out.print("Nivel: ");
//         String nivel = input.nextLine();

//         System.out.println("Base salarial: ");
//         double baseSalarial = input.nextDouble();

//         // Trabalhador trabalhador = new Trabalhador(nome, Trabalhador.valueOf(trabalhador), baseSalarial, new Departamento(departamento));

//         System.out.print("\nQuantos contratos para este trabalhador: ");
//         int num = input.nextInt();

//         for(int i = 1; i <= num; i++) {
//             System.out.print("Insira os dados do #" + i + "° Contrato:");
//             System.out.print("\nData (DD/MM/YYYY): ");
//             // Date dataDoContrato = sdf.parse(input.next());
//             System.out.print("\nValor por hora: ");
//             double valorPorHora = input.nextDouble();
//             System.out.print("\nDuração (horas): ");
//             int horas = input.nextInt();
//             // HoraContrato contrato = new HoraContrato(dataDoContrato, valorPorHora, horas);
//             // Trabalhador.addContrato(contrato);
//         }

//         System.out.println();
//         System.out.print("Digite o mês e o ano para calcular o rendimento (MM/AAAA): ");
//         String mesAndAno = input.next();
//         int mes = Integer.parseInt(mesAndAno.substring(0,2));
//         int ano = Integer.parseInt(mesAndAno.substring(3));
//         System.out.print("Nome: " + trabalhador.getNome());
//         System.out.print("Departamento: " + trabalhador.getDepartamento().getNome());
//         System.out.print("Renda para " + mesAndAno + ": " + String.format("%.2f", trabalhador.income(ano, mes)));

//         input.close();

//     }

// }
