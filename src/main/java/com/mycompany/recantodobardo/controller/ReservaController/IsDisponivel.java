package com.mycompany.recantodobardo.controller.ReservaController;

import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.view.ViewReservas;
import com.mycompany.recantodobardo.models.Reserva;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.FileNotFoundException;
import java.util.List;

import javax.swing.JOptionPane;

import com.mycompany.recantodobardo.util.ReservaToJson;

public class IsDisponivel implements ActionListener {

    ViewReservas view = new ViewReservas();

    public IsDisponivel(ViewReservas view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try

        {
            String lerArquivo = Arquivo.lerArquivo("data/ReservaData.json");
            List<Reserva> reservas = ReservaToJson.listaReservas(lerArquivo);

            for (Reserva reserva : reservas) {
                if (reserva.getData() == view.getText_field_data().getText()
                        && reserva.getMesa() == view.getCbMesas().getSelectedItem()
                        && reserva.getHora() == view.getText_field_hora().getText()) {
                    view.setDisponivel(false);
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
