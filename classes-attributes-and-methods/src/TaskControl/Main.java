package TaskControl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task t1 = new Task("Estudar Java", false);

        Task t2 = new Task("Fazer exercícios", true);

        Task t3 = new Task("Comprar leite", false);

        List<Task> listaDeTarefas = new ArrayList<>();

        listaDeTarefas.add(t1);
        listaDeTarefas.add(t2);
        listaDeTarefas.add(t3);

        System.out.println("- Lista de Tarefas Cadastradas -");

        for (Task tarefa : listaDeTarefas) {
            tarefa.mostrarStatus();
        }
    }
}