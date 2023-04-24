package testedificil;

class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private int numCopiasDisponiveis;

    // Construtor
    public Livro(String titulo, String autor, String editora, int anoPublicacao, int numCopiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numCopiasDisponiveis = numCopiasDisponiveis;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumCopiasDisponiveis() {
        return numCopiasDisponiveis;
    }

    public void setNumCopiasDisponiveis(int numCopiasDisponiveis) {
        this.numCopiasDisponiveis = numCopiasDisponiveis;
    }

    public String toString() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nEditora: " + editora +
                "\nAno de Publicação: " + anoPublicacao +
                "\nNúmero de Cópias Disponíveis: " + numCopiasDisponiveis;
    }
}