package trycatch.atividaderuim;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Reserva {
    
    private Integer quartoNumero;
    private Date entrada;
    private Date saida;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer quartoNumero, Date entrada, Date saida) {
        this.quartoNumero = quartoNumero;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Reserva(int numero, java.util.Date entrada2, java.util.Date saida2) {
    }

    public Integer getQuartoNumero() {
        return quartoNumero;
    }

    public void setQuartoNumero(Integer quartoNumero) {
        this.quartoNumero = quartoNumero;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public long duracao() {
        long diferenca = saida.getTime() - entrada.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public String atualizaData(Date entrada, Date saida) {
        Date presente = new Date();
        if (entrada.before(presente) || saida.before(presente)) {
            return "ERRO NA RESERVA: RESERVAS SOMENTE PODEM SER FEITAS COM DATAS FUTURAS!";
        }
        if (!saida.after(entrada)) {
            return "ERRO NA RESERVA: DATA DE SAÍDA ANTERIOR A DATA DE ENTRADA!";
        }
        this.entrada = entrada;
        this.saida = saida;
        this.entrada = entrada;
        return null;
    }

    @Override
    public String toString() {
        return 
            "Quarto " 
            + quartoNumero
            + ", entrada: " 
            + sdf.format(entrada)
            + ", saída: "
            + sdf.format(saida)
            + duracao()
            + "Noites";
    }

}
