
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ReservaController;

import com.mycompany.recantodobardo.view.ViewReservas;
import com.mycompany.recantodobardo.models.Reserva;
import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Item;
import com.mycompany.recantodobardo.models.Mesa;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;

public class EditaReserva implements ActionListener
{

    ViewReservas view;

    public EditaReserva(ViewReservas view) 
    {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        DefaultListModel<Reserva> model = (DefaultListModel<Reserva>) this.view.getLista().getModel();
        Reserva reserva = model.getElementAt(view.getLastIndex());
        reserva.setCliente((Cliente) view.getCbCientes().getSelectedItem());
        reserva.setItem((Item) view.getCbItens().getSelectedItem());
        reserva.setMesa((Mesa) view.getCbMesas().getSelectedItem());
        reserva.setData(view.getText_field_data().getText());
        reserva.setHora(view.getText_field_hora().getText());

        view.repaint();
    }
    
}
