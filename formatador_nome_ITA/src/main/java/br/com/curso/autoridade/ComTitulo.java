package br.com.curso.autoridade;

public class ComTitulo implements FormatadorNome {
    private final String titulo;

    public ComTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("titulo nao pode ser nulo ou vazio");
        }
        this.titulo = titulo.trim();
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return titulo + " " + nome + " " + sobrenome;
    }
}
