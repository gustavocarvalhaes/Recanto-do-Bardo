/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.models;
import java.util.Scanner;

/**
 *
 * @author cdcru
 */
public class Main {
    
    public static void main(String []Args){
        
        //declaração de variaveis e scanner
        String email, senha;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Email: ");
        email = ler.next();
        
        System.out.println("Senha: ");
        senha = ler.next();
        
        Usuario user = new Usuario(email,senha);
        boolean acesso = user.logar();
        if(acesso == true){
            System.out.println("Acesso permitido");
            opcoesTarefas();
        } else {
            System.out.println("Acesso negado");
        }
    }
    
    public static void opcoesTarefas(){
        Scanner ler = new Scanner(System.in);
        System.out.println("O que deseja ver?");
        System.out.println("1- Itens");
        System.out.println("2- Mesas");
        System.out.println("3- Funcionarios");
        System.out.println("4- Clientes");
        System.out.println("5 - Reservas");
        
        int opcao = ler.nextInt();
        
        switch (opcao) {

            case 1 -> {
                
            }

            case 2 -> {
            }

            case 3 -> {
            }
            
            case 4 -> {
            }
            
            case 5 -> {
            }
        }
        // bloco de código que será executado
        // bloco de código que será executado
        // bloco de código que será executado
        // bloco de código que será executado
        // bloco de código que será executado
            }
}
