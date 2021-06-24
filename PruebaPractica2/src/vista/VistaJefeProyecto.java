/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorJefeProyecto;
import controlador.ControladorProyecto;
import java.util.Scanner;
import modelo.JefeProyecto;
import modelo.Proyecto;

/**
 *
 * @author Erika
 */
public class VistaJefeProyecto {
    public Scanner s;
    private ControladorJefeProyecto controladorJefeProyecto;
    
    public VistaJefeProyecto(ControladorJefeProyecto controladorJefeProyecto){
        s= new Scanner(System.in);
        this.controladorJefeProyecto= new ControladorJefeProyecto();
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
   /* public void menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear \n 2. Actualizar \n 3. Buscar \n 4. Eliminar \n 5. Listar \n 6. Salir");
            opcion = s.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: this.eliminar(); break;
                case 5: this.listar(); break;
            }
        } while (opcion < 6);
    }*/
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

