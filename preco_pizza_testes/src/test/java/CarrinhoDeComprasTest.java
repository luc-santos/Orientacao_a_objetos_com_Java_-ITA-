import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarrinhoDeComprasTest {

    @BeforeEach
    void inicializa() {
        Pizza.zeraRegistroDeIngredientes();
    }

    @Test
    void deveSomarPrecoDasPizzasDoCarrinho() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("queijo");
        pizza1.adicionaIngrediente("tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("tomate");
        pizza2.adicionaIngrediente("calabresa");

        carrinho.adicionaPizza(pizza1);
        carrinho.adicionaPizza(pizza2);

        assertEquals(35, carrinho.getValorTotal());
    }

    @Test
    void naoDeveAdicionarPizzaSemIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza = new Pizza();

        assertThrows(IllegalArgumentException.class, () -> {
            carrinho.adicionaPizza(pizza);
        });
    }
}
