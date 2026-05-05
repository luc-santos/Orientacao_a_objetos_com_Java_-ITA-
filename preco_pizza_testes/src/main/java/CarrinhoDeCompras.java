import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Pizza> pizzas = new ArrayList<>();

    public void adicionaPizza(Pizza pizza) {
        if (pizza.getQuantidadeIngredientes() == 0) {
            throw new IllegalArgumentException("Não é possível vender uma pizza sem ingredientes");
        }
        pizzas.add(pizza);
    }

    public int getValorTotal() {
        int total = 0;

        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }

        return total;
    }
}
