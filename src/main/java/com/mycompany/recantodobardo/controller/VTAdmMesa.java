/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controller;

import com.mycompany.recantodobardo.view.MenuAdm;
import com.mycompany.recantodobardo.view.ViewClientes;
import com.mycompany.recantodobardo.view.ViewItens;
import com.mycompany.recantodobardo.view.ViewMesas;
import com.mycompany.recantodobardo.view.ViewReservas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gcarv
 */
public class VTAdmMesa implements ActionListener{
    
    ViewMesas tela;
    

    public VTAdmMesa(ViewMesas tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        new MenuAdm().inicializar();
        this.tela.dispose();
    }
}
