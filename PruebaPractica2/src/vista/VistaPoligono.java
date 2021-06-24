/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorrPoligono;
import java.util.Scanner;
import modelo.Poligono;

/**
 *
 * @author Erika
 */
public class VistaPoligono {
    Scanner   s = new Scanner(System.in);
    private ControladorrPoligono controladorrPoligono;
    
    public VistaPoligono(){
      controladorrPoligono=new ControladorrPoligono();
        this.controladorrPoligono= controladorrPoligono;
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
                controladorrPoligono.listar();
            }
        }
    }
    public Poligono crear(){
        System.out.println("Ingrese: \n Num_Lineas");
        s.nextLine();
        int num_Lineas = s.nextInt();
        System.out.println("Ingrese: \n Nombre:");
        String nombre= s.nextLine();
        System.out.println("Ingrese: \n Color: ");
        String color = s.nextLine();
       return controladorrPoligono.crear(num_Lineas,nombre,color);  
    }
    public Poligono actualizar(){
        System.out.println("Ingrese: \n Num_Lineas");
        s.nextLine();
        int num_Lineas = s.nextInt();
        System.out.println("Ingrese: \n Nombre:");
        String nombre= s.nextLine();
        System.out.println("Ingrese: \n Color: ");
        String color = s.nextLine();
        return controladorrPoligono.crear(num_Lineas,nombre,color); 
    }
    public void buscar(){
        System.out.println("Ingrese: \n Nombre:");
        s.nextLine();
        String nombre = s.nextLine();
        System.out.println(controladorrPoligono.buscar(nombre));
         controladorrPoligono.buscar(nombre);
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+ controladorrPoligono.eliminar(controladorrPoligono.getSeleccionado().getNombre()));
    }
   
}

