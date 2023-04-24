import javax.swing.JOptionPane;

public class Atividade007 {

    public static void main(String[] args) {

        int opcao = -1;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha uma atividade para executar:\n" +
                "1. Atividade 001\n" +
                "2. Atividade 002\n" +
                "3. Atividade 003\n" +
                "4. Atividade 004\n" +
                "5. Atividade 005\n" +
                "6. Atividade 006\n" +
                "0. Sair"
            ));

            switch (opcao) {
                case 1:
                    // Aqui você coloca o código da Atividade 001
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
                    break;
                case 2:
                    // Aqui você coloca o código da Atividade 002
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
                    break;
                case 3:
                    // Aqui você coloca o código da Atividade 003
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
                    break;
                case 4:
                    // Aqui você coloca o código da Atividade 004
                    double raio, alturaQuatro, volume;
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
                        String alturaQuatroStr = JOptionPane.showInputDialog("Digite o valor da altura:");
                        if (alturaQuatroStr.isEmpty() || Double.parseDouble(alturaQuatroStr) <= 0) {
                            JOptionPane.showMessageDialog(null, "A altura deve ser um número positivo e não nulo. Tente novamente.");
                        } else {
                            alturaQuatro = Double.parseDouble(alturaQuatroStr);
                            break;
                        }
                    } while (true);

                    // calculando o volume
                    volume = PI * raio * raio * alturaQuatro;

                    // exibindo o resultado
                    JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + volume);
                    break;
                case 5:
                    // Aqui você coloca o código da Atividade 005
                    double massa, alturaCinco, tempo, cavalos;
        
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
                        String alturaCincoStr = JOptionPane.showInputDialog("Digite a altura em metros:");
                        if (alturaCincoStr.isEmpty() || Double.parseDouble(alturaCincoStr) < 0) {
                            JOptionPane.showMessageDialog(null, "Insira um valor valido!");
                        } else {
                            alturaCinco = Double.parseDouble(alturaCincoStr);
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
                    
                    cavalos = (massa * alturaCinco / tempo) / 745.7;
                    
                    JOptionPane.showMessageDialog(null, "A quantidade de cavalos necessários é: " + cavalos);
                    break;
                case 6:
                    // Aqui você coloca o código da Atividade 006
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
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}