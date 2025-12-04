package SchoolSystem;

public class Teacher extends Person {
    private String disciplina;

    public Teacher(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.println("Docente: " + this.nome + " - Idade: " + this.idade + " - Disciplina: " + this.disciplina);
    }
}

