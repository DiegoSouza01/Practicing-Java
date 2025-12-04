package SchoolSystem;

public class Student extends Person {
    private double nota;

    public Student(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + this.nome + " - Idade: " + this.idade + " - Nota: " + this.nota);
    }
}
