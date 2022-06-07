/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cdcru
 */
public class Reserva {
    private Cliente cliente;
    private Jogo jogo;
    private Integer id_reserva;
    private Date dia_reserva;
    private Date hora_reserva;
    private Integer numero_cadeiras;

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the jogo
     */
    public Jogo getJogo() {
        return jogo;
    }

    /**
     * @param jogo the jogo to set
     */
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    /**
     * @return the id_reserva
     */
    public Integer getId_reserva() {
        return id_reserva;
    }

    /**
     * @param id_reserva the id_reserva to set
     */
    public void setId_reserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }

    /**
     * @return the dia_reserva
     */
    public Date getDia_reserva() {
        return dia_reserva;
    }

    /**
     * @param dia_reserva the dia_reserva to set
     */
    public void setDia_reserva(Date dia_reserva) {
        this.dia_reserva = dia_reserva;
    }

    /**
     * @return the hora_reserva
     */
    public Date getHora_reserva() {
        return hora_reserva;
    }

    /**
     * @param hora_reserva the hora_reserva to set
     */
    public void setHora_reserva(Date hora_reserva) {
        this.hora_reserva = hora_reserva;
    }

    /**
     * @return the numero_cadeiras
     */
    public Integer getNumero_cadeiras() {
        return numero_cadeiras;
    }

    /**
     * @param numero_cadeiras the numero_cadeiras to set
     */
    public void setNumero_cadeiras(Integer numero_cadeiras) {
        this.numero_cadeiras = numero_cadeiras;
    }
}
