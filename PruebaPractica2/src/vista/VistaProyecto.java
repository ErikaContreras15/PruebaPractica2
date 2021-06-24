/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorJefeProyecto;
import controlador.ControladorPlano;
import controlador.ControladorProyecto;
import java.util.Scanner;
import modelo.Proyecto;

/**
 *
 * @author Erika
 */
public class VistaProyecto {
    private ControladorJefeProyecto controladorJefeProyecto;
    private ControladorProyecto controladorProyecto;
    private ControladorPlano controladorPlano;
    private VistaJefeProyecto vistaJefeProyecto;
    private VistaPlano vistaPlano;
    Scanner s= new Scanner(System.in);
    
   public VistaProyecto( ){
        controladorJefeProyecto= new ControladorJefeProyecto();
        controladorProyecto=new ControladorProyecto();
        controladorPlano=new ControladorPlano();
        this.controladorJefeProyecto= controladorJefeProyecto;
        this.controladorProyecto= controladorProyecto;
        this.controladorPlano= controladorPlano;
    }

     public void menu() {
        int op = 1;
        while (op > 0) {
            System.out.println("1.crear\n2.Actualizar\n3.Buscar\n4.Eliminar\n5.listar");
            op = s.nextInt();
            if (op == 1) {
                crear();
            } else if (op == 2) {
                actualizar();
            } else if (op == 3) {
                buscar();
            } else if (op == 4) {
                eliminar();
            } else if (op == 5) {
                listar();
            }
        }
    }

    public Proyecto crear(){
        System.out.println("Ingrese: \n Nombre:");
        s.nextLine();
        String nombre = s.nextLine();
        return controladorProyecto.crear(nombre,vistaJefeProyecto.crear(),vistaPlano.crear());  
    }
    public  Proyecto actualizar(){
        System.out.println("Ingrese: \n Nombre");
        s.nextLine();
        String nombre = s.nextLine();
        
       return controladorProyecto.actualizar(nombre,vistaJefeProyecto.actualizar());  
    }
    public Proyecto buscar(){
        System.out.println("Ingrese: \n Nombre:");
        s.nextLine();
        String nombre = s.nextLine();
        System.out.println(controladorProyecto.buscar(nombre));
        return controladorProyecto.buscar(nombre);
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+ controladorProyecto.eliminar(controladorProyecto.getSeleccionado().getNombre()));
    }
    public void listar(){
        for (Proyecto proyecto : controladorProyecto.getListaProyecto()) {
            System.out.println(proyecto);
        }
    }
}

