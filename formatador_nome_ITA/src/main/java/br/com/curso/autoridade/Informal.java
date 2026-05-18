package br.com.curso.autoridade;

public class Informal implements FormatadorNome {
    @Override
    public String formatarNome(String nome, String sobrenome) {
        return nome;
    }
}
