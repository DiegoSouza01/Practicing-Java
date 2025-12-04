package LibraryManagement;

public class Magazine extends Media {
    private int edicao;

    public Magazine(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Revista: \"" + titulo + "\" - Edição: " + edicao);
    }
}
