package PrintingTheBookSummary;

public class Main {
    public static void main(String[] args) {

        String tituloEntrada = "O Guia do Mochileiro das Galáxias";
        String autorEntrada = "Douglas Adams";
        int paginasEntrada = 208;

        LiteraryWork livro = new LiteraryWork(tituloEntrada, autorEntrada, paginasEntrada);

        System.out.println("Dados Catalogados");

        livro.mostrarDados();

        LiteraryWork outraObra = new LiteraryWork("Cem Anos de Solidão", "Gabriel García Márquez", 418);
        outraObra.mostrarDados();
    }
}
