package PrintingTheBookSummary;

public class LiteraryWork {
    private String titulo;
    private String autor;
    private int paginas;

    public LiteraryWork(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDados() {
        System.out.printf("\"%s\" de %s com %d páginas%n",
                this.titulo,
                this.autor,
                this.paginas
        );
    }
}
