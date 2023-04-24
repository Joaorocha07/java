import javax.swing.JOptionPane;

public class Atividade005 {

    public static void main(String[] args) {
        double massa, altura, tempo, cavalos;
        
        do {
            String massaStr = JOptionPane.showInputDialog("Digite a massa em kg:");
            if (massaStr.isEmpty() || Double.parseDouble(massaStr) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                massa = Double.parseDouble(massaStr);
                break;
            }
        } while(true);

        do {
            String alturaStr = JOptionPane.showInputDialog("Digite a altura em metros:");
            if (alturaStr.isEmpty() || Double.parseDouble(alturaStr) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                altura = Double.parseDouble(alturaStr);
                break;
            }
        } while(true);

        do {
            String tempoStr = JOptionPane.showInputDialog("Digite o tempo em segundos:");
            if (tempoStr.isEmpty() || Double.parseDouble(tempoStr) < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                tempo = Double.parseDouble(tempoStr);
                break;
            }
        } while(true);
        
        cavalos = (massa * altura / tempo) / 745.7;
        
        JOptionPane.showMessageDialog(null, "A quantidade de cavalos necessários é: " + cavalos);
    }
}
