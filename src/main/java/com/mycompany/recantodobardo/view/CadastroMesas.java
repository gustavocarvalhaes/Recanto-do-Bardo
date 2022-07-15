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
public class CadastroMesas extends JFrame{

    private JTextField text_field_quant;
    private JTextField text_field_assentos;
    private JButton button_confirm;
    private JButton button_cancel;
    private JPanel formCadMesas;
    
    public CadastroMesas(){
        this.inicialzar();
    }
    
    private void inicialzar(){
        this.setTitle("Cadastro de mesas");
        this.setSize(640,480);
        this.setVisible(true);
        
        this.formCadMesas = new JPanel();
        this.formCadMesas.setLayout(new FlowLayout());
        this.formCadMesas.setBorder(BorderFactory.createTitledBorder("Clientes"));
        this.add(formCadMesas);
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setLayout(new GridLayout(4,1));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(300,200);
        espaco2.setLayout(new GridLayout(4,1));
        
        formCadMesas.add(espaco1);
        formCadMesas.add(espaco2);
        
        JLabel label_titulo = new JLabel("Cadastro - Mesas");
        espaco1.add(label_titulo);
        JLabel label_espaco = new JLabel("");
        espaco2.add(label_espaco);
        
        //quantidade
        JLabel label_quant = new JLabel("Quantudade de mesas:");
        espaco1.add(label_quant);
        this.setText_field_quant(new JTextField(10));
        espaco2.add(this.text_field_quant);
        
        //assentos
        JLabel label_assentos = new JLabel("Quantudade de assentos por mesa:");
        espaco1.add(label_assentos);
        this.setText_field_assentos(new JTextField(10));
        espaco2.add(this.text_field_assentos);
        
         //botoes
        this.setButton_cancel(new JButton("Cancelar"));
        espaco1.add(this.getButton_cancel());
        this.setButton_confirm(new JButton("Confirmar"));
        espaco2.add(this.getButton_confirm());
    }


    public JTextField getText_field_quant() {
        return text_field_quant;
    }


    public void setText_field_quant(JTextField text_field_quant) {
        this.text_field_quant = text_field_quant;
    }


    public JTextField getText_field_assentos() {
        return text_field_assentos;
    }


    public void setText_field_assentos(JTextField text_field_assentos) {
        this.text_field_assentos = text_field_assentos;
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


    public JPanel getFormCadMesas() {
        return formCadMesas;
    }


    public void setFormCadMesas(JPanel formCadMesas) {
        this.formCadMesas = formCadMesas;
    }
}
