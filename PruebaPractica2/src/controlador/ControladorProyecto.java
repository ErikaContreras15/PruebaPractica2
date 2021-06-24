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
import modelo.Proyecto;

/**
 *
 * @author Erika
 */
public class ControladorProyecto {
    private List<Proyecto> listaProyecto;
    private Proyecto seleccionado;
    ArrayList planos= new ArrayList();
    public ControladorProyecto(){
        listaProyecto = new ArrayList<>();
    }
     public int generarCodigo(){
        return (listaProyecto.size() >0)? listaProyecto.get(listaProyecto.size() - 1).getCodigo() + 1 : 1;
    }
   
     //Metodos CRUD
     public Proyecto crear(String nombre, JefeProyecto jefeProyecto, Plano plano){
        planos.add(plano);
        Proyecto proyecto= new Proyecto(generarCodigo(),nombre,jefeProyecto,planos);
        listaProyecto.add(proyecto);
        return proyecto;
    }
     
    public Proyecto buscar(String nombre){
        for (Proyecto proyecto : listaProyecto) {
            if(proyecto.getNombre().equals(nombre)){
                seleccionado = proyecto;
                return proyecto;
            }
        }
        return null;
    }
    public Proyecto actualizar(String nombre,JefeProyecto jefeProyecto ){
        Proyecto proyecto= buscar(nombre);
        if(proyecto!= null){
            int posicion = listaProyecto.indexOf(proyecto);
            
            return proyecto;
        }
        return null;
    }
    public boolean eliminar(String nombre){
        Proyecto proyecto = buscar(nombre);
        return listaProyecto.remove(proyecto);
    }

    
    public List<Proyecto> getListaProyecto() {
        return listaProyecto;
    }

    public void setListaProyecto(List<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }

    public Proyecto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Proyecto seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
