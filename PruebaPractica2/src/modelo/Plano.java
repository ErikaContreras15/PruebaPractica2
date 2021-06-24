/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;


/**
 *
 * @author Erika
 */
public class Plano {
    
    private int num_Identificacion;
    private Date fecha_Entrega;
    private String nombre_Arquitectos;
    private  String dibujo_Plano;
    private int num_Figuras;

    //Constructor
    public Plano(int num_Identificacion, Date fecha_Entrega, String nombre_Arquitectos, String dibujo_Plano, int num_Figuras) {
        this.num_Identificacion = num_Identificacion;
        this.fecha_Entrega = fecha_Entrega;
        this.nombre_Arquitectos = nombre_Arquitectos;
        this.dibujo_Plano = dibujo_Plano;
        this.num_Figuras = num_Figuras;
    }

   //Metodos Get y Set
    public int getNum_Identificacion() {
        return num_Identificacion;
    }

    public void setNum_Identificacion(int num_Identificacion) {
        this.num_Identificacion = num_Identificacion;
    }

    public Date getFecha_Entrega() {
        return fecha_Entrega;
    }

    public void setFecha_Entrega(Date fecha_Entrega) {
        this.fecha_Entrega = fecha_Entrega;
    }

    public String getNombre_Arquitectos() {
        return nombre_Arquitectos;
    }

    public void setNombre_Arquitectos(String nombre_Arquitectos) {
        this.nombre_Arquitectos = nombre_Arquitectos;
    }

    public String getDibujo_Plano() {
        return dibujo_Plano;
    }

    public void setDibujo_Plano(String dibujo_Plano) {
        this.dibujo_Plano = dibujo_Plano;
    }

    public int getNum_Figuras() {
        return num_Figuras;
    }

    public void setNum_Figuras(int num_Figuras) {
        this.num_Figuras = num_Figuras;
    }

    @Override
    public String toString() {
        return "Plano{" + "num_Identificacion=" + num_Identificacion + ", fecha_Entrega=" + fecha_Entrega + ", nombre_Arquitectos=" + nombre_Arquitectos + ", dibujo_Plano=" + dibujo_Plano + ", num_Figuras=" + num_Figuras + '}';
    }
    
    
}
