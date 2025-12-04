package SchoolSystem;

public class Main {
    public static void main(String[] args) {
        Student aluno1 = new Student("Julia", 16, 8.5);
        Student aluno2 = new Student("Caio", 17, 7.2);

        Teacher docente1 = new Teacher("Marta", 40, "Matemática");
        Teacher docente2 = new Teacher("Roberto", 38, "História");

        aluno1.exibirDados();
        aluno2.exibirDados();

        System.out.println();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
