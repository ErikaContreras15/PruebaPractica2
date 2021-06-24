/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.JefeProyecto;
import modelo.Plano;
import modelo.Poligono;
import modelo.Proyecto;

/**
 *
 * @author Erika
 */
public class ControladorrPoligono {
    
    private List<Poligono> listaPoligono;
    private Poligono seleccionado;
    
    public ControladorrPoligono(){
        listaPoligono = new ArrayList();
    }
    
     public int generarCodigo(){
        return (listaPoligono.size() >0)? listaPoligono.get(listaPoligono.size() - 1).getCodigo() + 1 : 1;
    }
     
     public Poligono crear(int num_Lineas, String nombre, String color){
        Poligono poligono= new Poligono(generarCodigo(), num_Lineas,nombre,color);
        listaPoligono.add(poligono);
        return poligono;
    }
    public Poligono buscar(String nombre){
        for (Poligono poligono : listaPoligono) {
            if(poligono.getNombre().equals(nombre)){
                seleccionado = poligono;
                return poligono;
            }
        }
        return null;
    }
    public boolean actualizar( String nombre){
        Poligono poligono = buscar(nombre);
        if(poligono!= null){
            int posicion = listaPoligono.indexOf(poligono);
           poligono.setNombre(nombre);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre){
        Poligono poligono = buscar(nombre);
        return listaPoligono.remove(poligono);
    }

    public void listar(){
        for(int i=0;i<listaPoligono.size();i++){
            listaPoligono.get(i);
            System.out.println(listaPoligono.get(i));
        }
                
    }
    public List<Poligono> getListaFigura() {
        return listaPoligono;
    }

    public void setListaPoligono(List<Poligono> listaPoligono) {
        this.listaPoligono = listaPoligono;
    }

    public Poligono getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Poligono seleccionado) {
        this.seleccionado = seleccionado;
    }

    
    
}
