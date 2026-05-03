import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Pizza {
    List<String> ingredientes = new ArrayList<>();
    static HashMap<String, Integer> contagem = new HashMap<>();

    void adicionaIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }
    static void contabilizaIngrediente(String ingrediente){
        contagem.put(ingrediente,contagem.getOrDefault(ingrediente, 0) + 1);
    }
    int getQuantidadeIngredientes(){
        return ingredientes.size();
    }
    int getPreco(){
        int quantidade = ingredientes.size();
        if (quantidade <= 2) return 15;
        else if (quantidade <= 5) return 20;
        else return 23;
    }
}