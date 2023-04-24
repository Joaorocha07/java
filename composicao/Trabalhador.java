package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



public class Trabalhador {
    
    private String nome;
    private NivelDoTrabalhador nivel;
    private Double baseSalarial;

    private Departamento departamento;
    private static List<HoraContrato> contratos = new ArrayList<>();

    public Trabalhador() {

    }

    public Trabalhador(String nome, NivelDoTrabalhador nivel, Double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDoTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelDoTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }

    public static void addContrato(HoraContrato contrato) {
        contratos.add(contrato); 
    }

    public void removeContrato(HoraContrato contratos) {
        contratos.remove(contratos);
    }

    public double renda(int ano, int mes) {
        double soma = baseSalarial;
        Calendar calendario = Calendar.getInstance();
        for(HoraContrato cont : contratos) {
            calendario.setTime(cont.getData());
            int cont_ano = calendario.get(Calendar.YEAR);
            int cont_mes = 1 + calendario.get(Calendar.MONTH);
            if(ano == cont_ano && mes == cont_mes) {
                soma += cont.totalValue();
            }
        }
        return soma;
    }

    public static NivelDoTrabalhador valueOf(Trabalhador trabalhador) {
        return null;
    }

    public Object income(int ano, int mes) {
        return null;
    }

}
