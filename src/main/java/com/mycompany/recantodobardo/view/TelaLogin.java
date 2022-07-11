/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
/**
 *
 * @author cdcru
 */
public class TelaLogin extends JFrame{
    
    private JTextField text_field_email;
    private JTextField text_field_senha;
    private JButton button_login;
    private JPanel formLogin;
    int size = 15;
    
    
    public TelaLogin(){
        this.inicializar();
    }
    
    private void inicializar(){
        this.setTitle("Login");
        this.setSize(640,480);
        this.setVisible(true);
        
        GridLayout grid = new GridLayout(3, 2);
        grid.setVgap(40);
        grid.setHgap(30);
        
        this.formLogin = new JPanel();
        this.formLogin.setLayout(grid);
        this.add(formLogin);
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setBorder(BorderFactory.createTitledBorder("Login"));
        espaco1.setLayout(new GridLayout(4,2));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(300,200);
        espaco2.setLayout(new GridLayout(4,1));
        
        formLogin.add(espaco1);
        formLogin.add(espaco2);
        
        
        //email
        JLabel label_email = new JLabel("Email:");
        espaco1.add(label_email);
        this.text_field_email = new JTextField();
        this.text_field_email.setPreferredSize(new Dimension(100,10));
        espaco1.add(text_field_email);
        
        //senha
        //JLabel label_senha = new JLabel("Senha:");
        //formLogin.add(label_senha);
        //this.text_field_senha = new JTextField();
        //formLogin.add(text_field_senha);
        
        //button
        //this.button_login = new JButton("Ok");
        //formLogin.add(button_login);
       //formLogin.add(this.button_login);
       
    }
    
    
}
