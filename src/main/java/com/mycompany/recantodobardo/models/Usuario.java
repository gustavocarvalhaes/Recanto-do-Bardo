
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

  package com.mycompany.recantodobardo.models;

  public class Usuario {
  
      // criamos a classe Usuario pois as classes Administrador e Cliente irão herdar a classe Usuario

      private String email;
      private String senha;
      private String nome;
      private boolean adm;
  
      public Usuario(String email, String senha, String nome, boolean adm) {
  
          this.nome = nome;
          this.email = email;
          this.senha = senha;
          this.adm = adm;
      }
  
      public String getNome() {
          return nome;
      }
  
      public void setNome(String nome) {
          this.nome = nome;
      }
  
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
  
      public boolean isAdm() {
          return adm;
      }
  
      public void setAdm(boolean adm) {
          this.adm = adm;
      }
      
      public boolean logar(){
          if(email == "funcionario@gmail.com"  && senha == "1234" 
                  || email == "adm@gmail.com"  && senha == "adm123"){
              return true;
          } else {
             return false; 
          }
      }
  }