/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
        
        //GridLayout grid = new GridLayout(3, 2);
        //grid.setVgap(30);
        //grid.setHgap();
        
        this.formLogin = new JPanel();
        this.formLogin.setLayout(new FlowLayout());
        this.formLogin.setBorder(BorderFactory.createTitledBorder("Login"));
        this.add(formLogin);
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setLayout(new GridLayout(4,1));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(300,200);
        espaco2.setLayout(new GridLayout(4,1));
        
        formLogin.add(espaco1);
        formLogin.add(espaco2);
        
        
        //email
        JLabel label_email = new JLabel("Email:");
        espaco1.add(label_email);
        this.setText_field_email(new JTextField(50));
        //this.text_field_email.setPreferredSize(new Dimension(100,10));
        espaco2.add(getText_field_email());
        
        //senha
        JLabel label_senha = new JLabel("Senha:");
        espaco1.add(label_senha);
        this.setText_field_senha(new JTextField(50));
        espaco2.add(getText_field_senha());
        
        //button
        this.setButton_login(new JButton("Ok"));
        espaco1.add(this.getButton_login());
       
    }

    public JTextField getText_field_email() {
        return text_field_email;
    }


    public void setText_field_email(JTextField text_field_email) {
        this.text_field_email = text_field_email;
    }

    /**
     * @return the text_field_senha
     */
    public JTextField getText_field_senha() {
        return text_field_senha;
    }

    /**
     * @param text_field_senha the text_field_senha to set
     */
    public void setText_field_senha(JTextField text_field_senha) {
        this.text_field_senha = text_field_senha;
    }

    /**
     * @return the button_login
     */
    public JButton getButton_login() {
        return button_login;
    }

    /**
     * @param button_login the button_login to set
     */
    public void setButton_login(JButton button_login) {
        this.button_login = button_login;
    }
    
    
    
}
