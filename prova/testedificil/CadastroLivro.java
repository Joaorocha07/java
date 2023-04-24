package testedificil;

import java.util.Scanner;

class CadastroLivros {
    private Livro[] livros;
    private int numLivros;

    // Construtor
    public CadastroLivros() {
        livros = new Livro[100];
        numLivros = 0;
    }

    // Método para cadastrar um novo livro
    public void cadastrarLivro(Livro livro) {
        if (numLivros < 100) {
            livros[numLivros] = livro;
            numLivros++;
            System.out.println("\nLivro cadastrado com sucesso!");
        } else {
            System.out.println("\nCadastro de livros está cheio. Não é possível cadastrar mais livros.");
        }
    }

    // Método para buscar um livro pelo título
    public void buscarLivroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < numLivros; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("\nLivro encontrado:");
                System.out.println(livros[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nLivro não encontrado.");
        }
    }

    // Método para excluir um livro pelo título
    public void excluirLivro(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < numLivros; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                // Move os livros à direita do livro a ser excluído para preencher o espaço vago
                for (int j = i; j < numLivros - 1; j++) {
                    livros[j] = livros[j + 1];
                }
                livros[numLivros - 1] = null; // Define o último elemento como nulo
                numLivros--; // Reduz o contador de livros cadastrados
                System.out.println("\nLivro excluído com sucesso.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nLivro não encontrado.");
        }
    }

    // Método para listar todos os livros cadastrados
    public void listarLivros() {
        if (numLivros == 0) {
            System.out.println("\nNenhum livro cadastrado.");
        } else {
            System.out.println("\nLista de livros cadastrados:");
            for (int i = 0; i < numLivros; i++) {
                System.out.println(livros[i]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        CadastroLivros cadastro = new CadastroLivros();

        int opcao = 0;
        
        while (opcao != 5) {

            System.out.println("-----------------MENU-----------------");
            System.out.println("1. Cadastrar novo livro");
            System.out.println("2. Buscar livro pelo título");
            System.out.println("3. Excluir livro");
            System.out.println("4. Listar todos os livros cadastrados");
            System.out.println("5. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("-----CADASTRO DE NOVO LIVRO-----");
                    System.out.print("Digite o título do livro: ");
                    input.nextLine();
                    String titulo = input.nextLine();
                    System.out.print("Digite o nome do autor: ");
                    String autor = input.nextLine();
                    System.out.print("Digite o nome da editora: ");
                    String editora = input.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacao = input.nextInt();
                    System.out.print("Digite o número de cópias disponíveis: ");
                    int numCopiasDisponiveis = input.nextInt();

                    Livro livro = new Livro(titulo, autor, editora, anoPublicacao, numCopiasDisponiveis);
                    cadastro.cadastrarLivro(livro);

                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("-----BUSCA DE LIVRO PELO TÍTULO-----");
                    System.out.print("Digite o título do livro: ");
                    input.nextLine();
                    String buscaTitulo = input.nextLine();
                    cadastro.buscarLivroPorTitulo(buscaTitulo);
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("-----EXCLUSÃO DE LIVRO PELO TÍTULO-----");
                    System.out.print("Digite o título do livro: ");
                    input.nextLine();
                    String excluiTitulo = input.nextLine();
                    cadastro.excluirLivro(excluiTitulo);
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    cadastro.listarLivros();
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opção inválida.");
                    System.out.println();
                    break;
            }
        }
        input.close();
    }
}