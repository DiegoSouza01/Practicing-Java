package ContactBook;

public class Contact {
    private String nome;
    private String telefone;

    public Contact(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
