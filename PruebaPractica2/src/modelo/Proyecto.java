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
public class Proyecto {
    
    private int codigo;
    private String nombre;
    private JefeProyecto jefeProyecto;
    
    //Atributo de composicion
    private List<Plano> plano;
    
    //Constructores
    public Proyecto(int codigo, String nombre, JefeProyecto jefeProyecto, List<Plano> plano){
        this.codigo = codigo;
        this.nombre = nombre;
        this.jefeProyecto = jefeProyecto;
        this.plano = plano;
    }

    public Proyecto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Metodos Get y Set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
