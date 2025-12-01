package ContactBook;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contact contato) {
        this.contatos.add(contato);
    }

    public void visualizarContatos() {
        System.out.println("Lista de Contatos da Empresa");

        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        for (int i = 0; i < contatos.size(); i++) {
            Contact contatoAtual = contatos.get(i);

            System.out.println((i + 1) + ". " + contatoAtual.getNome() + " - " + contatoAtual.getTelefone());
        }
    }

    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato(new Contact("João Silva", "(11) 99999-0000"));
        minhaAgenda.adicionarContato(new Contact("Luana Santos", "(21) 98888-0000"));
        minhaAgenda.adicionarContato(new Contact("Pedro Oliveira", "(31) 97777-0000"));

        minhaAgenda.visualizarContatos();
    }
}
