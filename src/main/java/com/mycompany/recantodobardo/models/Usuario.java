/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;

 //   Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  //  Gabriella Cruz e Silva (gabriellac2002) 202165512B
  //  Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B
   // Pedro Souza Pinheiro da Silva Araujo (pedro123063) 202165560C 
public class Usuario {
    
    private String email ;
    private String senha;

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean logar(){
        if(email == "funcionario@gmail.com"  && senha == "1234" 
                || email == "adm@gmail.com"  && senha == "adm123"){
            return true;
        } else {
           return false; 
        }
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
