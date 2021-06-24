/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Linea;

/**
 *
 * @author Erika
 */
public class ControladorLinea {
    
    private List<Linea> listaLinea;
    private Linea seleccionado;
    
    public ControladorLinea(){
        listaLinea = new ArrayList<>();
    }
     public int generarId_Linea(){
        return (listaLinea.size() >0)? listaLinea.get(listaLinea.size() - 1).getId_Linea() + 1 : 1;
    }
    
     //Metodos CRUD
    public Linea crear(int longuitud, Double  puntoOrigen, Double puntoFin) {
        Linea linea =new Linea(generarId_Linea(),longuitud,  puntoOrigen, puntoFin);
        listaLinea.add(linea);
        return linea;
    }
    public Linea buscar(Double  puntoOrigen){
        for (Linea linea : listaLinea) {
            if(linea.getPuntoOrigen()== puntoOrigen){
                seleccionado = linea;
                return linea;
            }
        }
        return null;
    }
    public Linea actualizar( int longuitud, Double puntoOrigen, Double puntoFin){
        Linea linea = buscar(puntoOrigen);
        if(linea!= null){
            int posicion = listaLinea.indexOf(linea);
           linea.setPuntoOrigen( puntoOrigen);
            return linea;
        }
        return null;
    }
    public boolean eliminar(Double puntoOrigen){
        Linea linea = buscar(puntoOrigen);
        return listaLinea.remove(linea);
    }

    public List<Linea> getListaLinea() {
        return listaLinea;
    }

    public void setListaLinea(List<Linea> listaLinea) {
        this.listaLinea = listaLinea;
    }

    public Linea getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Linea seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
