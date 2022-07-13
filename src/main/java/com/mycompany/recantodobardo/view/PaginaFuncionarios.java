package com.mycompany.recantodobardo.view;


import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
   Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
    Gabriella Cruz e Silva (gabriellac2002) 202165512B
    Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B
    Pedro Souza Pinheiro da Silva Araujo (pedro123063) 202165560C 
 */


public class PaginaFuncionarios extends JFrame {
    
    private JButton button_clientes;
    private JButton button_reservas;
    private JPanel container_funcionarios;
    
    public PaginaFuncionarios(){
        inicializar();
    }
    
    private void inicializar(){
       this.setTitle("Funcionarios");
       this.setSize(640,480);
       this.setVisible(true);
        
        
        this.container_funcionarios = new JPanel();
        this.container_funcionarios.setLayout(new FlowLayout());
        this.container_funcionarios.setBorder(BorderFactory.createTitledBorder("Olá funcionario"));
        this.add(container_funcionarios);
    }
    
}
