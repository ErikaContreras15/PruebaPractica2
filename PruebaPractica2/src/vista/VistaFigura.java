/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorFigura;
import java.util.Scanner;
import modelo.Figura;

/**
 *
 * @author Erika
 */
public class VistaFigura {
     public Scanner s;
    private ControladorFigura controladorFigura;

    public VistaFigura(ControladorFigura controladorFigura){
        s = new Scanner(System.in);
        this.controladorFigura =new ControladorFigura();
       
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
  /*  public void menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear \n 2. Actualizar \n 3. Buscar \n 4. Eliminar \n 5. Listar \n 6. Salir");
            opcion = s.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: this.eliminar(); break;
                case 5: this.listar();break;
            }
        } while (opcion < 6);
    }*/
    public void crear(){
        int codigo =s.nextInt();
        System.out.println("Ingrese: \n Nombre: ");
        String nombre=s.nextLine();
        System.out.println("Ingrese: \n Color: ");
        String color=s.nextLine();
        System.out.println("Res:" + controladorFigura.crear(nombre,color));
    }
    public void actualizar(){
        System.out.println("Ingrese: \n Codigo: ");
        s.nextLine();
        int codigo =s.nextInt();
        System.out.println("Ingrese: \n Nombre: ");
        String nombre=s.nextLine();
        System.out.println("Ingrese: \n Color: ");
        String color=s.nextLine();
        System.out.println("Res:" + controladorFigura.crear(nombre,color));
       
    }
    public Figura buscar(){
        System.out.println("Ingrese: \nIngrese el Nombre de la figura a buscar: ");
        s.nextLine();
        String nombre = s.nextLine();
        System.out.println(controladorFigura.buscar(nombre));
        return controladorFigura.buscar(nombre);
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+ controladorFigura.eliminar(controladorFigura.getSeleccionado().getNombre()));
    }
    public void listar(){
        for (Figura figura : controladorFigura.getListaFigura()) {
            System.out.println(figura);
        }
    }
}
