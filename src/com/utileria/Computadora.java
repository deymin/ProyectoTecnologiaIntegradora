
package com.utileria;

public class Computadora extends Tecnologia {
    private String procesador;
    private int ram;
    
    public Computadora(){}
    
    public Computadora(String procesador, int ram, String noSerie, String anio, String modelo){
        super(noSerie, anio, modelo);
        this.procesador = procesador;
        this.ram = ram;
    }
    
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    
    public String getProcesador(){
        return this.procesador;
    }
    
    public void setRam(int ram){
        this.ram = ram;
    }
    
    public int getRam(){
        return this.ram;
    }
    
    @Override
    public String toString(){        
        return super.toString() + ", procesador: " + this.procesador + ", la ram: " + this.ram;
    }
    
}
