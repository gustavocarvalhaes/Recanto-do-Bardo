
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.controller.UserController;

import java.awt.event.ActionListener;
import com.mycompany.recantodobardo.models.Administrador;
import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Usuario;
import com.mycompany.recantodobardo.util.ClienteToJson;
import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.view.MenuAdm;
import com.mycompany.recantodobardo.view.MenuClientes;
import com.mycompany.recantodobardo.view.TelaLogin;
import com.mycompany.recantodobardo.view.ViewClientes;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gcarv
 */



public class LoginController implements ActionListener {

    // implementa o login dos dois tipos de usuários

    TelaLogin tela;
    

    public LoginController(TelaLogin tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String email = tela.getText_field_email().getText();
        String senha = tela.getText_field_senha().getText();
       
        TemLogin(email, senha);
    }
    
    public void TemLogin(String email, String senha){
        
        try {
            String lerArquivo = Arquivo.lerArquivo("data/UserData.json");
            List<Cliente> clientes = ClienteToJson.listaClientes(lerArquivo);
     
            for(Cliente cliente : clientes) {
                if (cliente.getEmail().equals(email)) {
                    if(cliente.getSenha().equals(senha)){
                        if(!cliente.isAdm()){
                            new MenuClientes();
                            this.tela.dispose();
                        }
                        if(cliente.isAdm()){
                            new MenuAdm();
                            this.tela.dispose();
                        }
                    }
                    else {
                    JOptionPane.showMessageDialog(null, "Dados incorretos!");
                    }
                } 
            }   
        } catch (FileNotFoundException ex) {
        }
    }
    
}