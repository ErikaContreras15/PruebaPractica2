/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Figura;

/**
 *
 * @author Erika
 */
public class ControladorFigura {
    private List<Figura> listaFigura;
    private Figura seleccionado;
    
    public ControladorFigura(){
        listaFigura = new ArrayList<>();
    }
     public int generarCodigo(){
        return (listaFigura.size() >0)? listaFigura.get(listaFigura.size() - 1).getCodigo() + 1 : 1;
    }
    public boolean crear( String nombre, String color){
        return listaFigura.add(new Figura(generarCodigo(),nombre, color));
    }
    public Figura buscar(String nombre){
        for (Figura figura : listaFigura) {
            if(figura.getNombre().equals(nombre)){
                seleccionado = figura;
                return figura;
            }
        }
        return null;
    }
    public boolean actualizar( String nombre, String color){
        Figura figura = buscar(nombre);
        if(figura!= null){
            int posicion = listaFigura.indexOf(figura);
            figura.setNombre(nombre);
            figura.setColor(color);
            return true;
        }
        return false;
    }
    
  /*  public void listar(){
        for(int i=0;i<listaFigura.size();i++){
            listaFigura.get(i);
            System.out.println(listaFigura.get(i));
        }*/
        
    public boolean eliminar(String nombre){
        Figura figura = buscar(nombre);
        return listaFigura.remove(figura);
    }

    public List<Figura> getListaFigura() {
        return listaFigura;
    }

    public void setListaPersona(List<Figura> listaFigura) {
        this.listaFigura = listaFigura;
    }

    public Figura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Figura seleccionado) {
        this.seleccionado = seleccionado;
    }

}

