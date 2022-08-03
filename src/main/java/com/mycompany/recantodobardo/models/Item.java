
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.models;

public class Item {
    
    private String nome;
    private float precoHora;

    public Item(String nome, float precoHora) {
       this.nome = nome;
       this.precoHora = precoHora;
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

    public String convertPrecoHora()
    {
        return Float.toString(getPrecoHora());
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
