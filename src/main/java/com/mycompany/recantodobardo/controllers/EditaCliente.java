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
public class EditaCliente implements ActionListener{
    
    ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public EditaCliente(ViewClientes view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Cliente> model = (DefaultListModel<Cliente>) this.view.getLista().getModel();// talvez tenha que mudar para ListModel
        Cliente cliente = model.getElementAt(view.getLastIndex());
        cliente.setNome(view.getText_field_nome().getText());
        cliente.setEmail(view.getText_field_email().getText());
        cliente.setSenha(view.getText_field_senha().getText());

        view.repaint();
    }
}
