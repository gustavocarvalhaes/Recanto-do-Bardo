
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

  package com.mycompany.recantodobardo.view;

  import com.mycompany.recantodobardo.models.Cliente;
  import com.mycompany.recantodobardo.models.Item;
  import com.mycompany.recantodobardo.models.Mesa;
  import com.mycompany.recantodobardo.models.Reserva;
  import java.awt.BorderLayout;
  import java.awt.Dimension;
  import java.util.List;
  import java.util.ArrayList;
  import javax.swing.BorderFactory;
  import javax.swing.DefaultListModel;
  import javax.swing.JButton;
  import javax.swing.JComboBox;
  import javax.swing.JFrame;
  import javax.swing.JLabel;
  import javax.swing.JList;
  import javax.swing.JPanel;
  import javax.swing.JScrollPane;
  import javax.swing.JTextField;
  import javax.swing.ListSelectionModel;
  import java.util.ArrayList;
  import java.util.Arrays;
  import javax.swing.DefaultComboBoxModel;
  
  /**
   *
   * @author cdcru
   */
  public class ViewReservas extends JFrame implements Views{
      private JComboBox cbCientes;
      private JComboBox cbItens ;
      private JComboBox cbMesas;
      private List<Cliente> listClientes;
      private List<Item> listItens;
      private List<Mesa> listMesa;
      private JList<Reserva> lista;
      private JTextField text_field_data;
      private JTextField text_field_hora;
      private JPanel principal;
      
      public ViewReservas(){
          inicializar();
      }
      
      
      @Override
      public void inicializar(){
        this.setSize(500, 300);
          this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  
          this.principal = new JPanel();
          this.principal.setLayout(new BorderLayout());
          
          JPanel jpClientes = new JPanel();
          jpClientes.setBorder(BorderFactory.createTitledBorder("Reservas"));
          jpClientes.setLayout(new BorderLayout());
          jpClientes.setPreferredSize(new Dimension(200, 300));
  
          DefaultListModel<Reserva> model = new DefaultListModel<>();
  
  
          lista = new JList<>(model);
          lista.setVisible(true);
          lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          //lista.addListSelectionListener(new TratarLista(this));
          jpClientes.add(new JScrollPane(lista), BorderLayout.CENTER);
  
  
          principal.add(jpClientes, BorderLayout.WEST);
          
          int size = 11;
          int size2 = 15;
          JPanel jpFormulario = new JPanel();
          jpFormulario.setBorder(BorderFactory.createTitledBorder("Formulário"));
  
  
          jpFormulario.add(new JLabel("Cliente:"));
          
          
          //remover
          listClientes = new ArrayList<>();
          listClientes.add(new Cliente(1, "Gabi", "5551516", "22511"));
          listClientes.add(new Cliente(1, "Ans", "5551516", "22511"));
          
          
          DefaultComboBoxModel<Cliente> modelCliente = new DefaultComboBoxModel<>();
          modelCliente.addAll(listClientes);
          this.cbCientes = new JComboBox(modelCliente);
          jpFormulario.add(this.cbCientes);
          
          jpFormulario.add(new JLabel("Item:"));
          
          //remover
          listItens = new ArrayList<>();
          listItens.add(new Item(2,"Uno", "baralho", 5, 15, true));
          listItens.add(new Item(3,"Jogo da vida", "tabuleiro", 5, 15, true));
          
          DefaultComboBoxModel<Item> modelItem = new DefaultComboBoxModel<>();
          modelItem.addAll(listItens);
          this.cbItens = new JComboBox(modelItem);
          jpFormulario.add(this.cbItens);
          
          jpFormulario.add(new JLabel("Mesa:"));
          
          //remover
          listMesa = new ArrayList<>();
          listMesa.add(new Mesa("5", 5, true));
          listMesa.add(new Mesa("6", 7, true));
          
          DefaultComboBoxModel<Mesa> modelMesa = new DefaultComboBoxModel<>();
          modelMesa.addAll(listMesa);
          this.cbMesas = new JComboBox(modelMesa);
          jpFormulario.add(this.cbMesas);
          
          
          jpFormulario.add(new JLabel("Data:"));
          text_field_data = new JTextField(size);
          jpFormulario.add(text_field_data);
          
          jpFormulario.add(new JLabel("Hora:"));
          text_field_hora = new JTextField(size2);
          jpFormulario.add(text_field_hora);
  
          JButton btnAdicionar = new JButton("Adicionar");
          //btnAdicionar.addActionListener(new SalvarContato(this));
          jpFormulario.add(btnAdicionar);
  
          JButton btnRemover = new JButton("Remover");
         // btnRemover.addActionListener(new RemoverContato(this));
          jpFormulario.add(btnRemover);
          
          
          JButton btnEditar = new JButton("Editar");
         // btnEditar.addActionListener(new EditarContato(this));
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