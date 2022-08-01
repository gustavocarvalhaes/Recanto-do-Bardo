/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controllers;
import java.awt.event.ActionListener;
import com.mycompany.recantodobardo.models.Administrador;
import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.view.MenuAdm;
import com.mycompany.recantodobardo.view.MenuClientes;
import com.mycompany.recantodobardo.view.TelaLogin;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author gcarv
 */



public class LoginController implements ActionListener {

    // implementa o login dos dois tipos de usuários

    TelaLogin tela;

    public LoginController(TelaLogin tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String email = tela.getText_field_email().getText();
        String senha = tela.getText_field_senha().getText();

        List<Cliente> clientList = (List<Cliente>) tela.getListaCliente();

        for(Cliente cliente : clientList) {
            if (cliente.getEmail().equals(email)) {
                if (cliente.getSenha().equals(senha)) {
                    new MenuClientes();
                    this.tela.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Senha do cliente incorreta!");
                }
            }
        }
 
       // if (email == "adm@gmail.com") {// fazer uma verificação simples de um login genérico
        //    if (senha == "adm123") {// tipo verificar se o email passado é admin@gmail.com
        //        this.tela.setVisible(false);//e a senha é admin123
        //        new MenuAdm();
        //    } else {
        //        JOptionPane.showMessageDialog(null, "Senha do administrador incorreta!");
        //    }
      ///  }
        }
    }

