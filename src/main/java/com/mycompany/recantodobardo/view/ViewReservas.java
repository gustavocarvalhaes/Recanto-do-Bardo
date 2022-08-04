
// Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
// Gabriella Cruz e Silva (gabriellac2002) 202165512B
// Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.view;

import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Item;
import com.mycompany.recantodobardo.models.Mesa;
import com.mycompany.recantodobardo.models.Reserva;
import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ClienteToJson;
import com.mycompany.recantodobardo.util.ItemToJson;
import com.mycompany.recantodobardo.util.MesaToJson;
import com.mycompany.recantodobardo.controller.ReservaController.ReservaController;
import com.mycompany.recantodobardo.controller.ReservaController.AdicionaReserva;
import com.mycompany.recantodobardo.controller.ReservaController.EditaReserva;
import com.mycompany.recantodobardo.controller.ReservaController.ExibirReservas;
import com.mycompany.recantodobardo.controller.ReservaController.IsDisponivel;
import com.mycompany.recantodobardo.controller.ReservaController.RemoveReserva;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import javax.swing.DefaultComboBoxModel;

public class ViewReservas extends JFrame implements Views {
  private JComboBox<Cliente> cbCientes;
  private JComboBox<Item> cbItens;
  private JComboBox<Mesa> cbMesas;
  private List<Cliente> listClientes;
  private List<Item> listItens;
  private List<Mesa> listMesas;
  private JList<Reserva> listReserva;
  private JTextField text_field_data;
  private JTextField text_field_hora;
  private JPanel principal;
  private int lastIndex;
  private boolean disponivel;
  private JCheckBox confirmar;

  public boolean getDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean disp) {
    this.disponivel = disp;
  }

  public List<Item> getListItem() {
    return listItens;
  }

  public void setListItem(List<Item> listItens) {
    this.listItens = listItens;
  }

  public List<Mesa> getListMesa() {
    return listMesas;
  }

  public void setListMesa(List<Mesa> listMesas) {
    this.listMesas = listMesas;
  }

  public List<Cliente> getListCliente() {
    return listClientes;
  }

  public void setListCliente(List<Cliente> listClientes) {
    this.listClientes = listClientes;
  }

  public JList<Reserva> getListReserva() {
    return listReserva;
  }

  public void setLista(JList<Reserva> listReserva) {
    this.listReserva = listReserva;
  }

  public JTextField getText_field_data() {
    return text_field_data;
  }

  public void setText_field_data(JTextField text_field_data) {
    this.text_field_data = text_field_data;
  }

  public JTextField getText_field_hora() {
    return text_field_hora;
  }

  public void setText_field_hora(JTextField text_field_hora) {
    this.text_field_hora = text_field_hora;
  }

  public JComboBox<Cliente> getCbCientes() {
    return cbCientes;
  }

  public void setCbCientes(JComboBox<Cliente> cbCientes) {
    this.cbCientes = cbCientes;
  }

  public JComboBox<Item> getCbItens() {
    return cbItens;
  }

  public void setCbItens(JComboBox<Item> cbItens) {
    this.cbItens = cbItens;
  }

  public JComboBox<Mesa> getCbMesas() {
    return cbMesas;
  }

  public void setCbMesas(JComboBox<Mesa> cbMesas) {
    this.cbMesas = cbMesas;
  }

  public void setLastIndex(int lastIndex) {
    this.lastIndex = lastIndex;
  }

  public int getLastIndex() {
    return lastIndex;
  }

  public ViewReservas() {
    this.lastIndex = 0;

//    inicializar();
  }

  @Override
  public void inicializar() {

    try {
      String lerArquivo = Arquivo.lerArquivo("data/UserData.json");
      List<Cliente> clientes = ClienteToJson.listaClientes(lerArquivo);
      setListCliente(clientes);
    } catch (FileNotFoundException ex) {
    }

    try {
      String lerArquivo = Arquivo.lerArquivo("data/ItemData.json");
      List<Item> itens = ItemToJson.listaItens(lerArquivo);
      setListItem(itens);
    } catch (FileNotFoundException ex) {
    }

    try {
      String lerArquivo = Arquivo.lerArquivo("data/MesaData.json");
      List<Mesa> mesas = MesaToJson.listaMesas(lerArquivo);
      setListMesa(mesas);
    } catch (FileNotFoundException ex) {
    }

    this.setSize(500, 300);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    this.principal = new JPanel();
    this.principal.setLayout(new BorderLayout());
    this.addWindowListener(new ReservaController(this));

    JPanel jpClientes = new JPanel();
    jpClientes.setBorder(BorderFactory.createTitledBorder("Reservas"));
    jpClientes.setLayout(new BorderLayout());
    jpClientes.setPreferredSize(new Dimension(200, 300));

    DefaultListModel<Reserva> model = new DefaultListModel<>();

    listReserva = new JList<>(model);
    listReserva.setVisible(true);
    listReserva.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    listReserva.addListSelectionListener(new ExibirReservas(this));
    jpClientes.add(new JScrollPane(listReserva), BorderLayout.CENTER);

    principal.add(jpClientes, BorderLayout.WEST);

    int size = 11;
    int size2 = 15;
    JPanel jpFormulario = new JPanel();
    jpFormulario.setBorder(BorderFactory.createTitledBorder("Formulário"));

    jpFormulario.add(new JLabel("Cliente:"));

    DefaultComboBoxModel<Cliente> modelCliente = new DefaultComboBoxModel<>();
    modelCliente.addAll(listClientes);
    this.cbCientes = new JComboBox<>(modelCliente);
    jpFormulario.add(this.cbCientes);

    jpFormulario.add(new JLabel("Item:"));

    DefaultComboBoxModel<Item> modelItem = new DefaultComboBoxModel<>();
    modelItem.addAll(listItens);
    this.cbItens = new JComboBox<>(modelItem);
    jpFormulario.add(this.cbItens);

    jpFormulario.add(new JLabel("Mesa:"));

    DefaultComboBoxModel<Mesa> modelMesa = new DefaultComboBoxModel<>();
    modelMesa.addAll(listMesas);
    this.cbMesas = new JComboBox<>(modelMesa);
    jpFormulario.add(this.cbMesas);

    jpFormulario.add(new JLabel("Data:"));
    text_field_data = new JTextField(size);
    jpFormulario.add(text_field_data);

    jpFormulario.add(new JLabel("Hora:"));
    text_field_hora = new JTextField(size2);
    jpFormulario.add(text_field_hora);

    confirmar = new JCheckBox("Confirmar");
    jpFormulario.add(confirmar);
    confirmar.addActionListener(new IsDisponivel(this));

    JButton btnAdicionar = new JButton("Adicionar");
    btnAdicionar.addActionListener(new AdicionaReserva(this));
    jpFormulario.add(btnAdicionar);

    JButton btnRemover = new JButton("Remover");
    btnRemover.addActionListener(new RemoveReserva(this));
    jpFormulario.add(btnRemover);

    JButton btnEditar = new JButton("Editar");
    btnEditar.addActionListener(new EditaReserva(this));
    jpFormulario.add(btnEditar);

    principal.add(jpFormulario, BorderLayout.CENTER);

    this.add(principal);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    ViewReservas tela = new ViewReservas();
    tela.inicializar();
  }
}