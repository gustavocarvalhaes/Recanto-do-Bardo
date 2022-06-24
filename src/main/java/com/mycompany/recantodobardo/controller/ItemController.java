/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controller;
import com.mycompany.recantodobardo.models.Item;

/**
 *
 * @author cdcru
 */
public class ItemController {
    public boolean cadastrarItem(String nome,String tipo,int quantidade,
    float precoHora){
        //se todos os dados estiverem preenchidos corretamente
        if( nome != null && nome.length() > 0 && tipo != null && tipo.length() > 0
                && quantidade != 0 && precoHora == 0){
            Item item = new Item(1,nome,tipo,quantidade,precoHora,true);
        }
    }
}
