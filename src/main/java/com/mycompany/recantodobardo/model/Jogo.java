/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.model;

/**
 *
 * @author cdcru
 */
public class Jogo {
    private String nome;
    private Integer id_jogo;
    private String categoria;
    private Integer n_jogadores;
    private Boolean disponivel;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id_jogo
     */
    public Integer getId_jogo() {
        return id_jogo;
    }

    /**
     * @param id_jogo the id_jogo to set
     */
    public void setId_jogo(Integer id_jogo) {
        this.id_jogo = id_jogo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the n_jogadores
     */
    public Integer getN_jogadores() {
        return n_jogadores;
    }

    /**
     * @param n_jogadores the n_jogadores to set
     */
    public void setN_jogadores(Integer n_jogadores) {
        this.n_jogadores = n_jogadores;
    }

    /**
     * @return the disponivel
     */
    public Boolean getDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
    
        
    
}
