/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.view;
import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Item;
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
public class ViewItens extends JFrame implements Views{
    
    private JTextField text_field_nome;
    private JTextField text_field_tipo;
    private JTextField text_field_preco;
    private JPanel principal;
    private JList<Item> lista;
    private int lastIndex;
    
    public ViewItens(){
        this.lastIndex = 0;
    }
    
    
    @Override
    public void inicializar(){
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        
        JPanel jpClientes = new JPanel();
        jpClientes.setBorder(BorderFactory.createTitledBorder("Itens"));
        jpClientes.setLayout(new BorderLayout());
        jpClientes.setPreferredSize(new Dimension(200, 300));

        DefaultListModel<Item> model = new DefaultListModel<>();


        lista = new JList<>(model);
        lista.setVisible(true);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //lista.addListSelectionListener(new TratarLista(this));
        jpClientes.add(new JScrollPane(lista), BorderLayout.CENTER);


        principal.add(jpClientes, BorderLayout.WEST);
        
         int size = 20;
        JPanel jpFormulario = new JPanel();
        jpFormulario.setBorder(BorderFactory.createTitledBorder("Formulário"));

        jpFormulario.add(new JLabel("Nome:"));
        text_field_nome = new JTextField(size);
        jpFormulario.add(text_field_nome);

        jpFormulario.add(new JLabel("Tipo:"));
        text_field_tipo = new JTextField(size);
        jpFormulario.add(text_field_tipo);

        jpFormulario.add(new JLabel("Preco/Hora:"));
        text_field_preco = new JTextField(size);
        jpFormulario.add(text_field_preco);

                

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
        ViewItens tela = new ViewItens();
        tela.inicializar();
    }
}
