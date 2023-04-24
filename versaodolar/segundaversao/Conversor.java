package versaodolar.segundaversao;


class Conversor {

    private double precoDolar;
    private double quantidadeDolar;

    public Conversor(double precoDolar, double quantidadeDolar) {
        this.precoDolar = precoDolar;
        this.quantidadeDolar = quantidadeDolar;
    }

    public double calcularValorEmReais() {
        double valorSemIOF = quantidadeDolar * precoDolar;
        double valorComIOF = valorSemIOF * 1.06;
        return valorComIOF;
    }

}