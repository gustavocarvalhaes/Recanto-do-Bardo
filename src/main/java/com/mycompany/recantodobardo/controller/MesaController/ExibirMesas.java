
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.MesaController;
import com.mycompany.recantodobardo.view.ViewMesas;
import com.mycompany.recantodobardo.models.Mesa;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExibirMesas implements ListSelectionListener 
{

    ViewMesas view;

    public ExibirMesas(ViewMesas view) 
    {
        this.view = view;
    }
    
     @Override
    public void valueChanged(ListSelectionEvent e) {
        int firstIndex = view.getLista().getSelectedIndex();

        if (firstIndex != -1) 
        {
            
            Mesa elementAt = view.getLista().getModel().getElementAt(firstIndex);
            view.getText_field_idMesa().setText(elementAt.getIdMesa());
            view.getText_field_assentos().setText(elementAt.convertAssentos());
            
            view.setLastIndex(firstIndex);
            
        }
    }
    
}
