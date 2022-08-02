
  // Ana Beatriz Lana Maciel Moreira Armond (SilverBlitzy) 202165501B
  // Gabriella Cruz e Silva (gabriellac2002) 202165512B
  // Gustavo Carvalhaes da Fonseca Ferreira (gustavirus) 202065522B

package com.mycompany.recantodobardo.util;

import com.mycompany.recantodobardo.models.Cliente;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class ClienteToJson {

    // escreve um cliente no json
    public static String clienteToJson(Cliente cliente) {
        Gson gson = new Gson();
        String json = gson.toJson(cliente);
        return json;
    }

    // escreve o conteudo de uma lista de clientes no json
    public static String listToJson(List<Cliente> cliente) {
        Gson gson = new Gson();
        String json = gson.toJson(cliente);
        return json;
    }

    public static Cliente toCliente(String conteudo) {
        Gson gson = new Gson();
        Cliente cliente = gson.fromJson(conteudo, Cliente.class);

        return cliente;
    }

    // retorna uma lista contendo todos os clientes do json
    public static List<Cliente> listaClientes(String conteudo) {
        Gson gson = new Gson();
        Type clientType = new TypeToken<ArrayList<Cliente>>() {
        }.getType();
        List<Cliente> listaClientes = gson.fromJson(conteudo, clientType);
        return listaClientes;
    }

}