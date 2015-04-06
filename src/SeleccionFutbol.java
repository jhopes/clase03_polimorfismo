/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author docente05
 */
public abstract class SeleccionFutbol {
    int id, edad;
    String nombre, apellidos;
    ////constructor

    public SeleccionFutbol(int id, int edad, String nombre, String apellidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    ///metodos getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    ////////////
    
    public void viajar()
    {
        System.out.println("Estoy viajando (clase padre) ");
            
    }
    public void concentrarse()
    {
        System.out.println("Concentrarse (clase padre) ");
    }
    public abstract void entrenamiento();//metodo por implementar en los hijos
    
    public void partidoFutbol()
    {
         System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
    }
    
}
