package atividade011;

public class PensionatoClass {
    private String nome;
    private String email;

    public PensionatoClass(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return nome + ", " + email;
    }
}
