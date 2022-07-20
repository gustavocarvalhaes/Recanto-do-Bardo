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
public class MenuItensAdmin extends JFrame{
    private JButton button_lista;
    private JButton button_voltar;
    private JButton button_cadastro;
    private JPanel menuItensAdm;
    
    public MenuItensAdmin(){
        inicializar();
    }

    private void inicializar() {
        this.setTitle("Adiministrativo");
        this.setSize(640,480);
        this.setVisible(true);
        
        this.menuItensAdm = new JPanel();
        this.menuItensAdm.setLayout(new FlowLayout());
        this.menuItensAdm.setBorder(BorderFactory.createTitledBorder("Menu Clientes"));
        this.add(menuItensAdm);
        
        //panel auxiliar
        JPanel espaco1 = new JPanel();
        espaco1.setSize(300,200);
        espaco1.setLayout(new GridLayout(4,1));
        
        menuItensAdm.add(espaco1);

        JLabel label_titulo = new JLabel("---- Clientes ----");
        espaco1.add(label_titulo);
        this.setButton_voltar(new JButton("Voltar"));
        espaco1.add(this.button_voltar);
       
        this.setButton_cadastro(new JButton("Cadastrar"));
        espaco1.add(this.button_cadastro);
        
        this.setButton_lista(new JButton("Listar"));
        espaco1.add(this.button_lista);
    }
    
     public JButton getButton_lista() {
        return button_lista;
    }


    public void setButton_lista(JButton button_lista) {
        this.button_lista = button_lista;
    }


    public JButton getButton_cadastro() {
        return button_cadastro;
    }


    public void setButton_cadastro(JButton button_cadastro) {
        this.button_cadastro = button_cadastro;
    }

    public JButton getButton_voltar() {
        return button_voltar;
    }


    public void setButton_voltar(JButton button_voltar) {
        this.button_voltar = button_voltar;
    }
}