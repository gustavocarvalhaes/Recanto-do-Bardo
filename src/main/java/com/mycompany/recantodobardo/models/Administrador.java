/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;

/**
 *
 * @author cdcru
 */
public class Administrador extends Usuario {
    
    public Administrador(String email, String senha, String nome, boolean adm) {
        super(email, senha, nome, adm);
        setAdm(true);
    }

}
