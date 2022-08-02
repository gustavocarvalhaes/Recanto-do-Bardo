
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ReservaController;

import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ReservaToJson;
import com.mycompany.recantodobardo.view.ViewReservas;
import com.mycompany.recantodobardo.models.Reserva;

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

public class ReservaController implements WindowListener 
{

    ViewReservas view;// instancia uma tela para ter acesso aos dados escritos

    public ReservaController(ViewReservas view) 
    {
        this.view = view;
    }
    
    @Override
    public void windowOpened(WindowEvent e) 
    {
        
        try 
        {
            String lerArquivo = Arquivo.lerArquivo("data/ReservaData.json");
            List<Reserva> reservas = ReservaToJson.listaReservas(lerArquivo);
            
            DefaultListModel<Reserva> modelo = new DefaultListModel<>();
            
            for (Reserva reserva : reservas) 
            {
                modelo.addElement(reserva);
            }
            
            view.getLista().setModel(modelo);
            view.repaint();
            
        } 
        catch (FileNotFoundException ex) 
        {

        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
        ListModel<Reserva> model = view.getLista().getModel();
        List<Reserva> reservas = new ArrayList<>();
        
        
        for (int i = 0; i < model.getSize(); i++) 
        {
            reservas.add(model.getElementAt(i));
        }
        
        String toJSON = ReservaToJson.listToJson(reservas);
        
        System.out.println(toJSON);
        
        Arquivo.escreverArquivo("data/ItemData.json", toJSON);
        
        System.out.println("windowClosing");
        
        
    }

    @Override
    public void windowClosed(WindowEvent e) 
    {
        
    }

    @Override
    public void windowIconified(WindowEvent e) 
    {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) 
    {
        
    }

    @Override
    public void windowActivated(WindowEvent e) 
    {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) 
    {
        
    }
    
}
