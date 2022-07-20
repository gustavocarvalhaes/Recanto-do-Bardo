/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recantodobardo.controller;

import com.mycompany.recantodobardo.models.Cliente;
import com.mycompany.recantodobardo.models.Usuario;

import java.text.ParseException;

/**
 *
 * @author gcarv
 */
public class ClienteController {

    public static Usuario usuarioLog;

    public static Usuario getUsuarioLog() {
        return usuarioLog;
    }

    public boolean cadastraCliente(String nome, String celular, String cpf) throws ParseException {

        Usuario admLog = ClienteController.getUsuarioLog();

        if (admLog != null && admLog.isAdm() && nome != null && nome.length() > 0 && validaCpf(cpf)
                && validaCelular(celular)) {
            Cliente cliente = new Cliente(nome, celular, cpf);
            cliente.cadastraCliente(cliente);
            return true;
        }
        return false;
    }

    // essas validações só serão necessárias caso não haja nenhuma máscara no front
    // da aplicação
    public boolean validaCpf(String cpf) {
        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                if (!(i == 3 || i == 7 || i == 11)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validaCelular(String celular) {
        for (int i = 0; i < celular.length(); i++) {
            if (!Character.isDigit(celular.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
