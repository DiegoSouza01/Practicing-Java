package CreatingACustomerMap;

import java.util.HashMap;
import java.util.Map;

public class BookstoreClientManager {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Ana");
        clientes.put(2, "Marcos");
        clientes.put(3, "Beatriz");

        int idBuscado = 2;
        String nomeCliente = clientes.get(idBuscado);

        System.out.println("O nome do cliente com ID " + idBuscado + " é: " + nomeCliente);
    }
}
