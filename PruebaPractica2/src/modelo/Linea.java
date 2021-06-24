/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Erika
 */
public class Linea {
    private int id_Linea;
    private int longuitud;
    private Double puntoOrigen;
    private Double puntoFin;
    
    //Atributo de composicion
    private List<Poligono> poligono;
    
    //Constructores

    public Linea(int id_Linea, int longuitud, Double puntoOrigen, Double puntoFin, List<Poligono> poligono) {
        this.id_Linea = id_Linea;
        this.longuitud = longuitud;
        this.puntoOrigen = puntoOrigen;
        this.puntoFin = puntoFin;
        this.poligono = poligono;
    }

     public Linea(int id_Linea, int longuitud, Double puntoOrigen, Double puntoFin) {
        this.id_Linea = id_Linea;
        this.longuitud = longuitud;
        this.puntoOrigen = puntoOrigen;
        this.puntoFin = puntoFin;
    }

     //Metodos Get y Set
    public int getId_Linea() {
        return id_Linea;
    }

    public void setId_Linea(int id_Linea) {
        this.id_Linea = id_Linea;
    }

    public int getLonguitud() {
        return longuitud;
    }

    public void setLonguitud(int longuitud) {
        this.longuitud = longuitud;
    }

    public Double getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(Double puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public Double getPuntoFin() {
        return puntoFin;
    }

    public void setPuntoFin(Double puntoFin) {
        this.puntoFin = puntoFin;
    }

    @Override
    public String toString() {
        return "Linea{" + "id_Linea=" + id_Linea + ", longuitud=" + longuitud + ", puntoOrigen=" + puntoOrigen + ", puntoFin=" + puntoFin + '}';
    }
     
}
   