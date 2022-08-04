package com.mycompany.recantodobardo.controller.ReservaController;


public class MesaOcupada extends Exception {

    public MesaOcupada() {
        super("Esta mesa já está ocupada nesse horário!");
    }
    
}
