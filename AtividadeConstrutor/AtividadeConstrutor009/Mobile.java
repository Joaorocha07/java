package AtividadeConstrutor.AtividadeConstrutor009;

import javax.swing.JOptionPane;

public class Mobile {
    
    // Atributos
    private int id;
    private String nome;
    private String desc;

    //Construtor
    public Mobile(int id, String nome, String desc) {
        this.setId(id);
        this.setNome(nome);
        this.setDesc(desc);
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

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void mostrarVariaveis() {
        JOptionPane.showMessageDialog(null,
            "CLASSE MOBILE"    + 
            "\nId:  "        + this.getId() +
            "\nNome:  "      + this.getNome()  +
            "\nDescrição:  " + this.getDesc() 
        );
    }
       
}

