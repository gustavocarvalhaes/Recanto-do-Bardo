/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controller;

import com.mycompany.recantodobardo.view.MenuAdm;
import com.mycompany.recantodobardo.view.MenuClientes;
import com.mycompany.recantodobardo.view.ViewClientes;
import com.mycompany.recantodobardo.view.ViewReservas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gcarv
 */
public class MudarTelaCliente implements ActionListener{
    
    MenuAdm tela;
    

    public MudarTelaCliente(MenuAdm tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        new ViewClientes().inicializar();
        this.tela.dispose();
    }
}
