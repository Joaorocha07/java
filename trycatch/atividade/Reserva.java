package trycatch.atividade;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    
    private Integer numeroDoQuarto;
    private Date dataEntrada;
    private Date dataSaida;

    private static SimpleDataFormat sdf = new SimpleDataFormat("dd/MM/yyyy");

    public Reserva(int numeroDoQuarto2, Date dataEntrada2, Date dataSaida2) {

    }

    public Reserva(Integer numeroDoQuarto, Date dataEntrada, Date dataSaida) {
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public long duracao() {
        long diferenca = dataSaida.getTime() - dataEntrada.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizaData(Date dataEntrada, Date dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return 
            "Quarto " 
            + numeroDoQuarto
            + ", entrada: " 
            + sdf.format(dataEntrada)
            + ", saída: "
            + sdf.format(dataSaida)
            + duracao()
            + "Noites";
    }

}
