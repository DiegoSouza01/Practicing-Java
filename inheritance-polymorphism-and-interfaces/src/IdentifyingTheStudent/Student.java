package IdentifyingTheStudent;

public class Student {
    private String nome;
    private String tipo;

    public Student(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificar() {
        System.out.println("Aluno: " + this.nome + " - Tipo: " + this.tipo);
    }
}
