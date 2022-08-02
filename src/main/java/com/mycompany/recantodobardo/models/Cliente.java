
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

  package com.mycompany.recantodobardo.models;

  public class Cliente extends Usuario {
  
      public Cliente(String nome, String email, String senha, boolean adm) {
          super(email, senha, nome, adm);
      }
  
      @Override
      public String toString() {
          return this.getNome();
      }
  }