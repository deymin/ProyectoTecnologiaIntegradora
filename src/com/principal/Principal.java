
package com.principal;

import com.servicios.implementacion.ServiciosCompu;
import com.utileria.Computadora;
import java.util.*;
import java.util.Scanner;

public class Principal {
    private static Scanner scanInt = new Scanner(System.in);
    private static Scanner scanLine = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu(){
        boolean bandera = true;
        ServiciosCompu servicios = new ServiciosCompu();
        System.out.println("---------- Bienvenido a Tecnologia Integradora -----------");
        do{
            System.out.println("Ingresa la opcion deseada"
                    + "\n 1) Añadir Computadora"
                    + "\n 2) Revisar la Lista"
                    + "\n 3) Modificar la Lista"
                    + "\n 4) Eliminar"
                    + "\n 5) Salir");
            int opcion = scanInt.nextInt();
            switch(opcion){
                case 1:
                    Computadora compu = pedirDatosAUsuario();
                    boolean exito = servicios.agregarDispositivo(compu);
                    if(exito){
                        System.out.println("Se agregó con éxito");
                    }else{
                        System.out.println("No morro, no se hace");
                    }
                    break;
                case 2:
                    LinkedList listaDeCompus = servicios.buscarDispositivo();
                    imprimir(listaDeCompus);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    bandera = !bandera;
                    System.out.println("Gracias por usar el sistema Tecnologia Integradora"
                            + "\n Este sistema se autodestruira en 5 segs.");
                    break;
            }
        }while(bandera);
        
    }
    
    public static Computadora pedirDatosAUsuario(){
        System.out.println("Ingrese el No. de serie");
        String noSerie = scanLine.nextLine();
        System.out.println("Ingrese el año de la coputadora");
        String anio = scanLine.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = scanLine.nextLine();
        System.out.println("Ingrese el procesador");
        String procesador = scanLine.nextLine();
        System.out.println("Ingrese la RAM");
        int ram = scanInt.nextInt();   
        Computadora compu = new Computadora(procesador, ram, noSerie, anio, modelo);
        return compu;
    }
    
    public static void imprimir(LinkedList<Computadora> listaDeCompus){
        for(Computadora compu:listaDeCompus){
            System.out.println(compu);
        }
    }
    
    
}
