package CalculatingGrades;

public class Main {
    public static void main(String[] args) {

        String nome1 = "João Silva";
        double nota1_1 = 6.5;
        double nota2_1 = 7.5;

        Student alunoAprovado = new Student(nome1, nota1_1, nota2_1);

        alunoAprovado.gerarRelatorio();


        String nome2 = "Maria Souza";
        double nota1_2 = 6.8;
        double nota2_2 = 7.0;

        Student alunoReprovado = new Student(nome2, nota1_2, nota2_2);

        alunoReprovado.gerarRelatorio();
    }
}
