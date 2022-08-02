
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.util;

import com.mycompany.recantodobardo.models.Item;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class ItemToJson {

     // escreve um item no json
     public static String itemToJson(Item item) {
        Gson gson = new Gson();
        String json = gson.toJson(item);
        return json;
    }

    // escreve o conteúdo de uma lista de itens no json
    public static String listToJson(List<Item> itens) {
        Gson gson = new Gson();
        String json = gson.toJson(itens);
        return json;
    }

    public static Item toItem(String conteudo) {
        Gson gson = new Gson();
        Item item = gson.fromJson(conteudo, Item.class);

        return item;
    }

    // retorna uma lista contendo todos os itens do json
    public static List<Item> listaItens(String conteudo) {
        Gson gson = new Gson();
        Type itemType = new TypeToken<ArrayList<Item>>() {
        }.getType();
        List<Item> listaItens = gson.fromJson(conteudo, itemType);
        return listaItens;
    }
    
}
