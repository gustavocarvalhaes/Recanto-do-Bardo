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
    
    private String idMesa;
    private int assentos;
    private boolean disponibilidade;
    
    public Mesa(String id, int assentos, boolean disponibilidade){
        this.idMesa = id;
        this.assentos = assentos;
        this.disponibilidade = disponibilidade;
    }

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        this.idMesa = idMesa;
    }

    public Integer getAssentos() {
        return assentos;
    }


    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    @Override
    public String toString() {
        return this.getIdMesa();
    }
    
}
