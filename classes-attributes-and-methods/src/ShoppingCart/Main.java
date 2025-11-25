package ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        ItemCart i1 = new ItemCart("Teclado", 120.0, 1);
        ItemCart i2 = new ItemCart("Mouse", 60.0, 2);
        ItemCart i3 = new ItemCart("Monitor", 800.0, 1);

        List<ItemCart> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);
        carrinho.add(i3);
        double valorTotalDaCompra = 0.0;

        for (ItemCart item : carrinho) {
            valorTotalDaCompra += item.calcularTotalItem();
        }

        String totalFormatado = String.format(Locale.getDefault(), "%.2f", valorTotalDaCompra);

        System.out.println("Total da compra: R$ " + totalFormatado);
    }
}
