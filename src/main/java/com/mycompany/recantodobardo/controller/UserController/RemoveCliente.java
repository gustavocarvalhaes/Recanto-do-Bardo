
// Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
// Gabriella Cruz e Silva (gabriellac2002) 202165512B
// Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.UserController;

import com.mycompany.recantodobardo.view.ViewClientes;
import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ClienteToJson;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import java.awt.event.ActionListener;

public class RemoveCliente implements ActionListener {

    ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public RemoveCliente(ViewClientes view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) { // esse é pra apagar

        int selectedIndex = view.getLista().getSelectedIndex();
        if (selectedIndex != -1) {
            DefaultListModel<Cliente> model = (DefaultListModel<Cliente>) view.getLista().getModel();
            model.removeElementAt(selectedIndex);

            ListModel<Cliente> cl = view.getLista().getModel();
            List<Cliente> clientes = new ArrayList<>();

            for (int i = 0; i < cl.getSize(); i++) {
                clientes.add(cl.getElementAt(i));
            }

            String toJSON = ClienteToJson.listToJson(clientes);

            System.out.println(toJSON);

            Arquivo.escreverArquivo("data/UserData.json", toJSON);

            view.getLista().setModel(model);
            view.repaint();
        }
    }
}
