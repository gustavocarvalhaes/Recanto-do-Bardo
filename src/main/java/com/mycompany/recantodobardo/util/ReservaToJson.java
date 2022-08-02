
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.util;

import com.mycompany.recantodobardo.models.Reserva;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class ReservaToJson {

     // escreve um item no json
     public static String reservaToJson(Reserva reserva) {
        Gson gson = new Gson();
        String json = gson.toJson(reserva);
        return json;
    }

    // escreve o conteúdo de uma lista de itens no json
    public static String listToJson(List<Reserva> reservas) {
        Gson gson = new Gson();
        String json = gson.toJson(reservas);
        return json;
    }

    public static Reserva toReserva(String conteudo) {
        Gson gson = new Gson();
        Reserva reserva = gson.fromJson(conteudo, Reserva.class);

        return reserva;
    }

    // retorna uma lista contendo todos os itens do json
    public static List<Reserva> listaReservas(String conteudo) {
        Gson gson = new Gson();
        Type reservaType = new TypeToken<ArrayList<Reserva>>() {
        }.getType();
        List<Reserva> listaReservas = gson.fromJson(conteudo, reservaType);
        return listaReservas;
    }
    
}
