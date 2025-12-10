package AccessingElements;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAccessControl {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        String segundoFuncionario = funcionarios.get(1);

        int totalFuncionarios = funcionarios.size();

        System.out.println("A segunda pessoa da lista é: " + segundoFuncionario);
        System.out.println("Total de funcionários: " + totalFuncionarios);
    }
}
