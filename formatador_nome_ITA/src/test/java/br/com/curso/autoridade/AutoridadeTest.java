package br.com.curso.autoridade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AutoridadeTest {

    @Test
    void deveRetornarSomentePrimeiroNomeQuandoFormatadorForInformal() {
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", new Informal());

        assertEquals("Pedro", autoridade.getTratamento());
    }

    @Test
    void deveRetornarSenhorESobrenomeQuandoFormatadorForRespeitosoMasculino() {
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", new Respeitoso(true));

        assertEquals("Sr. Cabral", autoridade.getTratamento());
    }

    @Test
    void deveRetornarSenhoraESobrenomeQuandoFormatadorForRespeitosoFeminino() {
        Autoridade autoridade = new Autoridade("Maria", "Silva", new Respeitoso(false));

        assertEquals("Sra. Silva", autoridade.getTratamento());
    }

    @Test
    void deveRetornarTituloNomeESobrenomeQuandoFormatadorForComTitulo() {
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", new ComTitulo("Magnifico"));

        assertEquals("Magnifico Pedro Cabral", autoridade.getTratamento());
    }

    @Test
    void deveDelegarFormatacaoParaInstanciaDeFormatadorNome() {
        FormatadorNome formatadorPersonalizado = (nome, sobrenome) -> sobrenome.toUpperCase() + ", " + nome;
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", formatadorPersonalizado);

        assertEquals("CABRAL, Pedro", autoridade.getTratamento());
    }

    @Test
    void naoDevePermitirNomeNulo() {
        assertThrows(IllegalArgumentException.class,
                () -> new Autoridade(null, "Cabral", new Informal()));
    }

    @Test
    void naoDevePermitirSobrenomeVazio() {
        assertThrows(IllegalArgumentException.class,
                () -> new Autoridade("Pedro", " ", new Informal()));
    }

    @Test
    void naoDevePermitirFormatadorNulo() {
        assertThrows(NullPointerException.class,
                () -> new Autoridade("Pedro", "Cabral", null));
    }

    @Test
    void naoDevePermitirTituloVazio() {
        assertThrows(IllegalArgumentException.class,
                () -> new ComTitulo(" "));
    }
}
