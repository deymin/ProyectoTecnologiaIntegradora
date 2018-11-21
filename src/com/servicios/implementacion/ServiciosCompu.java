
package com.servicios.implementacion;
import com.servicios.iservicios.ICRUD;
import com.utileria.Computadora;
import java.util.*;

public class ServiciosCompu implements ICRUD{
    LinkedList<Computadora> listaDeCompus = new LinkedList();

    @Override
    public boolean agregarDispositivo(Computadora compu) {
        return listaDeCompus.add(compu);
    }

    @Override
    public LinkedList buscarDispositivo() {
        return listaDeCompus;
    }

    /*@Override
    public void actualizarDispositivo() {
        System.out.println("Se selecciono la opcion para actualizar dispositivo");
    }

    @Override
    public void eliminarDispositivo() {
        System.out.println("Se selecciono la opcion para eliminar dispositivo");
    }*/
    
}
