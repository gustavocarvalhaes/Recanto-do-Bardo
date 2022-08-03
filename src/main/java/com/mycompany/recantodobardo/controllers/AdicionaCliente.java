/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controllers;

/**
 *
 * @author gcarv
 */

import com.mycompany.recantodobardo.view.ViewClientes;
import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Usuario;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;


public class AdicionaCliente implements ActionListener {
    
    ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public AdicionaCliente(ViewClientes view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) { // esse é pra adicionar
        DefaultListModel<Cliente> model = (DefaultListModel<Cliente>) view.getLista().getModel();

        model.addElement(
                new Cliente(
                        view.getText_field_nome().getText(),
                        view.getText_field_email().getText(),
                        view.getText_field_senha().getText(),
                        false));

        view.getLista().setModel(model);
        view.repaint();

    }
}