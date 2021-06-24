/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Erika
 */
public class Figura{
    
    private int codigo;
    private String nombre;
    private String color;
    
    //Constructores
    public Figura(int codigo, String nombre, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
    }

     public Figura( String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" + "Codigo:=" + codigo + ", Nombre:=" + nombre + ", Color:=" + color + '}';
    }   
}
