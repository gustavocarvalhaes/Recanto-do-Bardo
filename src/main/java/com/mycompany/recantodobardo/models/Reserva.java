
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.models;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Reserva {
    
    private Cliente cliente; 
    private Item item;
    private Mesa mesa;
    private String data;
    private String hora;

    // public Reserva(Cliente cliente, List<Item> itens, Mesa mesa, String data, String hora) {
    //     this.cliente = cliente;
    //     this.itens = itens;
    //     this.data = data;
    //     this.hora = hora;
    // }

    public Reserva(Object selectedItem, Object selectedItem2, Object selectedItem3, String text, String text2) {

        this.cliente = (Cliente) selectedItem;
        this.item = (Item) selectedItem2;
        this.mesa = (Mesa) selectedItem3;
        this.data = text;
        this.hora = text2;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reserva{" + cliente + ", N°: " + mesa + '}';
    }
    
    

}
