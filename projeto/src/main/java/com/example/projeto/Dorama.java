package com.example.projeto;

import java.util.Date;

public class Dorama {

    private int cadastro;
    private String nomeDorama;
    private Date dataLancamento;
    private String nomeAtriz;
    private String nomeAtor;
    private String genero;
    private String pais;
    private String duracao;
    private String nomeEpisodios;
    private int numeroAtores;
    private String temporadas;
    private String avaliacoes;
    private String contatos;

    public Dorama() {
        this.cadastro = 0;
        this.nomeDorama = "";
    }

    public int getCadastro() {
        return cadastro;
    }

    public String getNomeDorama() {
        return nomeDorama;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public String getNomeAtriz() {
        return nomeAtriz;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public String getGenero() {
        return genero;
    }

    public String getPais() {
        return pais;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getNomeEpisodios() {
        return nomeEpisodios;
    }

    public int getNumeroAtores() {
        return numeroAtores;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public String getAvaliacoes() {
        return avaliacoes;
    }

    public String getContatos() {
        return contatos;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public void setNomeDorama(String nomeDorama) {
        this.nomeDorama = nomeDorama;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setNomeAtriz(String nomeAtriz) {
        this.nomeAtriz = nomeAtriz;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setNomeEpisodios(String nomeEpisodios) {
        this.nomeEpisodios = nomeEpisodios;
    }

    public void setNumeroAtores(int numeroAtores) {
        this.numeroAtores = numeroAtores;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public void setAvaliacoes(String avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void setContatos(String contatos) {
        this.contatos = contatos;
    }

}
