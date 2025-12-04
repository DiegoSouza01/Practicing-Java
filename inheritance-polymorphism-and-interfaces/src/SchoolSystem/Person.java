package SchoolSystem;

public class Person {
    protected String nome;
    protected int idade;

    public Person(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " - Idade: " + idade);
    }
}
