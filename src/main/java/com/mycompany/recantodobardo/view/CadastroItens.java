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
        this.formCadItens.setBorder(BorderFactory.createTitledBorder("Itens"));
        this.add(formCadItens);
        
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setLayout(new GridLayout(5,1));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(300,200);
        espaco2.setLayout(new GridLayout(5,1));
        
        formCadItens.add(espaco1);
        formCadItens.add(espaco2);
        
        
        JLabel label_titulo = new JLabel("Cadastro - Itens");
        espaco1.add(label_titulo);
        JLabel label_espaco = new JLabel("");
        espaco2.add(label_espaco);
        
        //nome
        JLabel label_nome_item = new JLabel("Nome do Item:");
        espaco1.add(label_nome_item);
        this.setText_field_nome(new JTextField(30));
        espaco2.add(this.text_field_nome);
        
        //tipo
        JLabel label_tipo_item = new JLabel("Tipo do item:");
        espaco1.add(label_tipo_item);
        this.setText_field_tipo(new JTextField(30));
        espaco2.add(this.text_field_tipo);
        
        //preco/hora
        JLabel label_tipo_preco_hora = new JLabel("Preço por hora:");
        espaco1.add(label_tipo_preco_hora);
        this.setText_field_preco_hora(new JTextField(30));
        espaco2.add(this.text_field_preco_hora);
        
        
        //botoes
        this.setButton_cancel(new JButton("Cancelar"));
        espaco1.add(this.button_cancel);
        this.setButton_confirm(new JButton("Confirmar"));
        espaco2.add(this.button_confirm);
       
    }
    
    public JTextField getText_field_nome() {
        return text_field_nome;
    }
    
    public void setText_field_nome(JTextField text_field_nome) {
        this.text_field_nome = text_field_nome;
    }
    
    public JTextField getText_field_tipo() {
        return text_field_nome;
    }
    
    public void setText_field_tipo(JTextField text_field_tipo) {
        this.text_field_tipo = text_field_tipo;
    }
    
    public JTextField getText_field_preco_hora() {
        return text_field_preco_hora;
    }
    
    public void setText_field_preco_hora(JTextField text_field_preco_hora) {
        this.text_field_preco_hora = text_field_preco_hora;
    }
    
     public JButton getButton_confirm() {
        return button_confirm;
    }


    public void setButton_confirm(JButton button_confirm) {
        this.button_confirm = button_confirm;
    }

    public JButton getButton_cancel() {
        return button_cancel;
    }


    public void setButton_cancel(JButton button_cancel) {
        this.button_cancel = button_cancel;
    }


}
