
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.UserController;

import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Item;
import com.mycompany.recantodobardo.models.Mesa;
import com.mycompany.recantodobardo.models.Reserva;

import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ClienteToJson;
import com.mycompany.recantodobardo.view.ViewClientes;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.JOptionPane;

public class ClienteController implements WindowListener {

    
    ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public ClienteController(ViewClientes view) {
        this.view = view;
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        
        
        
        try {
            String lerArquivo = Arquivo.lerArquivo("data/ClientesJson.json");
            List<Cliente> clientes = ClienteToJson.listaClientes(lerArquivo);
            
            DefaultListModel<Cliente> modelo = new DefaultListModel<>();
            
            for (Cliente cliente : clientes) {
                modelo.addElement(cliente);
            }
            
            view.getLista().setModel(modelo);
            view.repaint();
            
        } catch (FileNotFoundException ex) {
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
        ListModel<Cliente> model = view.getLista().getModel();
        List<Cliente> clientes = new ArrayList<>();
        
        
        for (int i = 0; i < model.getSize(); i++) {
            clientes.add(model.getElementAt(i));
        }
        
        String toJSON = ClienteToJson.listToJson(clientes);
        
        System.out.println(toJSON);
        
        Arquivo.escreverArquivo("data/ClientesJson.json", toJSON);
        
        System.out.println("windowClosing");
        
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
