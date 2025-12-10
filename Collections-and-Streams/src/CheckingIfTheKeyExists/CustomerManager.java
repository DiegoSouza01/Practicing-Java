package CheckingIfTheKeyExists;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    public static void main(String[] args) {
        Map<Integer, String> customers = new HashMap<>();

        customers.put(1, "Maria");
        customers.put(2, "Marcos");
        customers.put(3, "Ana");
        customers.put(4, "Joana");
        customers.put(5, "Karen");

        System.out.println(" Iniciando Busca de Clientes \n");

        int idToSearch1 = 5;
        searchCustomer(customers, idToSearch1);

        int idToSearch2 = 6;
        searchCustomer(customers, idToSearch2);
    }

    private static void searchCustomer(Map<Integer, String> map, int id) {
        if (map.containsKey(id)) {
            String name = map.get(id);
            System.out.println("O nome do cliente com ID " + id + " é: " + name);
        } else {
            System.out.println("Cliente com ID " + id + " não encontrado.");
        }
    }
}
