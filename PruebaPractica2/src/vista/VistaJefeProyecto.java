/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorJefeProyecto;
import java.util.Scanner;
import modelo.JefeProyecto;

/**
 *
 * @author Erika
 */
public class VistaJefeProyecto {
     Scanner  s= new Scanner(System.in);
    private ControladorJefeProyecto controladorJefeProyecto;
    
    public VistaJefeProyecto(){
       controladorJefeProyecto=new ControladorJefeProyecto();
        this.controladorJefeProyecto= controladorJefeProyecto;
    }
      public void menu() {
        int op = 1;
        while (op >  0) {
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
    public JefeProyecto crear(){
        System.out.println("Ingrese: \n Nombre:");
        s.nextLine();
        String nombre = s.nextLine();
        System.out.println("Ingrese: \n Direccion:");
        String direccion= s.nextLine();
        System.out.println("Ingrese: \n Telefono: ");
        String telefono= s.nextLine();
       return controladorJefeProyecto.crear(nombre,direccion,telefono);       
    }
    
    public JefeProyecto actualizar(){
        System.out.println("Ingrese: \n nombre ");
        s.nextLine();
        String nombre = s.nextLine();
        System.out.println("Ingrese: \n Direccion:");
        String direccion= s.nextLine();
        System.out.println("Ingrese: \n Telefono: ");
        String telefono= s.nextLine();
        return controladorJefeProyecto.actualizar(nombre,direccion,telefono); 
    }
    public JefeProyecto buscar(){
        System.out.println("Ingrese: \n Nombre: ");
        s.nextLine();
        String nombre = s.nextLine();
        System.out.println(controladorJefeProyecto.buscar(nombre));
        return controladorJefeProyecto.buscar(nombre);
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+controladorJefeProyecto .eliminar(controladorJefeProyecto.getSeleccionado().getNombre()));
    }
    public void listar(){
        for (JefeProyecto proyecto : controladorJefeProyecto.getlistaJefe_Proyecto()) {
            System.out.println(proyecto);
        }
    }
}

