import javax.swing.JOptionPane;

public class Atividade003 {

    public static void main(String[] args) {
        double hp, lp, ha, la;

        do {
            String hpStr = JOptionPane.showInputDialog("Digite a altura da parede: ");
            if (hpStr.isEmpty() || Double.parseDouble(hpStr) <= 0) {
                JOptionPane.showMessageDialog(null, "A altura da parede deve ser positiva e não nula. Tente novamente.");
            } else {
                hp = Double.parseDouble(hpStr);
                break;
            }
        } while (true);

        do {
            String lpStr = JOptionPane.showInputDialog("Digite a largura da parede: ");
            if (lpStr.isEmpty() || Double.parseDouble(lpStr) <= 0) {
                JOptionPane.showMessageDialog(null, "A largura da parede deve ser positiva e não nula. Tente novamente.");
            } else {
                lp = Double.parseDouble(lpStr);
                break;
            }
        } while (true);

        do {
            String haStr = JOptionPane.showInputDialog("Digite a altura do azulejo: ");
            if (haStr.isEmpty() || Double.parseDouble(haStr) <= 0) {
                JOptionPane.showMessageDialog(null, "A altura do azulejo deve ser positiva e não nula. Tente novamente.");
            } else {
                ha = Double.parseDouble(haStr);
                break;
            }
        } while (true);

        do {
            String laStr = JOptionPane.showInputDialog("Digite a largura do azulejo: ");
            if (laStr.isEmpty() || Double.parseDouble(laStr) <= 0) {
                JOptionPane.showMessageDialog(null, "A largura do azulejo deve ser positiva e não nula. Tente novamente.");
            } else {
                la = Double.parseDouble(laStr);
                break;
            }
        } while (true);

        double areaParede = hp * lp;
        double areaAzulejo = ha * la;
        int numAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

        JOptionPane.showMessageDialog(null, "Serão necessários " + numAzulejos + " azulejos.");
    }
}
