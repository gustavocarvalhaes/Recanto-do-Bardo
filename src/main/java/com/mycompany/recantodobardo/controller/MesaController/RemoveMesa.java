
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

public class RemoveMesa implements ActionListener {

    ViewMesas view;

    public RemoveMesa(ViewMesas view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int selectedIndex = view.getLista().getSelectedIndex();

        if (selectedIndex != -1) {
            DefaultListModel<Mesa> model = (DefaultListModel<Mesa>) view.getLista().getModel();
            model.removeElementAt(selectedIndex);

            ListModel<Mesa> mes = view.getLista().getModel();
            List<Mesa> mesas = new ArrayList<>();

            for (int i = 0; i < mes.getSize(); i++) {
                mesas.add(mes.getElementAt(i));
            }

            String toJSON = MesaToJson.listToJson(mesas);

            System.out.println(toJSON);

            Arquivo.escreverArquivo("data/MesaData.json", toJSON);

            view.getLista().setModel(model);
            view.repaint();
        }

    }

}