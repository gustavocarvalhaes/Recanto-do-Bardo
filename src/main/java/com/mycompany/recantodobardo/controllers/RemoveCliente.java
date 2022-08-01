/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controllers;
import com.mycompany.recantodobardo.view.ViewClientes;
import com.mycompany.recantodobardo.models.Cliente;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
/**
 *
 * @author gcarv
 */
public class RemoveCliente implements ActionListener {
    
    ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public RemoveCliente(ViewClientes view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { // esse é pra apagar

        int selectedIndex = view.getLista().getSelectedIndex();
        if (selectedIndex != -1) {
            DefaultListModel<Cliente> model = (DefaultListModel<Cliente>) view.getLista().getModel();
            model.removeElementAt(selectedIndex);
            view.getLista().setModel(model);
            view.repaint();
        }
    }
}
