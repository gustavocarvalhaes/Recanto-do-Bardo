
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.MesaController;

import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.MesaToJson;
import com.mycompany.recantodobardo.view.ViewMesas;
import com.mycompany.recantodobardo.models.Mesa;

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

public class MesaController implements WindowListener 
{

    ViewMesas view;// instancia uma tela para ter acesso aos dados escritos

    public MesaController(ViewMesas view) 
    {
        this.view = view;
    }
    
    @Override
    public void windowOpened(WindowEvent e) 
    {
        
        try 
        {
            String lerArquivo = Arquivo.lerArquivo("data/MesaData.json");
            List<Mesa> mesas = MesaToJson.listaMesas(lerArquivo);
            
            DefaultListModel<Mesa> modelo = new DefaultListModel<>();
            
            for (Mesa mesa : mesas) 
            {
                modelo.addElement(mesa);
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
        
        ListModel<Mesa> model = view.getLista().getModel();
        List<Mesa> mesas = new ArrayList<>();
        
        
        for (int i = 0; i < model.getSize(); i++) 
        {
            mesas.add(model.getElementAt(i));
        }
        
        String toJSON = MesaToJson.listToJson(mesas);
        
        System.out.println(toJSON);
        
        Arquivo.escreverArquivo("data/MesaData.json", toJSON);
        
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
