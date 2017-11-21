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
public class Technoland {
    private int edicion;
    private Juego[] vJuegos;

 

    public Technoland(int edicion) {
        this.edicion = edicion;
        this.vJuegos = new Juego[5];
    }

    /**
     * @return the edicion
     */
    public int getEdicion() {
        return edicion;
    }
    public boolean añadirJuego(Juego juego1){
        for (int i = 0; i < vJuegos.length; i++) {
            if(vJuegos[i]==null){
                vJuegos[i]=juego1;
                return true;
            }
        }
        return false;
    }
    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the vJuegos
     */
    public Juego[] getvJuegos() {
        return vJuegos;
    }

    /**
     * @param vJuegos the vJuegos to set
     */
    public void setvJuegos(Juego[] vJuegos) {
        this.vJuegos = vJuegos;
    }

   
    
    
    
}
