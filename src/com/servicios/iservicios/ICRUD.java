
package com.servicios.iservicios;

import com.utileria.Computadora;
import java.util.LinkedList;

public interface ICRUD {
    
    boolean agregarDispositivo(Computadora compu);
    
    LinkedList buscarDispositivo();
    
}
