
// Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
// Gabriella Cruz e Silva (gabriellac2002) 202165512B
// Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ReservaController;

import com.mycompany.recantodobardo.view.ViewReservas;
import com.mycompany.recantodobardo.models.Reserva;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

public class AdicionaReserva implements ActionListener {

    ViewReservas view;

    public AdicionaReserva(ViewReservas view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Reserva> model = (DefaultListModel<Reserva>) view.getListReserva().getModel();

        if (view.getDisponivel()) {
            model.addElement(
                    new Reserva(
                            view.getCbCientes().getSelectedItem(),
                            view.getCbItens().getSelectedItem(),
                            view.getCbMesas().getSelectedItem(),
                            view.getText_field_data().getText(),
                            view.getText_field_hora().getText()));

            view.getListReserva().setModel(model);
            view.repaint();
        }

        else {
            JOptionPane.showMessageDialog(null, "Horário inválido!");
        }

    }

}