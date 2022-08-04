/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controllers;

import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.view.ViewClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author gcarv
 */
public class SelecionaAdm implements ActionListener{
    
     ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public SelecionaAdm(ViewClientes view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) { // esse é pra adicionar
        view.setAdemir(true);
    }     
}
