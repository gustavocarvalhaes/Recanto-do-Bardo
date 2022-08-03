/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;

/**
   Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
    Gabriella Cruz e Silva (gabriellac2002) 202165512B
    Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B
    Pedro Souza Pinheiro da Silva Araujo (pedro123063) 202165560C 
 */
public class Cliente extends Usuario {

    public Cliente(String nome, String email, String senha, boolean adm) {
        super(email, senha, nome, adm);
    }

    @Override
    public String toString() {
        
        if(isAdm()){
            return this.getNome() + " [ADM]"; 
        }
        return this.getNome();
    }
}
