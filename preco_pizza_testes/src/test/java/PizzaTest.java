import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest {

    @BeforeEach
    void inicializa() {
        Pizza.zeraRegistroDeIngredientes();
    }

    @Test
    void deveRetornarPreco15QuandoPizzaTemAte2Ingredientes() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");

        assertEquals(15, pizza.getPreco());
    }

    @Test
    void deveRetornarPreco20QuandoPizzaTemDe3A5Ingredientes() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("calabresa");

        assertEquals(20, pizza.getPreco());
    }

    @Test
    void deveRetornarPreco23QuandoPizzaTemMaisDe5Ingredientes() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("calabresa");
        pizza.adicionaIngrediente("cebola");
        pizza.adicionaIngrediente("azeitona");
        pizza.adicionaIngrediente("bacon");

        assertEquals(23, pizza.getPreco());
    }

    @Test
    void deveRegistrarIngredienteAdicionado() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("queijo");

        assertEquals(1, Pizza.getQuantidadeIngredienteRegistrado("queijo"));
    }

    @Test
    void deveRegistrarMesmoIngredienteMaisDeUmaVez() {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();

        pizza1.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("queijo");

        assertEquals(2, Pizza.getQuantidadeIngredienteRegistrado("queijo"));
    }
}
