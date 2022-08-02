
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.models;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Reserva {
    
    private Cliente cliente; 
    private List<Item> itens = new ArrayList<>();
    private Calendar dia;
    private Calendar horaInicio;
    private Calendar horaFim;
    private boolean fimReserva = false;
    private float total;
    
    public Reserva(Cliente cliente, List<Item> itens, Calendar dia, Calendar horaInicio, Calendar horaFim) {
        this.cliente = cliente;
        this.itens = itens;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
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
    public List<Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<Item> itens) {
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
    
    public void cadastrarReserva(Reserva reserva){
        
    }
    
}
