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
public class Poligono extends Figura{
    private int num_Lineas;
    
    //Constructor

    public Poligono(int codigo, String nombre, String color) {
        super(codigo, nombre, color);
    }

    public Poligono(int codigo,int num_Lineas, String nombre, String color) {
       super(codigo, nombre, color);
    }
      
    //Metodos Get y Set
    public int getNum_Lineas() {
        return num_Lineas;
    }

    public void setNum_Lineas(int num_Lineas) {
        this.num_Lineas = num_Lineas;
    }

    @Override
    public String toString() {
        return "Poligono{" + "Num_Lineas=" + num_Lineas + '}';
    }
    
}
