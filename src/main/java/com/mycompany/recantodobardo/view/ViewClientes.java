/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.view;
import com.mycompany.recantodobardo.controller.UserController.ClienteController;
import com.mycompany.recantodobardo.controller.UserController.AdicionaCliente;
import com.mycompany.recantodobardo.controller.UserController.EditaCliente;
import com.mycompany.recantodobardo.controller.UserController.ExibirClientes;
import com.mycompany.recantodobardo.controller.UserController.RemoveCliente;
import com.mycompany.recantodobardo.controller.VTAdmCliente;
import com.mycompany.recantodobardo.controller.VTAdmReserva;
import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Usuario;
import com.mycompany.recantodobardo.util.Arquivo;
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
public class ViewClientes extends JFrame implements Views{
    private JTextField text_field_nome;
    private int lastIndex;
    private JTextField text_field_email;
    private JTextField text_field_senha;
    private JPanel principal;
    private JList<Cliente> lista;

    public JList<Cliente> getLista() {
        return lista;
    }

    public void setLista(JList<Cliente> lista) {
        this.lista = lista;
    }

    public ViewClientes(){
        this.lastIndex = 0;
    }
    
    public void setLastIndex(int lastIndex){
        this.lastIndex = lastIndex;
    }
    
    public int getLastIndex() {
        return lastIndex;
    }
    public JTextField getText_field_nome() {
        return text_field_nome;
    }

    public void setText_field_nome(JTextField text_field_nome) {
        this.text_field_nome = text_field_nome;
    }

    public JTextField getText_field_email() {
        return text_field_email;
    }

    public void setText_field_email(JTextField text_field_email) {
        this.text_field_email = text_field_email;
    }

    public JTextField getText_field_senha() {
        return text_field_senha;
    }

    public void setText_field_senha(JTextField text_field_senha) {
        this.text_field_senha = text_field_senha;
    }
    
    @Override
    public void inicializar(){
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        this.addWindowListener(new ClienteController(this));
        
        JPanel jpClientes = new JPanel();
        jpClientes.setBorder(BorderFactory.createTitledBorder("Usuários"));
        jpClientes.setLayout(new BorderLayout());
        jpClientes.setPreferredSize(new Dimension(200, 300));
        DefaultListModel<Cliente> model = new DefaultListModel<>();


        lista = new JList<>(model);
        lista.setVisible(true);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new ExibirClientes(this));
        jpClientes.add(new JScrollPane(lista), BorderLayout.CENTER);


        principal.add(jpClientes, BorderLayout.WEST);
        
        int size = 20;
        JPanel jpFormulario = new JPanel();
        jpFormulario.setBorder(BorderFactory.createTitledBorder("Formulário"));

        jpFormulario.add(new JLabel("Nome:"));
        text_field_nome = new JTextField(size);
        jpFormulario.add(text_field_nome);

        jpFormulario.add(new JLabel("E-mail:"));
        text_field_email = new JTextField(size);
        jpFormulario.add(text_field_email);

        jpFormulario.add(new JLabel("Senha:"));
        text_field_senha = new JTextField(size);
        jpFormulario.add(text_field_senha);

                

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new AdicionaCliente(this));
        jpFormulario.add(btnAdicionar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new RemoveCliente(this));
        jpFormulario.add(btnRemover);
        
        
        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(new EditaCliente(this));
        jpFormulario.add(btnEditar);
        
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new VTAdmCliente(this));
        jpFormulario.add(btnVoltar);

        
        principal.add(jpFormulario, BorderLayout.CENTER);
        
        this.add(principal);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        ViewClientes tela = new ViewClientes();
        tela.inicializar();
    }

 }