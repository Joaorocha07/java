package testemedio;

public class ContaBancaria {

    private int numero;
    private double saldo;
    private double limite;
    private String[] historico;
    private int indiceHistorico;

    public ContaBancaria(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.historico = new String[100];
        this.indiceHistorico = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico[indiceHistorico] = "Depósito de R$" + valor;
            indiceHistorico++;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            historico[indiceHistorico] = "Saque de R$" + valor;
            indiceHistorico++;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque!");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consultarExtrato() {
        System.out.println("Histórico de transações:");
        for (int i = 0; i < indiceHistorico; i++) {
            System.out.println(historico[i]);
        }
    }
}
