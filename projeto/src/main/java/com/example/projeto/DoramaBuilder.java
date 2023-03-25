package com.example.projeto;

import java.util.Date;

public class DoramaBuilder {

    private Dorama dorama;

    public DoramaBuilder() {dorama = new Dorama();}

    public Dorama build() {
        if (dorama.getCadastro() == 0) {
            throw new IllegalArgumentException("Cadastro inválido");
        }
        if (dorama.getNomeDorama().equals("")) {
            throw new IllegalArgumentException("Nome do Dorama inválido");
        }
        return dorama;
    }

    public DoramaBuilder setCadastro(int cadastro) {
        dorama.setCadastro(cadastro);
        return this;
    }

    public DoramaBuilder setNomeDorama(String nomeDorama) {
        dorama.setNomeDorama(nomeDorama);
        return this;
    }

    public DoramaBuilder setDataLancamento(Date dataLancamento) {
        dorama.setDataLancamento(dataLancamento);
        return this;
    }

    public DoramaBuilder setNomeAtor(String nomeAtor) {
        dorama.setNomeAtor(nomeAtor);
        return this;
    }

    public DoramaBuilder setNomeAtriz(String nomeAtriz) {
        dorama.setNomeAtriz(nomeAtriz);
        return this;
    }

    public DoramaBuilder setGenero(String genero) {
        dorama.setGenero(genero);
        return this;
    }

    public DoramaBuilder setPais(String pais) {
        dorama.setPais(pais);
        return this;
    }

    public DoramaBuilder setDuracao(String duracao) {
        dorama.setDuracao(duracao);
        return this;
    }

    public DoramaBuilder setNomeEpisodios(String nomeEpisodios) {
        dorama.setNomeEpisodios(nomeEpisodios);
        return this;
    }

    public DoramaBuilder setNumeroAtores(int numeroAtores) {
        dorama.setNumeroAtores(numeroAtores);
        return this;
    }

    public DoramaBuilder setTemporadas(String temporadas) {
        dorama.setTemporadas(temporadas);
        return this;
    }

    public DoramaBuilder setAvaliacoes(String avaliacoes) {
        dorama.setAvaliacoes(avaliacoes);
        return this;
    }

    public DoramaBuilder setContatos(String contatos) {
        dorama.setContatos(contatos);
        return this;
    }

}
