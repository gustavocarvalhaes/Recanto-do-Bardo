
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.view;

import com.mycompany.recantodobardo.controller.MudarTela;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuClientes extends JFrame implements Views
{
    
    private JPanel principal;
    private JButton cad_clientes;
    private JButton cad_reservas;
    
    public MenuClientes()
    {
        inicializar();
    }

    @Override
    public void inicializar() 
    {
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
        
        JPanel jpClientes = new JPanel();
        jpClientes.setBorder(BorderFactory.createTitledBorder("Menu Clientes"));
        jpClientes.setLayout(new BorderLayout());
        jpClientes.setPreferredSize(new Dimension(200, 300));
        
        JPanel espaco1 = new JPanel();
        espaco1.setSize(200,100);
        espaco1.setLayout(new GridLayout(2,1));
        JPanel espaco2 = new JPanel();
        espaco2.setSize(200,100);
        espaco2.setLayout(new GridLayout(2,1));
        
        principal.add(espaco1);
        principal.add(espaco2);
        
        JLabel label_titulo = new JLabel("Recanto do Bardo - Menu Clientes");
        espaco1.add(label_titulo);
        JLabel label_espaco = new JLabel("");
        espaco2.add(label_espaco);
        
        this.setCad_reservas(new JButton("Cadastro Reservas"));
        espaco1.add(this.cad_reservas);
        this.cad_reservas.addActionListener(new MudarTela(this));
        
        this.add(principal);
        this.setVisible(true);

    }

    public JButton getCad_clientes()
    {
        return cad_clientes;
    }

    public void setCad_clientes(JButton cad_clientes) 
    {
        this.cad_clientes = cad_clientes;
    }

    public JButton getCad_reservas() 
    {
        return cad_reservas;
    }

    public void setCad_reservas(JButton cad_reservas) 
    {
        this.cad_reservas = cad_reservas;
    }
    
    public static void main(String[] args) 
    {
        MenuClientes tela = new MenuClientes();
        tela.inicializar();
    }
    
}
