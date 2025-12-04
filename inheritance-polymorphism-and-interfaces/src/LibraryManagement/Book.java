package LibraryManagement;

public class Book extends Media {
    private String autor;

    public Book(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + titulo + "\" - Autor: " + autor);
    }
}
