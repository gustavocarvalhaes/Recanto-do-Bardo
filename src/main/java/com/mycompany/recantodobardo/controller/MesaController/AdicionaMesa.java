
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.MesaController;
import com.mycompany.recantodobardo.view.ViewMesas;
import com.mycompany.recantodobardo.models.Mesa;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;

public class AdicionaMesa implements ActionListener 
{

    ViewMesas view;

    public AdicionaMesa(ViewMesas view) 
    {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) 
    { 
        DefaultListModel<Mesa> model = (DefaultListModel<Mesa>) view.getLista().getModel();

        int assentos = Integer.parseInt(view.getText_field_assentos().getText());

        model.addElement(
                new Mesa(
                        view.getText_field_idMesa().getText(),
                        assentos,
                        true));

        view.getLista().setModel(model);
        view.repaint();

    }
    
}

