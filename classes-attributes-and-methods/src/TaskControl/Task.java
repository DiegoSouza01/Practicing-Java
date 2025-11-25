package TaskControl;

public class Task {
    private String descricao;
    private boolean concluida;

    public Task(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public void mostrarStatus() {
        String status = this.concluida ? "Concluída" : "Pendente";

        System.out.println("Tarefa: " + this.descricao + " - Status: " + status);
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
