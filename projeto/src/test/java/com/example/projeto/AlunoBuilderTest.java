package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoBuilderTest {

    @Test
    void deveRetornarExcecaoParaDoramaSemCadastro() {
        try {
            DoramaBuilder doramaBuilder = new DoramaBuilder();
            Dorama dorama = doramaBuilder
                    .setNomeDorama("The Glory")
                    .setContatos("kim@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cadastro inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaDoramaSemNome() {
        try {
            DoramaBuilder doramaBuilder = new DoramaBuilder();
            Dorama dorama = doramaBuilder
                    .setCadastro(1)
                    .setContatos("kim@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do Dorama inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarDoramaValido() {
        DoramaBuilder doramaBuilder = new DoramaBuilder();
        Dorama dorama = doramaBuilder
                .setCadastro(1)
                .setNomeDorama("The Glory")
                .setContatos("kim@email.com")
                .build();

        assertNotNull(dorama);
    }
}
