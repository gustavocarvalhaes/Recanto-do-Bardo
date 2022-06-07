/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.model;

import java.util.ArrayList;

/**
 *
 * @author cdcru
 */
public class Cliente {
    private String nome;
    private Integer id_cliente;
    private String cpf;
    private Integer telefone;
    private String endereco;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

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
     * @return the id_cliente
     */
    public Integer getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
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

    /**
     * @return the telefone
     */
    public Integer getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the reservas
     */
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    /**
     * @param reservas the reservas to set
     */
    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}
