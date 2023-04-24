import javax.swing.JOptionPane;

public class Atividade004 {
    public static void main(String[] args) {
        double raio, altura, volume;
        double PI = 3.14159;

        // lendo o valor do raio
        do {
            String raioStr = JOptionPane.showInputDialog("Digite o valor do raio:");
            if (raioStr.isEmpty() || Double.parseDouble(raioStr) <= 0) {
                JOptionPane.showMessageDialog(null, "O raio deve ser um número positivo e não nulo. Tente novamente.");
            } else {
                raio = Double.parseDouble(raioStr);
                break;
            }
        } while (true);

        // lendo o valor da altura
        do {
            String alturaStr = JOptionPane.showInputDialog("Digite o valor da altura:");
            if (alturaStr.isEmpty() || Double.parseDouble(alturaStr) <= 0) {
                JOptionPane.showMessageDialog(null, "A altura deve ser um número positivo e não nulo. Tente novamente.");
            } else {
                altura = Double.parseDouble(alturaStr);
                break;
            }
        } while (true);

        // calculando o volume
        volume = PI * raio * raio * altura;

        // exibindo o resultado
        JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + volume);
    }
}
