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
public class CadastroItens extends JFrame{
    private JTextField text_field_nome;
    private JTextField text_field_tipo;
    private JTextField text_field_preco_hora;
    private JButton button_confirm;
    private JButton button_cancel;
    private JPanel formCadItens;
    
    
    public CadastroItens(){
        this.inicializar();
    }
    
    private void inicializar(){
        this.setTitle("Cadastro de Itens");
        this.setSize(640,480);
        this.setVisible(true);
        
        
        this.formCadItens = new JPanel();
        this.formCadItens.setLayout(new FlowLayout());
        this.formCadItens.setBorder(BorderFactory.createTitledBorder("Login"));
        this.add(formCadItens);
        
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setLayout(new GridLayout(4,1));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(300,200);
        espaco2.setLayout(new GridLayout(4,1));
        
        formCadItens.add(espaco1);
        formCadItens.add(espaco2);
        
        
        JLabel label_titulo = new JLabel("Cadastro - Itens");
        espaco1.add(label_titulo);
        JLabel label_espaco = new JLabel("");
        espaco2.add(label_espaco);
        
        //email
        JLabel label_nome_item = new JLabel("Nome:");
        espaco1.add(label_nome_item);
        this.text_field_nome(new JTextField(50));
        espaco2.add(text_field_nome());
        
        //senha
        JLabel label_senha = new JLabel("Senha:");
        espaco1.add(label_senha);
        this.setText_field_senha(new JTextField(50));
        espaco2.add(getText_field_senha());
        
        //button
        this.setButton_login(new JButton("Ok"));
        espaco1.add(this.getButton_login());
       
    }

}
