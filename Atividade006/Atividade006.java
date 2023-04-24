import javax.swing.JOptionPane;

public class Atividade006 {

    public static void main(String[] args) {
        double celsius, kelvin, reaumur, rankine, fahrenheit;

        do {
            String celsiusStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
            if (celsiusStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            } else {
                try {
                    celsius = Double.parseDouble(celsiusStr);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                }
            }
        } while(true);

        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        reaumur = celsius * 0.8;
        rankine = celsius * 1.8 + 32 + 459.67;

        JOptionPane.showMessageDialog(null, 
          "Fahrenheit: " + Math.round(fahrenheit) + "°F\n" 
        + "Kelvin: "     + Math.round(kelvin) + " K\n"
        + "Réaumur: "    + Math.round(reaumur) + "°Re\n"
        + "Rankine: "    + Math.round(rankine) + "°Ra");
    }
}
