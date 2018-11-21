
package com.utileria;

public abstract class Tecnologia {
    private String noSerie;
    private String anio;
    private String modelo;
    
    public Tecnologia(){}
    
    public Tecnologia(String noSerie, String anio, String modelo){
        this.noSerie = noSerie;
        this.anio = anio;
        this.modelo = modelo;
    }
    
    public void setNoSerie(String noSerie){
        this.noSerie = noSerie;
    }
    
    public String getNoSerie(){
        return this.noSerie;
    }
    
    public void setAnio(String anio){
        this.anio = anio;
    }
    
    public String getAnio(){
        return this.anio;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }    
    
    @Override
    public String toString(){        
        return "El model es " + this.modelo + ", el año de lanzamiento fue " + this.anio + ", el No.Serie: " + this.noSerie;
    }
    
}
