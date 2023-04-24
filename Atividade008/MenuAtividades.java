import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class MenuAtividades extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JButton btnAtividade001, btnAtividade002, btnAtividade003, btnAtividade004, btnAtividade005,
            btnAtividade006, btnFechar;

    public MenuAtividades() {
        setTitle("Menu de Atividades");
        setSize(700, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // criar botões
        btnAtividade001 = new JButton("Atividade 1");
        btnAtividade002 = new JButton("Atividade 2");
        btnAtividade003 = new JButton("Atividade 3");
        btnAtividade004 = new JButton("Atividade 4");
        btnAtividade005 = new JButton("Atividade 5");
        btnAtividade006 = new JButton("Atividade 6");
        btnFechar = new JButton("Fechar");

        // Colocando cores nos botoes
        btnAtividade001.setBackground(new Color(135, 206, 235)); // R=135, G=206, B=235
        btnAtividade002.setBackground(new Color(135, 206, 235)); // R=135, G=206, B=235
        btnAtividade003.setBackground(new Color(135, 206, 235)); // R=135, G=206, B=235
        btnAtividade004.setBackground(new Color(135, 206, 235)); // R=135, G=206, B=235
        btnAtividade005.setBackground(new Color(135, 206, 235)); // R=135, G=206, B=235
        btnAtividade006.setBackground(new Color(135, 206, 235)); // R=135, G=206, B=235
        btnFechar.setBackground(new Color(255, 143, 163)); // R=255, G=143, B=163

        // adicionar ação aos botões
        btnAtividade001.addActionListener(this);
        btnAtividade002.addActionListener(this);
        btnAtividade003.addActionListener(this);
        btnAtividade004.addActionListener(this);
        btnAtividade005.addActionListener(this);
        btnAtividade006.addActionListener(this);
        btnFechar.addActionListener(this);

        // criar painel para os botões
        JPanel pnlBotoes = new JPanel();
        pnlBotoes.setBackground(Color.BLACK);
        pnlBotoes.setLayout(new FlowLayout());

        // adicionar botões ao painel
        pnlBotoes.add(btnAtividade001);
        pnlBotoes.add(btnAtividade002);
        pnlBotoes.add(btnAtividade003);
        pnlBotoes.add(btnAtividade004);
        pnlBotoes.add(btnAtividade005);
        pnlBotoes.add(btnAtividade006);
        pnlBotoes.add(btnFechar);

        // adicionar painel à janela
        getContentPane().add(pnlBotoes);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ação para cada botão
        if (e.getSource() == btnAtividade001) {
            // código para atividade 1
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
        } else if (e.getSource() == btnAtividade002) {
            // código para atividade 2
            Double numFuncionarios, salario, somaSalarios = 0.0;
            do {
                String numFuncionariosStr = JOptionPane
                        .showInputDialog("Digite a quantidade de funcionários da empresa: ");
                numFuncionarios = Double.parseDouble(numFuncionariosStr);
                if (numFuncionariosStr.isEmpty() || Double.parseDouble(numFuncionariosStr) <= 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor válido!");
                }
            } while (numFuncionarios < 0);

            for (int i = 1; i <= numFuncionarios; i++) {
                do {
                    String salarioStr = JOptionPane.showInputDialog("Digite o salário do funcionário " + i + ": ");
                    salario = Double.parseDouble(salarioStr);
                    if (salarioStr.isEmpty() || Double.parseDouble(salarioStr) <= 0) {
                        JOptionPane.showMessageDialog(null, "Insira um valor válido!");
                    }
                } while (salario < 0);

                somaSalarios += salario;

            }

            double mediaSalarial = somaSalarios / numFuncionarios;
            JOptionPane.showMessageDialog(null, "A média salarial da empresa é: " + mediaSalarial);
        } else if (e.getSource() == btnAtividade003) {
            // código para atividade 3
            double hp, lp, ha, la;

            do {
                String hpStr = JOptionPane.showInputDialog("Digite a altura da parede: ");
                if (hpStr.isEmpty() || Double.parseDouble(hpStr) <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "A altura da parede deve ser positiva e não nula. Tente novamente.");
                } else {
                    hp = Double.parseDouble(hpStr);
                    break;
                }
            } while (true);

            do {
                String lpStr = JOptionPane.showInputDialog("Digite a largura da parede: ");
                if (lpStr.isEmpty() || Double.parseDouble(lpStr) <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "A largura da parede deve ser positiva e não nula. Tente novamente.");
                } else {
                    lp = Double.parseDouble(lpStr);
                    break;
                }
            } while (true);

            do {
                String haStr = JOptionPane.showInputDialog("Digite a altura do azulejo: ");
                if (haStr.isEmpty() || Double.parseDouble(haStr) <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "A altura do azulejo deve ser positiva e não nula. Tente novamente.");
                } else {
                    ha = Double.parseDouble(haStr);
                    break;
                }
            } while (true);

            do {
                String laStr = JOptionPane.showInputDialog("Digite a largura do azulejo: ");
                if (laStr.isEmpty() || Double.parseDouble(laStr) <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "A largura do azulejo deve ser positiva e não nula. Tente novamente.");
                } else {
                    la = Double.parseDouble(laStr);
                    break;
                }
            } while (true);

            double areaParede = hp * lp;
            double areaAzulejo = ha * la;
            int numAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

            JOptionPane.showMessageDialog(null, "Serão necessários " + numAzulejos + " azulejos.");
        } else if (e.getSource() == btnAtividade004) {
            // código para atividade 4
            double raio, alturaQuatro, volume;
            double PI = 3.14159;

            // lendo o valor do raio
            do {
                String raioStr = JOptionPane.showInputDialog("Digite o valor do raio:");
                if (raioStr.isEmpty() || Double.parseDouble(raioStr) <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "O raio deve ser um número positivo e não nulo. Tente novamente.");
                } else {
                    raio = Double.parseDouble(raioStr);
                    break;
                }
            } while (true);

            // lendo o valor da altura
            do {
                String alturaQuatroStr = JOptionPane.showInputDialog("Digite o valor da altura:");
                if (alturaQuatroStr.isEmpty() || Double.parseDouble(alturaQuatroStr) <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "A altura deve ser um número positivo e não nulo. Tente novamente.");
                } else {
                    alturaQuatro = Double.parseDouble(alturaQuatroStr);
                    break;
                }
            } while (true);

            // calculando o volume
            volume = PI * raio * raio * alturaQuatro;

            // exibindo o resultado
            JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + volume);
        } else if (e.getSource() == btnAtividade005) {
            // código para atividade 5
            double massa, alturaCinco, tempo, cavalos;

            do {
                String massaStr = JOptionPane.showInputDialog("Digite a massa em kg:");
                if (massaStr.isEmpty() || Double.parseDouble(massaStr) < 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                } else {
                    massa = Double.parseDouble(massaStr);
                    break;
                }
            } while (true);

            do {
                String alturaCincoStr = JOptionPane.showInputDialog("Digite a altura em metros:");
                if (alturaCincoStr.isEmpty() || Double.parseDouble(alturaCincoStr) < 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                } else {
                    alturaCinco = Double.parseDouble(alturaCincoStr);
                    break;
                }
            } while (true);

            do {
                String tempoStr = JOptionPane.showInputDialog("Digite o tempo em segundos:");
                if (tempoStr.isEmpty() || Double.parseDouble(tempoStr) < 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                } else {
                    tempo = Double.parseDouble(tempoStr);
                    break;
                }
            } while (true);

            cavalos = (massa * alturaCinco / tempo) / 745.7;

            JOptionPane.showMessageDialog(null, "A quantidade de cavalos necessários é: " + cavalos);
        } else if (e.getSource() == btnAtividade006) {
            // código para atividade 6
            double celsius, kelvin, reaumur, rankine, fahrenheit;

            do {
                String celsiusStr = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");
                if (celsiusStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                } else {
                    try {
                        celsius = Double.parseDouble(celsiusStr);
                        break;
                    } catch (NumberFormatException a) {
                        JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                    }
                }
            } while (true);

            fahrenheit = celsius * 1.8 + 32;
            kelvin = celsius + 273.15;
            reaumur = celsius * 0.8;
            rankine = celsius * 1.8 + 32 + 459.67;

            JOptionPane.showMessageDialog(null,
                    "Fahrenheit: " + Math.round(fahrenheit) + "°F\n"
                            + "Kelvin: " + Math.round(kelvin) + " K\n"
                            + "Réaumur: " + Math.round(reaumur) + "°Re\n"
                            + "Rankine: " + Math.round(rankine) + "°Ra");
        } else if (e.getSource() == btnFechar) {
            JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO");
            System.exit(0);
        }
    }
}
