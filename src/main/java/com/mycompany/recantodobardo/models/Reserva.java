/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;
import java.util.ArrayList;

 //   Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  //  Gabriella Cruz e Silva (gabriellac2002) 202165512B
  //  Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B
   // Pedro Souza Pinheiro da Silva Araujo (pedro123063) 202165560C 
public class Reserva {
    
    private int idReserva;
    private Cliente cliente; 
    private ArrayList<Item> itens = new ArrayList<Item>(); //colocamos um arrayList pois uma reserva pode ter mais de um item
    private float total;
    
    public Reserva(int id, Cliente cliente, float total){
        this.idReserva = id;
        this.cliente = cliente;
        this.total = total;
    }

    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

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
     * @return the itens
     */
    public ArrayList<Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Float total) {
        this.total = total;
    }
    
}
