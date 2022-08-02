
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.util;

import com.mycompany.recantodobardo.models.Item;
import com.mycompany.recantodobardo.models.Mesa;
import com.mycompany.recantodobardo.models.Reserva;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JSON {

    // funções toJSON fazem a transformação da variável em um objeto para que o JSON consiga interagir com ela
    // usa-se a classe genérica Object para reduzir linhas de código
    
    public static String toJSON(Object o) {   
        Gson gson = new Gson();
        String json = gson.toJson(o);
        return json;
    }

    public static String toJSON(List<Object> o) {
        Gson gson = new Gson();
        String json = gson.toJson(o);
        return json;
    }

    // as duas funções a seguir fazem a leitura do conteúdo das classes

    public static Item toItem(String content) {
        Gson gson = new Gson();
        Item item = gson.fromJson(content, Item.class);

        return item;
    }

    public static List<Item> toItens(String content) {
        Gson gson = new Gson();
        Type itemType = new TypeToken<ArrayList<Item>>() {
        }.getType();
        List<Item> itens = gson.fromJson(content, itemType);

        return itens;
    }

    public static Mesa toMesa(String content) {
        Gson gson = new Gson();
        Mesa mesa = gson.fromJson(content, Mesa.class);

        return mesa;
    }

    public static List<Mesa> toMesas(String content) {
        Gson gson = new Gson();
        Type mesaType = new TypeToken<ArrayList<Mesa>>() {
        }.getType();
        List<Mesa> mesas = gson.fromJson(content, mesaType);

        return mesas;
    }

    public static Reserva toReserva(String content) {
        Gson gson = new Gson();
        Reserva reserva = gson.fromJson(content, Reserva.class);

        return reserva;
    }

    public static List<Reserva> toReservas(String content) {
        Gson gson = new Gson();
        Type reservaType = new TypeToken<ArrayList<Reserva>>() {
        }.getType();
        List<Reserva> reservas = gson.fromJson(content, reservaType);

        return reservas;
    }


}
