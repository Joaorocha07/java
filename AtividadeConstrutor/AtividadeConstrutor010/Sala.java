package AtividadeConstrutor.AtividadeConstrutor010;

import javax.swing.JOptionPane;

public class Sala {
    
    //Atributos
    private int id;
    private String descricao;

    //Contrutor
    public Sala(int id, String descricao) {
        this.setId(id);
        this.setDescricao(descricao);
    }

    //Metodos especiais
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void mostrarVariaveis() {
        JOptionPane.showMessageDialog(null,
            "CLASSE SALA"    + 
            "\nId:  "        + this.getId() +
            "\nDescrição:  " + this.getDescricao()
        );
    }

}
