
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.view;

import com.mycompany.recantodobardo.controller.MesaController.AdicionaMesa;
import com.mycompany.recantodobardo.controller.MesaController.RemoveMesa;
import com.mycompany.recantodobardo.controller.MesaController.EditaMesa;
import com.mycompany.recantodobardo.controller.MesaController.ExibirMesas;
import com.mycompany.recantodobardo.controller.MesaController.MesaController;
import com.mycompany.recantodobardo.controller.VTAdmItem;
import com.mycompany.recantodobardo.controller.VTAdmMesa;
import com.mycompany.recantodobardo.models.Mesa;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class ViewMesas extends JFrame implements Views
{
    
    private JTextField text_field_idMesa;
    private JTextField text_field_assentos;
    private JPanel principal;
    private JList<Mesa> lista;
    private int lastIndex;

    public JList<Mesa> getLista() {
      return lista;
  }

  public void setLista(JList<Mesa> lista) {
      this.lista = lista;
  }

  public void setLastIndex(int lastIndex){
      this.lastIndex = lastIndex;
  }
  
  public int getLastIndex() {
      return lastIndex;
  }
  public JTextField getText_field_idMesa() {
      return text_field_idMesa;
  }

  public void setText_field_idMesa(JTextField text_field_idMesa) {
      this.text_field_idMesa = text_field_idMesa;
  }

  public JTextField getText_field_assentos() {
      return text_field_assentos;
  }

  public void setText_field_assentos(JTextField text_field_assentos) {
      this.text_field_assentos = text_field_assentos;
  }
    
    public ViewMesas()
    {
        this.lastIndex = 0;
    }
    
    
    @Override
    public void inicializar() 
    {
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        this.addWindowListener(new MesaController(this));
        
        
        JPanel jpClientes = new JPanel();
        jpClientes.setBorder(BorderFactory.createTitledBorder("Mesas"));
        jpClientes.setLayout(new BorderLayout());
        jpClientes.setPreferredSize(new Dimension(200, 300));

        DefaultListModel<Mesa> model = new DefaultListModel<>();


        lista = new JList<>(model);
        lista.setVisible(true);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new ExibirMesas(this));
        jpClientes.add(new JScrollPane(lista), BorderLayout.CENTER);


        principal.add(jpClientes, BorderLayout.WEST);
        
        int size = 20;
        JPanel jpFormulario = new JPanel();
        jpFormulario.setBorder(BorderFactory.createTitledBorder("Formulário"));

        jpFormulario.add(new JLabel("Identificador:"));
        text_field_idMesa = new JTextField(size);
        jpFormulario.add(text_field_idMesa);

        jpFormulario.add(new JLabel("Assentos:"));
        text_field_assentos = new JTextField(size);
        jpFormulario.add(text_field_assentos);


                

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new AdicionaMesa(this));
        jpFormulario.add(btnAdicionar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new RemoveMesa(this));
        jpFormulario.add(btnRemover);
        
        
        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(new EditaMesa(this));
        jpFormulario.add(btnEditar);
        
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new VTAdmMesa(this));
        jpFormulario.add(btnVoltar);

        principal.add(jpFormulario, BorderLayout.CENTER);
        
        this.add(principal);
        this.setVisible(true);
    }
    
    public static void main(String[] args) 
    {
      ViewMesas tela = new ViewMesas();
      tela.inicializar();
    }

}
    
