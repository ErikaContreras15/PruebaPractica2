/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Plano;

/**
 *
 * @author Erika
 */
public class ControladorPlano {
    
    private List<Plano> listaPlano;
    private Plano seleccionado;
    
    public ControladorPlano(){
        listaPlano= new ArrayList<>();
    }
    public int generarNum_Identificacion(){
        return (listaPlano.size() >0)? listaPlano.get(listaPlano.size() - 1).getNum_Identificacion() + 1 : 1;
    }
    
    //Metodos CRUD
    public Plano crear(Date fecha_Entrega, String nombre_Arquitectos, String dibujo_Plano, int num_Figuras) {
        Plano plano =new Plano(generarNum_Identificacion(),fecha_Entrega, nombre_Arquitectos,dibujo_Plano,num_Figuras);
        listaPlano.add(plano);
        return plano;
    }
    
    public Plano buscar(String dibujo_Plano){
        for (Plano plano: listaPlano) {
            if(plano.getDibujo_Plano().equals(dibujo_Plano)){
                seleccionado = plano;
                return plano;
            }
        }
        return null;
    }
    public Plano actualizar(Date fecha_Entrega, String nombre_Arquitectos, String dibujo_Plano, int num_Figuras){
        Plano plano = buscar(dibujo_Plano);
        if(plano != null){
            int posicion = listaPlano.indexOf(plano);
            plano.setFecha_Entrega(fecha_Entrega);
            plano.setNombre_Arquitectos(nombre_Arquitectos);
            plano.setDibujo_Plano(dibujo_Plano);
           plano.setNum_Figuras(num_Figuras);
            listaPlano.set(posicion, plano);
            return plano;
        }
        return null;
    }
    public boolean eliminar(String dibujo_Plano){
        Plano plano = buscar(dibujo_Plano);
        return listaPlano.remove(plano);
    }

    public List<Plano> getlistaPlano() {
        return listaPlano;
    }

    public void setlistaPlano(List<Plano> listaPlano) {
        this.listaPlano = listaPlano;
    }

    public Plano getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Plano seleccionado) {
        this.seleccionado = seleccionado;
    }

    public Iterable<Plano> getListaPlano() {
        return null;
       
    }
    
}
