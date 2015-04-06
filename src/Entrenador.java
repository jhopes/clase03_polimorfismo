/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author docente05
 */
public class Entrenador extends SeleccionFutbol {

    public Entrenador(int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
    }

    @Override
    public void entrenamiento() {
        System.out.println("Realiza entrenamiento (clase hijo entrenador)");
    }

    
    
}
