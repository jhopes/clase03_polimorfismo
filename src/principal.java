
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author docente05
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static ArrayList <SeleccionFutbol> integrante = new ArrayList<SeleccionFutbol>();
    public static void main(String[] args) {
       SeleccionFutbol cr7 = new Futbolista(1, 30, "Cristiano Ronaldo", "POO");
       SeleccionFutbol joe = new Entrenador(1, 25, "Joel", "Paredes Quinteros");
       SeleccionFutbol uchia = new Masajista(1, 12, "Miller ", "Rojas Jaramillo");
       
       integrante.add(cr7);
       integrante.add(joe);
       integrante.add(uchia);
       
       //entrenamiento
       for(SeleccionFutbol obj:integrante)
       {
           System.out.println(obj.getId()+" "+obj.getEdad()+" "+obj.getNombre()+" "+obj.getApellidos());
           obj.entrenamiento();
       }
       //viaje
       for(SeleccionFutbol obj:integrante)
       {
           System.out.println(obj.getId()+" "+obj.getEdad()+" "+obj.getNombre()+" "+obj.getApellidos());
           obj.viajar();
       }
       //concentracion
       for(SeleccionFutbol obj:integrante)
       {
           System.out.println(obj.getId()+" "+obj.getEdad()+" "+obj.getNombre()+" "+obj.getApellidos());
           obj.concentrarse();
       }   
       
       
       
    }
    
}
