
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ItemController;
import com.mycompany.recantodobardo.view.ViewItens;
import com.mycompany.recantodobardo.models.Item;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExibirItens implements ListSelectionListener 
{

    ViewItens view;

    public ExibirItens(ViewItens view) 
    {
        this.view = view;
    }
    
     @Override
    public void valueChanged(ListSelectionEvent e) {
        int firstIndex = view.getLista().getSelectedIndex();

        if (firstIndex != -1) 
        {
            
            Item elementAt = view.getLista().getModel().getElementAt(firstIndex);
            view.getText_field_nome().setText(elementAt.getNome());
            view.getText_field_quantidade().setText(elementAt.convertQuantidade());
            view.getText_field_precoHora().setText(elementAt.convertPrecoHora());
            
            view.setLastIndex(firstIndex);
            
        }
    }
    
}
