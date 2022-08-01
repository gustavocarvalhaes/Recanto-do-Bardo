/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;


  //  Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  //  Gabriella Cruz e Silva (gabriellac2002) 202165512B
  //  Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B
   // Pedro Souza Pinheiro da Silva Araujo (pedro123063) 202165560C 
 
public class Item {
    
    private int idItem;
    private String nome;
    private String tipo;
    private int quantidade;
    private float precoHora;
    private boolean disponibilidade;

    public Item(int i, String nome, String tipo, int quantidade, float precoHora, boolean disponibilidade) {
       this.idItem = i;
       this.nome = nome;
       this.tipo = tipo;
       this.quantidade = quantidade;
       this.precoHora = precoHora;
       this.disponibilidade = disponibilidade;
    }

    /**
     * @return the idItem
     */
    public Integer getIdItem() {
        return idItem;
    }

    /**
     * @param idItem the idItem to set
     */
    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the precoHora
     */
    public Float getPrecoHora() {
        return precoHora;
    }

    /**
     * @param precoHora the precoHora to set
     */
    public void setPrecoHora(Float precoHora) {
        this.precoHora = precoHora;
    }

    /**
     * @return the disponibilidade
     */
    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    /**
     * @param disponibilidade the disponibilidade to set
     */
    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    
    @Override
    public String toString() {
        return this.getNome();
    }
    
}
