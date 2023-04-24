package composicao;

import java.sql.Date;

public class HoraContrato {
    
    private Date data;
    private Double valorPorHora;
    private Integer horas;

    public HoraContrato(java.util.Date dataDoContrato, double valorPorHora2, int horas2) {

    }
    
    public HoraContrato(Date data, Double dataDoContrato, Double valoPorHora, Integer horas) {
        this.data = data;
        this.valorPorHora = valoPorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double totalValue() {
        return valorPorHora * horas;
    }

    public void add(HoraContrato contrato) {
    }

    public void remove(HoraContrato contratos) {
    }

}
