
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.models;

public class Mesa {
    
    private String idMesa;
    private int assentos;
    private boolean disponibilidade;
    
    public Mesa(String idMesa, int assentos, boolean disponibilidade)
    {
        this.idMesa = idMesa;
        this.assentos = assentos;
        this.disponibilidade = true;
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

    public String convertAssentos()
    {
        return Integer.toString(getAssentos());
    }
    
}
