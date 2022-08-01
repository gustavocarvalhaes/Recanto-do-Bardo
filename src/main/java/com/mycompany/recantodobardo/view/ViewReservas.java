/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.view;

import com.mycompany.recantodobardo.models.Mesa;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author cdcru
 */
public class ViewReservas extends JFrame implements Views{
    private JComboBox clientes;
    private JComboBox itens ;
    private JComboBox mesas;
    
    public ViewReservas(){
        inicializar();
    }
    
    
    @Override
    public void inicializar(){
       

    }
    
    public static void main(String[] args) {
      ViewMesas tela = new ViewMesas();
      tela.inicializar();
    }
}
