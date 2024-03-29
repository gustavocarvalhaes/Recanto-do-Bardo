/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author cdcru
 */
public class TelaLogin extends JFrame implements Views{
    private JTextField text_field_email;
    private JTextField text_field_senha;
    private JButton button_login;
    private JPanel formLogin;
    
    public TelaLogin(){
        this.inicializar();
    }
    
    
    @Override
    public void inicializar(){
        this.setTitle("Login");
        this.setSize(640,480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
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
        espaco1.setLayout(new GridLayout(5,1));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(300,200);
        espaco2.setLayout(new GridLayout(5,1));
        
        formLogin.add(espaco1);
        formLogin.add(espaco2);
        
        JLabel label_titulo = new JLabel("Recanto do Bardo");
        espaco1.add(label_titulo);
        JLabel label_espaco = new JLabel("");
        espaco2.add(label_espaco);
        
        
        //email
        JLabel label_email = new JLabel("Email:");
        espaco1.add(label_email);
        this.setText_field_email(new JTextField(30));
        //this.text_field_email.setPreferredSize(new Dimension(100,10));
        espaco2.add(this.text_field_email);
        
        //senha
        JLabel label_senha = new JLabel("Senha:");
        espaco1.add(label_senha);
        this.setText_field_senha(new JTextField(30));
        espaco2.add(this.text_field_senha);
        
        //button
        this.setButton_login(new JButton("Ok"));
        espaco1.add(this.button_login);
       
    }
    
    public JTextField getText_field_email() {
        return text_field_email;
    }


    public void setText_field_email(JTextField text_field_email) {
        this.text_field_email = text_field_email;
    }


    public JTextField getText_field_senha() {
        return text_field_senha;
    }


    public void setText_field_senha(JTextField text_field_senha) {
        this.text_field_senha = text_field_senha;
    }


    public JButton getButton_login() {
        return button_login;
    }


    public void setButton_login(JButton button_login) {
        this.button_login = button_login;
    }
    
    public static void main(String[] args) {
        TelaLogin tela = new TelaLogin();
        tela.inicializar();
    }
    
}

