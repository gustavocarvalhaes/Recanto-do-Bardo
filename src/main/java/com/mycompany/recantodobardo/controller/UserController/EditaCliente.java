
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

public class EditaCliente implements ActionListener {

    ViewClientes view;// instancia uma tela para ter acesso aos dados escritos

    public EditaCliente(ViewClientes view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Cliente> model = (DefaultListModel<Cliente>) this.view.getLista().getModel();// talvez tenha
                                                                                                      // que mudar para
                                                                                                      // ListModel
        Cliente cliente = model.getElementAt(view.getLastIndex());
        cliente.setNome(view.getText_field_nome().getText());
        cliente.setEmail(view.getText_field_email().getText());
        cliente.setSenha(view.getText_field_senha().getText());

        ListModel<Cliente> cl = view.getLista().getModel();
        List<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i < cl.getSize(); i++) {
            clientes.add(cl.getElementAt(i));
        }

        String toJSON = ClienteToJson.listToJson(clientes);

        System.out.println(toJSON);

        Arquivo.escreverArquivo("data/UserData.json", toJSON);

        view.repaint();
    }
}
