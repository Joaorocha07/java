import javax.swing.JOptionPane;

public class Atividade001 {

    public static void main(String[] args) {
        final int NUM_PESSOAS = 10;
        double maiorAltura = 0.0, menorAltura = Double.MAX_VALUE, mediaHomens = 0.0, altura;
        int numMulheres = 0;
        
        for (int i = 1; i <= NUM_PESSOAS; i++) {
            do {
                String alturaStr = JOptionPane.showInputDialog("Digite a altura da pessoa " + i + " em metros:");
                altura = Double.parseDouble(alturaStr);
                if (altura < 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor válido para altura!");
                }
            } while (altura < 0);

            String sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa " + i + " (M/F):");
            sexo = sexo.toUpperCase();
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            
            if (altura < menorAltura) {
                menorAltura = altura;
            }
            
            if (sexo.equals("M")) {
                mediaHomens += altura;
            } else if (sexo.equals("F")) {
                numMulheres++;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido para a pessoa " + i);
                i--; // -> volta como se não tivesse feito o cadastro, por isso diminuimos 1
            }
        }
        
        mediaHomens /= NUM_PESSOAS - numMulheres;
        
        JOptionPane.showMessageDialog(null, "Maior altura: " + maiorAltura
                + "\nMenor altura: " + menorAltura
                + "\nMédia de altura dos homens: " + mediaHomens
                + "\nNúmero de mulheres: " + numMulheres);
    }

}
