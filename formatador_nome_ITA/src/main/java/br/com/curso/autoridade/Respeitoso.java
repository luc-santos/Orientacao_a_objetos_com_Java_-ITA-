package br.com.curso.autoridade;

public class Respeitoso implements FormatadorNome {
    private final boolean masculino;

    public Respeitoso(boolean masculino) {
        this.masculino = masculino;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        String tratamento = masculino ? "Sr." : "Sra.";
        return tratamento + " " + sobrenome;
    }
}
