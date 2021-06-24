/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorLinea;
import java.util.Scanner;
import modelo.Linea;

/**
 *
 * @author Erika
 */
public class VistaLinea {
    Scanner s = new Scanner(System.in);
    private ControladorLinea controladorLinea;
    
    public VistaLinea(){
      controladorLinea=new  ControladorLinea();
       this.controladorLinea= controladorLinea;
 
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
  
    public Linea crear(){
        
        System.out.println("Ingrese: \n Longuitud:");        
        int longuitud = s.nextInt();
        System.out.println("Ingrese: \n PuntoOrigen");        
        double  puntoOrigen = s.nextDouble();
        System.out.println("Ingrese: \n PuntoFin");        
        double puntoFin = s.nextDouble();
        return controladorLinea.crear(longuitud,  puntoOrigen,  puntoFin); 
    }
    public Linea actualizar(){
       
        System.out.println("Ingrese: \n Longuitud:");        
        int longuitud = s.nextInt();
        System.out.println("Ingrese: \n PuntoOrigen");        
        double  puntoOrigen = s.nextDouble();
        System.out.println("Ingrese: \n PuntoFin");        
        double puntoFin = s.nextDouble();
      return controladorLinea.actualizar(longuitud, puntoOrigen,  puntoFin); 
    }
    public void buscar(){
        System.out.println("Ingrese: \n Punt_Origen");
        Double puntoOrigen = s.nextDouble();
        System.out.println(controladorLinea.buscar(puntoOrigen));
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+ controladorLinea.eliminar(controladorLinea.getSeleccionado().getPuntoOrigen()));
    }
    public void listar(){
        for (Linea linea : controladorLinea.getListaLinea()) {
            System.out.println(linea);
        }
    }
}

