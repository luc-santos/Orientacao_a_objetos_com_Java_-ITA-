package br.com.curso.autoridade;

import java.util.Objects;

public class Autoridade {
    private final String nome;
    private final String sobrenome;
    private final FormatadorNome formatadorNome;

    public Autoridade(String nome, String sobrenome, FormatadorNome formatadorNome) {
        this.nome = validarTexto(nome, "nome");
        this.sobrenome = validarTexto(sobrenome, "sobrenome");
        this.formatadorNome = Objects.requireNonNull(formatadorNome, "formatadorNome nao pode ser nulo");
    }

    public String getTratamento() {
        return formatadorNome.formatarNome(nome, sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public FormatadorNome getFormatadorNome() {
        return formatadorNome;
    }

    private String validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " nao pode ser nulo ou vazio");
        }
        return valor.trim();
    }
}
