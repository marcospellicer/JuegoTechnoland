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
public class Juego {
    private String nombre;
    private Jugador[] participantes;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.participantes = new Jugador[5];
    }
    public Jugador[] ganadores(){
        Jugador prueba = new Jugador("-");
        Jugador vGanadores[] = new Jugador[3];
        vGanadores[0]=prueba;
        vGanadores[1]=prueba;
        vGanadores[2]=prueba;
        
        for (int i = 0; i < participantes.length; i++) {
            if((participantes[i]!=null)&&(vGanadores[0].getPuntos())<(participantes[i].getPuntos())){
                vGanadores[0]=participantes[i];
            }
          
        }
          
           for (int i = 0; i < participantes.length; i++) {
           if((participantes[i]!=null)&&(participantes[i]!=vGanadores[0])&&((vGanadores[1].getPuntos())<(participantes[i].getPuntos()))){
                vGanadores[1]=participantes[i];
            }
            }
           for (int i = 0; i < participantes.length; i++) {
           if((participantes[i]!=null)&&(participantes[i]!=vGanadores[1])&&(participantes[i]!=vGanadores[0])&&((vGanadores[2].getPuntos())<(participantes[i].getPuntos()))){
                vGanadores[2]=participantes[i];
            }
            }
          return vGanadores;
        }
    public boolean añadirParticipante(Jugador jugador1){
        for (int i = 0; i < participantes.length; i++) {
            if(participantes[i]==null){
                participantes[i]=jugador1;
                return true;
            }
        }
        return false;
    }
     public boolean puntosJugador(int puntos , String nombreJugador){
         for (int i = 0; i < participantes.length; i++) {
             if((participantes!=null)&&participantes[i].getNombre().equalsIgnoreCase(nombreJugador)){
                 participantes[i].setPuntos(puntos);
                 return true;
             }
         }
         return false;
    }
     public void verParticipantes(){
         for (int i = 0; i < participantes.length; i++) {
             if(participantes[i]!=null){
             System.out.println(participantes[i]);
             }
         }
    }

    @Override
    public String toString() {
        String aux="";
        int contador=0;
             for (Jugador ju:participantes){
                 if (ju!=null)
                     contador++;
             }
        return nombre + " Numero de jugadores inscritos " + contador +"\n"+"-------------------------------------";
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
     * @return the participante
     */
    public Jugador[] getParticipantes() {
        return participantes;
    }

   
    public void setParticipantes(Jugador[] participantes) {
        this.participantes = participantes;
    }
    
    
    
}
