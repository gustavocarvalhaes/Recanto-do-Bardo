/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controller;

import com.mycompany.recantodobardo.view.MenuClientes;
import com.mycompany.recantodobardo.view.ViewReservas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gcarv
 */
public class MudarTela implements ActionListener{
    
    MenuClientes tela;
    

    public MudarTela(MenuClientes tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        new ViewReservas().setVisible(true);
      
        this.tela.dispose();
    }
}
