package AtividadeConstrutor.AtividadeConstrutor010;

import javax.swing.JOptionPane;
//Aventura == item
public class Aventura {
    
    //Atributos
    private int id;
    private String nome;
    private String descricao;

    //Construtor
    public Aventura(int id, String nome, String descricao) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
    }

    // Metodos especiais
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void mostrarVariaveis() {
        JOptionPane.showMessageDialog(null,
            "CLASSE AVENTURA" +
            "\nId:  "        + this.getId() +
            "\nNome: "       + this.getNome() +
            "\nDescrição:  " + this.getDescricao()
        );
    }

}
