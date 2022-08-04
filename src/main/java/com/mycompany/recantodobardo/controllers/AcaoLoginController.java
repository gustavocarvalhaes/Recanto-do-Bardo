//package com.mycompany.recantodobardo.controllers;
//
//import com.mycompany.recantodobardo.models.Cliente;
//import com.mycompany.recantodobardo.models.Item;
//import com.mycompany.recantodobardo.models.Mesa;
//import com.mycompany.recantodobardo.models.Reserva;
//
//import com.mycompany.recantodobardo.util.LerArquivo;
//import com.mycompany.recantodobardo.util.ClienteToJson;
//import com.mycompany.recantodobardo.view.TelaLogin;
//import com.mycompany.recantodobardo.view.ViewClientes;
//
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.DefaultListModel;
//import javax.swing.ListModel;
//import javax.swing.JOptionPane;
//
//public class AcaoLoginController implements WindowListener {
//
//    
//    TelaLogin view;// instancia uma tela para ter acesso aos dados escritos
//
//    public AcaoLoginController(TelaLogin view) {
//        this.view = view;
//    }
//    
//    @Override
//    public void windowOpened(WindowEvent e) {
//        
//        
//        
//        try {
//            String lerArquivo = LerArquivo.lerArquivo("data/ClientesJson.json");
//            List<Cliente> clientes = ClienteToJson.listaClientes(lerArquivo);
//            
//        } catch (FileNotFoundException ex) {
//        }
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        
//        ListModel<Cliente> model = view.getLista().getModel();
//        List<Cliente> clientes = new ArrayList<>();
//        
//        
//        for (int i = 0; i < model.getSize(); i++) {
//            clientes.add(model.getElementAt(i));
//        }
//        
//        String toJSON = ClienteToJson.listToJson(clientes);
//        
//        System.out.println(toJSON);
//        
//        LerArquivo.escreverArquivo("data/ClientesJson.json", toJSON);
//        
//        System.out.println("windowClosing");
//        
//        
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//        
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//        
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//        
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//        
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//        
//    }
//    
//}