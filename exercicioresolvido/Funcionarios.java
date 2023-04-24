package exercicioresolvido;

public class Funcionarios {
    
    private String nome;
    private Integer horas;
    private Double valorHora;

    public Funcionarios() {

    }

    public Funcionarios(String nome, Integer horas, Double valorHora) {

        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public double pagamento() {
        return horas * valorHora;
    }

}
