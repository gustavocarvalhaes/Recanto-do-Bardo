
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ItemController;

import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ItemToJson;
import com.mycompany.recantodobardo.view.ViewItens;
import com.mycompany.recantodobardo.models.Item;

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

public class ItemController implements WindowListener 
{

    ViewItens view;// instancia uma tela para ter acesso aos dados escritos

    public ItemController(ViewItens view) 
    {
        this.view = view;
    }
    
    @Override
    public void windowOpened(WindowEvent e) 
    {
        
        try 
        {
            String lerArquivo = Arquivo.lerArquivo("data/ItemData.json");
            List<Item> itens = ItemToJson.listaItens(lerArquivo);
            
            DefaultListModel<Item> modelo = new DefaultListModel<>();
            
            for (Item item : itens) 
            {
                modelo.addElement(item);
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
        
        ListModel<Item> model = view.getLista().getModel();
        List<Item> itens = new ArrayList<>();
        
        
        for (int i = 0; i < model.getSize(); i++) 
        {
            itens.add(model.getElementAt(i));
        }
        
        String toJSON = ItemToJson.listToJson(itens);
        
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
