
// Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
// Gabriella Cruz e Silva (gabriellac2002) 202165512B
// Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.MesaController;

import com.mycompany.recantodobardo.view.ViewMesas;
import com.mycompany.recantodobardo.models.Mesa;
import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.MesaToJson;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import java.awt.event.ActionListener;

public class EditaMesa implements ActionListener {

    ViewMesas view;

    public EditaMesa(ViewMesas view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Mesa> model = (DefaultListModel<Mesa>) this.view.getLista().getModel();
        Mesa mesa = model.getElementAt(view.getLastIndex());
        mesa.setIdMesa(view.getText_field_idMesa().getText());
        mesa.setAssentos(Integer.parseInt(view.getText_field_assentos().getText()));

        ListModel<Mesa> mes = view.getLista().getModel();
        List<Mesa> mesas = new ArrayList<>();

        for (int i = 0; i < mes.getSize(); i++) {
            mesas.add(mes.getElementAt(i));
        }

        String toJSON = MesaToJson.listToJson(mesas);

        System.out.println(toJSON);

        Arquivo.escreverArquivo("data/MesaData.json", toJSON);

        view.repaint();
    }

}
