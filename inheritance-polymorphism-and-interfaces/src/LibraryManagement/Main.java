package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Book livro = new Book("O Guia do Mochileiro das Galáxias", 1979, "Douglas Adams");
        Magazine revista = new Magazine("National Geographic", 2023, 245);
        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();
    }
}
