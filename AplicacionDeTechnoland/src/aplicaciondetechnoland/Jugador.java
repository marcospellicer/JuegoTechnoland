/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondetechnoland;

/**
 *
 * @author alumno
 */
public class Jugador {
    private String nombre;
    private int edad;
    private int puntos;

   

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
        this.puntos = 0;
    }

    @Override
    public String toString() {
        return "nombre : "+getNombre()+"\n"+ "edad : "+getEdad()+"\n"+"puntos : "+getPuntos()+"\n"+"---------------------------------------";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
}
