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
public class CadastroClientes extends JFrame{
    
    private JTextField text_field_nome;
    private JTextField text_field_celular;
    private JTextField text_field_cpf;
    private JButton button_confirm;
    private JButton button_cancel;
    private JPanel formCadClientes;
    
    
    public CadastroClientes(){
        this.inicializar();
    }
    
    private void inicializar(){
        this.setTitle("Cadastro de Itens");
        this.setSize(640,480);
        this.setVisible(true);
        
        
        this.formCadClientes = new JPanel();
        this.formCadClientes.setLayout(new FlowLayout());
        this.formCadClientes.setBorder(BorderFactory.createTitledBorder("Itens"));
        this.add(formCadClientes);
        
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setLayout(new GridLayout(5,1));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(300,200);
        espaco2.setLayout(new GridLayout(5,1));
        
        formCadClientes.add(espaco1);
        formCadClientes.add(espaco2);
        
        
        JLabel label_titulo = new JLabel("Cadastro - Clientes");
        espaco1.add(label_titulo);
        JLabel label_espaco = new JLabel("");
        espaco2.add(label_espaco);
        
        //nome
        JLabel label_nome_item = new JLabel("Nome:");
        espaco1.add(label_nome_item);
        this.setText_field_nome(new JTextField(30));
        espaco2.add(this.text_field_nome);
        
        //celular
        JLabel label_celular = new JLabel("Numero de telefone:");
        espaco1.add(label_celular);
        this.setText_field_celular(new JTextField(30));
        espaco2.add(this.text_field_celular);
        
        //cpf
        JLabel label_cpf = new JLabel("CPF:");
        espaco1.add(label_cpf);
        this.setText_field_cpf(new JTextField(30));
        espaco2.add(this.text_field_cpf);
        
        
        //botoes
        this.setButton_cancel(new JButton("Cancelar"));
        espaco1.add(this.getButton_cancel());
        this.setButton_confirm(new JButton("Confirmar"));
        espaco2.add(this.getButton_confirm());
    }
    
    public JTextField getText_field_nome() {
        return text_field_nome;
    }
    
    public void setText_field_nome(JTextField text_field_nome) {
        this.text_field_nome = text_field_nome;
    }

    public JTextField getText_field_celular() {
        return text_field_celular;
    }


    public void setText_field_celular(JTextField text_field_celular) {
        this.text_field_celular = text_field_celular;
    }


    public JTextField getText_field_cpf() {
        return text_field_cpf;
    }


    public void setText_field_cpf(JTextField text_field_cpf) {
        this.text_field_cpf = text_field_cpf;
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
