/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;

 //   Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  //  Gabriella Cruz e Silva (gabriellac2002) 202165512B
  //  Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B
   // Pedro Souza Pinheiro da Silva Araujo (pedro123063) 202165560C 
public class Mesa {
    
    private Integer idMesa;
    private Reserva reserva;
    private Integer assentos;
    private Boolean disponibilidade;

    /**
     * @return the idMesa
     */
    public Integer getIdMesa() {
        return idMesa;
    }

    /**
     * @param idMesa the idMesa to set
     */
    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    /**
     * @return the reserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    /**
     * @return the assentos
     */
    public Integer getAssentos() {
        return assentos;
    }

    /**
     * @param assentos the assentos to set
     */
    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
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
    
}
