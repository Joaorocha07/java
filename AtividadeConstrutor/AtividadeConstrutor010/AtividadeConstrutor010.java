package AtividadeConstrutor.AtividadeConstrutor010;

public class AtividadeConstrutor010 {
    public static void main(String[] args) {
        
        Aventura filme = new Aventura(1, "Hora da aventura", "Hora de Aventura se apresenta como o carro-chefe do Cartoon Network desde 2010");
        filme.mostrarVariaveis();

        Sala sala = new Sala(1, "Está sala contem 30 alunos, do professor matheus!");
        sala.mostrarVariaveis();
    }
}
