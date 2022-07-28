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
    private JTextField text_field_quant;
    private JTextField text_field_assentos;
    private JPanel principal;
    private JList<Mesa> lista;
    private int lastIndex;
    
    public ViewReservas(){
        this.lastIndex = 0;
    }
    
    
    @Override
    public void inicializar(){
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        
        //this.addWindowListener(new EventoJanela(this));
        
        JPanel jpClientes = new JPanel();
        jpClientes.setBorder(BorderFactory.createTitledBorder("Reservas"));
        jpClientes.setLayout(new BorderLayout());
        jpClientes.setPreferredSize(new Dimension(200, 300));

        DefaultListModel<Mesa> model = new DefaultListModel<>();


        lista = new JList<>(model);
        lista.setVisible(true);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //lista.addListSelectionListener(new TratarLista(this));
        jpClientes.add(new JScrollPane(lista), BorderLayout.CENTER);


        principal.add(jpClientes, BorderLayout.WEST);
        
         int size = 20;
        JPanel jpFormulario = new JPanel();
        jpFormulario.setBorder(BorderFactory.createTitledBorder("Formulário"));

        jpFormulario.add(new JLabel("Quantidade:"));
        text_field_quant = new JTextField(size);
        jpFormulario.add(text_field_quant);

        jpFormulario.add(new JLabel("Assentos:"));
        text_field_assentos = new JTextField(size);
        jpFormulario.add(text_field_assentos);


                

        JButton btnAdicionar = new JButton("Adicionar");
        //btnAdicionar.addActionListener(new SalvarContato(this));
        jpFormulario.add(btnAdicionar);

        JButton btnRemover = new JButton("Remover");
       // btnRemover.addActionListener(new RemoverContato(this));
        jpFormulario.add(btnRemover);
        
        
        JButton btnEditar = new JButton("Editar");
       // btnEditar.addActionListener(new EditarContato(this));
        jpFormulario.add(btnEditar);
        
        principal.add(jpFormulario, BorderLayout.CENTER);
        
        this.add(principal);
        this.setVisible(true);

    }
    
    public static void main(String[] args) {
      ViewMesas tela = new ViewMesas();
      tela.inicializar();
    }
}
