/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorPlano;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import modelo.Plano;
/**
 *
 * @author Erika
 */
public class VistaPlano {
    private ControladorPlano controladorPlano;
    DateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
    Scanner s = new Scanner(System.in);
    
    public VistaPlano(){
        controladorPlano=new ControladorPlano();
        
        this.controladorPlano =controladorPlano;

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
    public Plano crear(){
        try {
        System.out.println("Fecha (dd/mm/yyyy):");
        String fecha = s.next();   
        System.out.println("Ingrese: \n Nombre_Arquitectos:");        
        String nombre_Arquitectos = s.next();
        System.out.println("Ingrese: \n Dibujo_Plano:");        
        String dibujo_Plano = s.next();
        System.out.println("Ingrese: \n Num_Figuras");        
        int num_Figuras = s.nextInt();  
        return controladorPlano.crear(formatoFecha.parse(fecha),nombre_Arquitectos,dibujo_Plano,num_Figuras);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
        
    }
    public Plano actualizar(){
          try {
        System.out.println("Fecha (dd/mm/yyyy):");
        String fecha = s.next();   
        System.out.println("Ingrese: \n Nombre_Arquitectos:");        
        String nombre_Arquitectos = s.next();
        System.out.println("Ingrese: \n Dibujo_Plano:");        
        String dibujo_Plano = s.next();
        System.out.println("Ingrese: \n Num_Figuras");        
        int num_Figuras = s.nextInt();  
         return controladorPlano.crear(formatoFecha.parse(fecha),nombre_Arquitectos,dibujo_Plano,num_Figuras);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public void buscar(){
        System.out.println("Ingrese: \n Dibujo_Plano:");
        String dibujo_Plano = s.next();
        System.out.println(controladorPlano.buscar(dibujo_Plano));
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+ controladorPlano.eliminar(controladorPlano.getSeleccionado().getDibujo_Plano()));
    }
    public void listar(){
        for (Plano plano : controladorPlano.getListaPlano()) {
            System.out.println(plano);
        }
    }
}

