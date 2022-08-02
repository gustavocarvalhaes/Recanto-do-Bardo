
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.models;

public class Item {
    
    private String nome;
    private int quantidade;
    private float precoHora;
    private boolean disponibilidade;

    public Item(String nome, int quantidade, float precoHora, boolean disponibilidade) {
       this.nome = nome;
       this.quantidade = quantidade;
       this.precoHora = precoHora;
       this.disponibilidade = disponibilidade;
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
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
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

    /**
     * @return the disponibilidade
     */
    public Boolean getDisponibilidade() {
        if (this.quantidade > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param disponibilidade the disponibilidade to set
     */
    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String convertQuantidade()
    {
        return Integer.toString(getQuantidade());
    }

    public String convertPrecoHora()
    {
        return Float.toString(getPrecoHora());
    }
    
}
