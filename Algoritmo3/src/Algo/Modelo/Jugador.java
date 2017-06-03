package Algo.Modelo;

import java.util.HashMap;

    public class Jugador {
    	  private Personaje personajeActual;
    	  private HashMap<String,Personaje> diccionarioPersonajes;
    	  private Equipo unEquipo=new Equipo();    
    		
    		public Jugador(){
    			 
    		 
    		}
    		
    		 
    		public void elegirEquipo(String unEquipo){
    			diccionarioPersonajes=this.unEquipo.elijoAlEquipo(unEquipo);
    		}
    		
    		public void elegirPersonaje(String unPersonaje){
    			
    			
    			this.personajeActual= this.diccionarioPersonajes.get(unPersonaje);
    		}
    		
    		
    		public void evolucionar(String nombreDeLaEvolucion){
    			this.personajeActual.cambiarModo(nombreDeLaEvolucion);
    	     }
	
		    public  int ataque  (){ 
				
				return (this.personajeActual.ataque());
			}
		    
			  public  int distanciaAtaque  (){ 
					
					return (this.personajeActual.distanciaAtaque());
				 }
			     
			     public int velocidad(){
			    	 return (this.personajeActual.velocidad());
			     }
				
	
	
}
