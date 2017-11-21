/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondetechnoland;

import java.util.Scanner;

public class AplicacionDeTechnoland {

    
    
    public static void main(String[] args) {
        Scanner leer2 = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        Scanner leer1 = new Scanner(System.in);
        String juego , nombreParticipante;
        int pos=0 , puntos=0;
        boolean salir = false , salir1= false;
        Technoland tech = new Technoland(2017);
       while(salir==false){
        Menu.pintaMenu();
        System.out.println("dime una opcion");
        switch(leer1.nextInt()){
            case 1:{
                     System.out.println("dime el nombre del juego");
                     tech.añadirJuego(new Juego(leer.nextLine().trim()));
                     System.out.println("pulsa enter para continuar");
                     leer2.nextLine();
                     LimpiarPantalla.limpiaPntallas();
                    break;
                   }
            case 2:{
                    for (int i = 0; i < tech.getvJuegos().length; i++) {
                        if(tech.getvJuegos()[i]!=null){
                        
                            System.out.println(tech.getvJuegos()[i]);
                }
                   
                   }
                    System.out.println("pulsa enter para continuar");
                     leer2.nextLine();
                     LimpiarPantalla.limpiaPntallas();
                     break;
            }
            case 3:{
                     salir1=false;
                     int aux=-1;
                     System.out.println("dime el nombre del juego");
                     juego=leer.nextLine().trim();
                     for (int i = 0; i < tech.getvJuegos().length; i++) {
                     if((tech.getvJuegos()[i]!=null)&&(tech.getvJuegos()[i].getNombre().equalsIgnoreCase(juego))){ 
                         pos=i;
                         aux=i;
                     }
                     }
                     if(aux==-1){
                       System.out.println("juego no encontrado");  
                       salir1=true;
                     }
                     
                    while(salir1==false){
                    Menu.pintaMenu2();
                    System.out.println("dime una opcion");
                    switch(leer1.nextInt()){
                        case 1:{
                                  System.out.println("dime el nombre del participante");
                                  tech.getvJuegos()[pos].añadirParticipante(new Jugador(leer.nextLine().trim()));
                                   System.out.println("pulsa enter para continuar");
                                    leer2.nextLine();
                                    LimpiarPantalla.limpiaPntallas();
                                 break;
                                }
                        case 2:{
                                 tech.getvJuegos()[pos].verParticipantes();
                                  System.out.println("pulsa enter para continuar");
                                  leer2.nextLine();
                                 LimpiarPantalla.limpiaPntallas();
                                 break;
                                }
                        case 3:{
                                System.out.println("diem el nombre del participante");
                                nombreParticipante=leer.nextLine();
                                for (int j = 0; j < tech.getvJuegos()[pos].getParticipantes().length; j++) {
                                if((tech.getvJuegos()[pos].getParticipantes()[j]!=null)&&(tech.getvJuegos()[pos].getParticipantes()[j].getNombre().equalsIgnoreCase(nombreParticipante))){
                                System.out.println("diem el numero de puntos"); 
                                puntos=leer1.nextInt();
                                tech.getvJuegos()[pos].puntosJugador(puntos, tech.getvJuegos()[pos].getParticipantes()[j].getNombre());
                                }
                               }   
                                 System.out.println("pulsa enter para continuar");
                                    leer2.nextLine();
                                    LimpiarPantalla.limpiaPntallas();
                                 break;
                                }
                        case 4:{
                                for (int j = 0; j < 3; j++) {
                                    if(!(tech.getvJuegos()[pos].ganadores()[j].getNombre().equalsIgnoreCase("-"))){
                                    System.out.println("Clasificado nº "+(j+1)+" : "+"\n"+tech.getvJuegos()[pos].ganadores()[j]);
                                    }else{
                                        System.out.println("Clasificado nº "+(j+1)+" : "+"\n"+"         ---            ");
                                    }
                                }
                                 System.out.println("pulsa enter para continuar");
                                 leer2.nextLine();
                                 LimpiarPantalla.limpiaPntallas();
                                 break;
                                }
                        case 5:{
                                 salir1=true;
                                 break;
                                }
                     }
                    }
                    System.out.println("pulsa enter para continuar");
                     leer2.nextLine();
                     LimpiarPantalla.limpiaPntallas();
                    break;
                   }
           
       
             case 4:{
                    salir=true;
                    break;
                   }
       }
      }
            
       
      
        
       
       
         
      
       
        
        
         
       
        
    }
    
}
