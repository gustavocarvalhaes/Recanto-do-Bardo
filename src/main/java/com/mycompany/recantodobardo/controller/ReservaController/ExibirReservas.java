
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ReservaController;

import com.mycompany.recantodobardo.view.ViewReservas;
import com.mycompany.recantodobardo.models.Reserva;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ExibirReservas implements ListSelectionListener 
{

    ViewReservas view;

    public ExibirReservas(ViewReservas view) 
    {
        this.view = view;
    }
    
     @Override
    public void valueChanged(ListSelectionEvent e) {
        int firstIndex = view.getListReserva().getSelectedIndex();

        if (firstIndex != -1) 
        {
            
            Reserva elementAt = view.getListReserva().getModel().getElementAt(firstIndex);
            view.getCbCientes().getSelectedItem().toString();
            view.getCbItens().getSelectedItem().toString();
            view.getCbMesas().getSelectedItem().toString();
            view.getText_field_data().setText(elementAt.getData());
            view.getText_field_hora().setText(elementAt.getHora());
            
            view.setLastIndex(firstIndex);
            
        }
    }
    
}
