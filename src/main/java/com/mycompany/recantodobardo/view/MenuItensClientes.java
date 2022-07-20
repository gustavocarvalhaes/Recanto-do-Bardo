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

/**
 *
 * @author cdcru
 */
public class MenuItensClientes extends JFrame{
    
    private JButton button_lista;
    private JButton button_voltar;
    private JPanel menuItensCliente;
    
    public MenuItensClientes(){
        inicializar();
    }
    
    private void inicializar(){
        this.setTitle("Clientes");
        this.setSize(640,480);
        this.setVisible(true);
        
        this.menuItensCliente = new JPanel();
        this.menuItensCliente.setLayout(new FlowLayout());
        this.menuItensCliente.setBorder(BorderFactory.createTitledBorder("Menu Clientes"));
        this.add(menuItensCliente);
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setLayout(new GridLayout(3,1));
        
        this.menuItensCliente.add(espaco1);

        JLabel label_titulo = new JLabel("---- Itens ----");
        espaco1.add(label_titulo);
        this.setButton_voltar(new JButton("Voltar"));
        espaco1.add(this.button_voltar);
       
        this.setButton_lista(new JButton("Listar"));
        espaco1.add(this.button_lista);
    }
    
    public void setButton_voltar(JButton button_voltar) {
        this.button_voltar = button_voltar;
    }
    
    public void setButton_lista(JButton button_lista) {
    this.button_lista = button_lista;
    }
}
