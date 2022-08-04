
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ItemController;
import com.mycompany.recantodobardo.view.ViewItens;
import com.mycompany.recantodobardo.models.Item;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;

public class RemoveItem implements ActionListener 
{
    
    ViewItens view;

    public RemoveItem(ViewItens view) 
    {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    { 

        int selectedIndex = view.getLista().getSelectedIndex();

        if (selectedIndex != -1) 
        {
            DefaultListModel<Item> model = (DefaultListModel<Item>) view.getLista().getModel();
            model.removeElementAt(selectedIndex);
            view.getLista().setModel(model);
            view.repaint();
        }

    }

}