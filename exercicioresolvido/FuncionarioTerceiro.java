package exercicioresolvido;

public class FuncionarioTerceiro extends Funcionarios{
    
    private Double taxaAdicional;

    public FuncionarioTerceiro(String nome, Integer horas, Double ValorHora, Double taxaAdicional) {
        super(nome, horas, ValorHora);
        this.taxaAdicional = taxaAdicional;
    }

    public Double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    public double pagamento() {
        return super.pagamento() + taxaAdicional * 1.1;
    }
     
}
