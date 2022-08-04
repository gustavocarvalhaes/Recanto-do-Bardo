
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.view;

import com.mycompany.recantodobardo.controller.ItemController.AdicionaItem;
import com.mycompany.recantodobardo.controller.ItemController.RemoveItem;
import com.mycompany.recantodobardo.controller.ItemController.EditaItem;
import com.mycompany.recantodobardo.controller.ItemController.ExibirItens;
import com.mycompany.recantodobardo.controller.ItemController.ItemController;
import com.mycompany.recantodobardo.controller.VTAdmItem;
import com.mycompany.recantodobardo.models.Item;

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

/**
 *
 * @author cdcru
 */
public class ViewItens extends JFrame implements Views
{
    
    private JTextField text_field_nome;
    private JTextField text_field_precoHora;
    private JPanel principal;
    private JList<Item> lista;
    private int lastIndex;

    public JList<Item> getLista() {
        return lista;
    }

    public void setLista(JList<Item> lista) {
        this.lista = lista;
    }

    public void setLastIndex(int lastIndex){
        this.lastIndex = lastIndex;
    }
    
    public int getLastIndex() {
        return lastIndex;
    }
    public JTextField getText_field_nome() {
        return text_field_nome;
    }

    public void setText_field_nome(JTextField text_field_nome) {
        this.text_field_nome = text_field_nome;
    }

    public JTextField getText_field_precoHora() {
        return text_field_precoHora;
    }

    public void setText_field_precoHora(JTextField text_field_precoHora) {
        this.text_field_precoHora = text_field_precoHora;
    }
    
    public ViewItens(){
        this.lastIndex = 0;
    }
    
    
    @Override
    public void inicializar(){
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        this.addWindowListener(new ItemController(this));
        
        JPanel jpClientes = new JPanel();
        jpClientes.setBorder(BorderFactory.createTitledBorder("Itens"));
        jpClientes.setLayout(new BorderLayout());
        jpClientes.setPreferredSize(new Dimension(200, 300));

        DefaultListModel<Item> model = new DefaultListModel<>();


        lista = new JList<>(model);
        lista.setVisible(true);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new ExibirItens(this));
        jpClientes.add(new JScrollPane(lista), BorderLayout.CENTER);


        principal.add(jpClientes, BorderLayout.WEST);
        
        int size = 20;
        JPanel jpFormulario = new JPanel();
        jpFormulario.setBorder(BorderFactory.createTitledBorder("Formulário"));

        jpFormulario.add(new JLabel("Nome:"));
        text_field_nome = new JTextField(size);
        jpFormulario.add(text_field_nome);

        jpFormulario.add(new JLabel("Preço/Hora:"));
        text_field_precoHora = new JTextField(size);
        jpFormulario.add(text_field_precoHora);

                

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new AdicionaItem(this));
        jpFormulario.add(btnAdicionar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new RemoveItem(this));
        jpFormulario.add(btnRemover);
        
        
        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(new EditaItem(this));
        jpFormulario.add(btnEditar);
        
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new VTAdmItem(this));
        jpFormulario.add(btnVoltar);
        
        principal.add(jpFormulario, BorderLayout.CENTER);
        
        this.add(principal);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        ViewItens tela = new ViewItens();
        tela.inicializar();
    }
}