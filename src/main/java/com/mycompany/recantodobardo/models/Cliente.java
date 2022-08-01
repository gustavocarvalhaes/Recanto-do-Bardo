/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;

/**
   Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
    Gabriella Cruz e Silva (gabriellac2002) 202165512B
    Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B
    Pedro Souza Pinheiro da Silva Araujo (pedro123063) 202165560C 
 */
public class Cliente {
    
    private int idCliente;
    private String nome;
    private String celular;
    private String cpf;
    
    public Cliente(int idCliente, String nome, String celular, String cpf){
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
    
    
    
}
