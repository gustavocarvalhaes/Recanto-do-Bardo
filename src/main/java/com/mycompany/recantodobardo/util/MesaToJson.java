
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.util;

import com.mycompany.recantodobardo.models.Mesa;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class MesaToJson {
    
     // escreve uma mesa no json
     public static String mesaToJson(Mesa mesa) {
        Gson gson = new Gson();
        String json = gson.toJson(mesa);
        return json;
    }

    // escreve o conteúdo de uma lista de mesas no json
    public static String listToJson(List<Mesa> mesas) {
        Gson gson = new Gson();
        String json = gson.toJson(mesas);
        return json;
    }

    public static Mesa toMesa(String conteudo) {
        Gson gson = new Gson();
        Mesa mesa = gson.fromJson(conteudo, Mesa.class);

        return mesa;
    }

    // retorna uma lista contendo todos as mesas do json
    public static List<Mesa> listaMesas(String conteudo) {
        Gson gson = new Gson();
        Type mesaType = new TypeToken<ArrayList<Mesa>>() {
        }.getType();
        List<Mesa> listaMesas = gson.fromJson(conteudo, mesaType);
        return listaMesas;
    }

}
