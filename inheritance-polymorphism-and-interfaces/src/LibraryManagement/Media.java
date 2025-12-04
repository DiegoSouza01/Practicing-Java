package LibraryManagement;

public class Media {
    protected String titulo;
    protected int ano;

    public Media(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    // Método auxiliar para gerar o código solicitado
    public String gerarCodigo() {
        String prefixo = titulo.length() >= 3 ? titulo.substring(0, 3) : titulo;
        return "LIB-" + prefixo + ano;
    }

    public void exibirInfo() {
        System.out.println("Mídia genérica");
    }
}
