
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ReservaController;

import com.mycompany.recantodobardo.view.ViewReservas;
import com.mycompany.recantodobardo.models.Reserva;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;

public class RemoveReserva implements ActionListener 
{
    
    ViewReservas view;

    public RemoveReserva(ViewReservas view) 
    {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    { 

        int selectedIndex = view.getListReserva().getSelectedIndex();

        if (selectedIndex != -1) 
        {
            DefaultListModel<Reserva> model = (DefaultListModel<Reserva>) view.getListReserva().getModel();
            model.removeElementAt(selectedIndex);
            view.getListReserva().setModel(model);
            view.repaint();
        }

    }

}
