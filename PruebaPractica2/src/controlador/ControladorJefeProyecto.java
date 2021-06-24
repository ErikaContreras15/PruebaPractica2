/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.JefeProyecto;

/**
 *
 * @author Erika
 */
public class ControladorJefeProyecto {
    private List<JefeProyecto> listaJefe_Proyecto;
    private JefeProyecto seleccionado;
    
    public ControladorJefeProyecto(){
        listaJefe_Proyecto = new ArrayList<>();
    }
    public int generarId(){
        return (listaJefe_Proyecto.size() >0)? listaJefe_Proyecto.get(listaJefe_Proyecto.size() - 1).getId() + 1 : 1;
    }
    
    //Metodos CRUD
    public JefeProyecto crear(String nombre, String direccion, String telefono) {
        JefeProyecto jefe_Proyecto =new JefeProyecto(generarId(), nombre,direccion,telefono);
        listaJefe_Proyecto.add(jefe_Proyecto);
        return jefe_Proyecto;
    }
    
    public JefeProyecto buscar(String nombre){
        for (JefeProyecto jefe_Proyecto : listaJefe_Proyecto) {
            if(jefe_Proyecto.getNombre().equals(nombre)){
                seleccionado = jefe_Proyecto;
                return jefe_Proyecto;
            }
        }
        return null;
    }
    public JefeProyecto actualizar(String nombre, String direccion, String telefono){
        JefeProyecto persona = buscar(nombre);
        if(persona != null){
            int posicion = listaJefe_Proyecto.indexOf(persona);
            persona.setDireccion(direccion);
            persona.setTelefono(telefono);
            listaJefe_Proyecto.set(posicion, persona);
            return persona;
        }
        return null;
    }
    public boolean eliminar(String nombreCompleto){
        JefeProyecto jefe_Proyecto = buscar(nombreCompleto);
        return listaJefe_Proyecto.remove(jefe_Proyecto);
    }

    public List<JefeProyecto> getlistaJefe_Proyecto() {
        return listaJefe_Proyecto;
    }

    public void setlistaJefe_Proyecto(List<JefeProyecto> listaJefe_Proyecto) {
        this.listaJefe_Proyecto = listaJefe_Proyecto;
    }

    public JefeProyecto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(JefeProyecto seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}

    

