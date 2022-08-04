
// Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
// Gabriella Cruz e Silva (gabriellac2002) 202165512B
// Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ReservaController;

import com.mycompany.recantodobardo.view.ViewReservas;
import com.mycompany.recantodobardo.models.Reserva;
import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ReservaToJson;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

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

            ListModel<Reserva> res = view.getListReserva().getModel();
            List<Reserva> reservas = new ArrayList<>();

            for (int i = 0; i < res.getSize(); i++) {
                reservas.add(res.getElementAt(i));
            }

            String toJSON = ReservaToJson.listToJson(reservas);

            System.out.println(toJSON);

            Arquivo.escreverArquivo("data/ReservaData.json", toJSON);

            view.getListReserva().setModel(model);
            view.repaint();
        }

        else {
            JOptionPane.showMessageDialog(null, "Horário inválido!");
        }

    }

}