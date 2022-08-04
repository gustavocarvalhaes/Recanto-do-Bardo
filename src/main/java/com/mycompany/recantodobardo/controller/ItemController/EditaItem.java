
// Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
// Gabriella Cruz e Silva (gabriellac2002) 202165512B
// Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.ItemController;

import com.mycompany.recantodobardo.view.ViewItens;
import com.mycompany.recantodobardo.models.Item;
import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ItemToJson;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import java.awt.event.ActionListener;

public class EditaItem implements ActionListener {

    ViewItens view;

    public EditaItem(ViewItens view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Item> model = (DefaultListModel<Item>) this.view.getLista().getModel();
        Item item = model.getElementAt(view.getLastIndex());
        item.setNome(view.getText_field_nome().getText());
        item.setPrecoHora(Float.parseFloat(view.getText_field_precoHora().getText()));

        ListModel<Item> it = view.getLista().getModel();
        List<Item> itens = new ArrayList<>();

        for (int i = 0; i < it.getSize(); i++) {
            itens.add(it.getElementAt(i));
        }

        String toJSON = ItemToJson.listToJson(itens);

        System.out.println(toJSON);

        Arquivo.escreverArquivo("data/ItemData.json", toJSON);

        view.repaint();
    }

}
