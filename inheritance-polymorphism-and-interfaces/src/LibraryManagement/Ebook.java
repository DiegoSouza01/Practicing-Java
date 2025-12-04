package LibraryManagement;

public class Ebook extends Media {
    private String formato;

    public Ebook(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Ebook: \"" + titulo + "\" - Formato: " + formato);
    }
}