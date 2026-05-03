public class Principal {
    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("Molho de Tomate");
        p1.adicionaIngrediente("Queijo");
        p1.adicionaIngrediente("Frango");
        p1.adicionaIngrediente("Catupiry");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("Molho de Tomate");
        p2.adicionaIngrediente("Queijo");

        Pizza p3 = new Pizza();
        p3.adicionaIngrediente("Molho de Tomate");
        p3.adicionaIngrediente("Queijo");
        p3.adicionaIngrediente("Calabresa");
        p3.adicionaIngrediente("Catupiry");
        p3.adicionaIngrediente("Orégano");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaPizza(p1);
        carrinho.adicionaPizza(p2);
        carrinho.adicionaPizza(p3);

        System.out.println("Valor total: " + carrinho.getValorTotal());

        System.out.println("Contagem de ingredientes: ");
        for (String ingrediente : Pizza.contagem.keySet()) {
            System.out.println(ingrediente + ": " + Pizza.contagem.get(ingrediente));
        }
    }
}
