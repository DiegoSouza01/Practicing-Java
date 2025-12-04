package ImplementingAnInterface;

public class Report implements Printable {
    private String titulo;
    private String conteudo;

    public Report(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Conteúdo: " + this.conteudo);
    }
}
