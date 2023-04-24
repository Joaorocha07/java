package atividadebancaria;

public class Banco {
    private final int numero_conta;
    private String nome_titular;
    private double saldo;

    public Banco(int numero_conta, String nome_titular, double saldo_inicial) {
        this.numero_conta = numero_conta;
        this.nome_titular = nome_titular;
        this.saldo = saldo_inicial;
    }

    public int getNumeroConta() {
        return numero_conta;
    }

    public String getNomeTitular() {
        return nome_titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Novo saldo: R$" + saldo);
    }
    

    public void sacar(double valor) {
        if (saldo < valor + 5.0) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor + 5.0;
            System.out.println("Taxa para saque 5.00 R$");
            System.out.println("Saque realizado com sucesso! Novo saldo: R$" + saldo);
        }
    }
}
