
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.UserController;

import com.mycompany.recantodobardo.view.ViewClientes;
import com.mycompany.recantodobardo.models.Cliente;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExibirClientes implements ListSelectionListener {
    
    ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public ExibirClientes (ViewClientes view) {
        this.view = view;
    }
    
     @Override
    public void valueChanged(ListSelectionEvent e) {
        int firstIndex = view.getLista().getSelectedIndex();

        if (firstIndex != -1) {

            
            Cliente elementAt = view.getLista().getModel().getElementAt(firstIndex);
            view.getText_field_nome().setText(elementAt.getNome());
            view.getText_field_email().setText(elementAt.getEmail());
            view.getText_field_senha().setText(elementAt.getSenha());
            
            view.setLastIndex(firstIndex);
        }
    }
}
