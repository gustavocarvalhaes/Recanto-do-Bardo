package com.mycompany.recantodobardo.controller.ReservaController;

import java.io.FileNotFoundException;
import java.util.List;

import javax.swing.JOptionPane;

import com.mycompany.recantodobardo.models.Reserva;
import com.mycompany.recantodobardo.util.Arquivo;
import com.mycompany.recantodobardo.util.ReservaToJson;

public class MesaDisponibilidade {

      public static void mesaDisponibilidade(Reserva x) throws MesaOcupada
      {

        try 
          {
              String lerArquivo = Arquivo.lerArquivo("data/ReservaData.json");
              List<Reserva> reservas = ReservaToJson.listaReservas(lerArquivo);
 
              int contador = 0;

                for (Reserva reserva : reservas)
                {
                    if (reserva.getData() == x.getData() && reserva.getMesa() == x.getMesa() && reserva.getHora() == x.getHora())
                    {
                        contador++;
                    }
                }

                if (contador == 0)
                {
                    
                }

          } 
          catch (MesaOcupada ex) 
          {
            JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          
        
      }
      
}
