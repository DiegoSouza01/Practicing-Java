package IdentifyingTheStudent;

public class Main {
    public static void main(String[] args) {
        Student aluno1 = new Student("Fernanda", "regular");

        Scholarship aluno2 = new Scholarship("Lucas");

        aluno1.identificar();
        aluno2.identificar();
    }
}
