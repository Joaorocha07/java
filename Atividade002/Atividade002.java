import javax.swing.JOptionPane;

public class Atividade002 {

    public static void main(String[] args) {
        
        Double numFuncionarios, salario, somaSalarios = 0.0;
        do {
            String numFuncionariosStr = JOptionPane.showInputDialog("Digite a quantidade de funcionários da empresa: ");
            numFuncionarios = Double.parseDouble(numFuncionariosStr);
            if (numFuncionariosStr.isEmpty() ||  Double.parseDouble(numFuncionariosStr) <= 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor válido!");
            }
        } while (numFuncionarios < 0);

        

        for(int i = 1; i <= numFuncionarios; i++) {
            do {
                String salarioStr = JOptionPane.showInputDialog("Digite o salário do funcionário " + i + ": ");
                salario = Double.parseDouble(salarioStr);
                if (salarioStr.isEmpty() ||  Double.parseDouble(salarioStr) <= 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor válido!");
                }
            } while (salario < 0);
            
            somaSalarios += salario;

        }
        
        double mediaSalarial = somaSalarios / numFuncionarios;
        JOptionPane.showMessageDialog(null,"A média salarial da empresa é: " + mediaSalarial);
        
    }

}
