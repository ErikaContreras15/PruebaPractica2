/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorFigura;
import controlador.ControladorJefeProyecto;
import controlador.ControladorLinea;
import controlador.ControladorPlano;
import controlador.ControladorrPoligono;
import controlador.ControladorProyecto;
import java.util.Scanner;

/**
 *
 * @author Erika
 */
public class VistaGeneral {
    private Scanner s;
    vistaFigura  = new VistaFigura(controladorFigura);
    vistaPoligono  = new VistaPoligono(controladorrPoligono);
    vistaProyecto  = new VistaProyecto(controladorJefeProyecto, controladorPlano);
    vistaJefeProyecto  = new VistaJefeProyecto(controladorJefeProyecto);
    vistaPlano  = new VistaPlano(controladorPlano);
    vistaLinea  = new VistaLinea(controladorLinea);

     s = new Scanner(System.in);
      private controladorFigura ControladorFigura();
      private  controladorrPoligono ControladorrPoligono();
      private controladorLinea ControladorLinea();
      private controladorPlano ControladorPlano();
      private  controladorProyecto ControladorProyecto();
      private  controladorJefeProyecto ControladorJefeProyecto();
        
       public VistaGeneral(){
        s= new Scanner(System.in);
       controladorFigura= new  ControladorFigura();
       controladorrPoligono=new ControladorrPoligono();
       controladorLinea=new ControladorLinea();
       controladorPlano=new ControladorPlano();
       controladorProyecto= new ControladorProyecto();
      controladorJefeProyecto =new ControladorJefeProyecto();
       
    }
 public void menu()
    {
        int op=1;
        while(op>0)
        {
            System.out.println(" 1. Menu Jefe_Proyecto \n 2. Menu Proyecto \n 3. Menu Plano \n 4. Menu Figura \n 5. Menu Poligono \n.6 Menu Linea \n.7 Salir");
            op = s.nextInt();
           
            if(op==1)
                vistaJefeProyecto.menu();
            else if(op==2)
                vistaProyecto.menu(); 
            else if (op==3)
                vistaPlano.menu();
            else if (op==4)
                vistaFigura.menu();
            else if (op==5)
               vistaPoligono.menu();
            else if (op==6)
                vistaLinea.menu();
        }
    }


}