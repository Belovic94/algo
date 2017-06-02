package Algo.Modelo;

import java.util.HashMap;
import Algo.Modelo.enemigos.Freezer;
import Algo.Modelo.guerrerosz.Goku;
import Algo.Modelo.guerrerosz.Picoro;

public class Jugador {
    private Personaje personajeActual;
     private HashMap<String,Personaje> diccionarioPersonajes=new HashMap<String,Personaje>();
      
	
	public Jugador(){
		 
		 this.cargarPersonajes();
	}
	
	public void cargarPersonajes(){
		this.diccionarioPersonajes.put("Goku",new Goku());
		this.diccionarioPersonajes.put("Picoro",new Picoro());
		this.diccionarioPersonajes.put("Freezer",new Freezer() );
	}
	public void elegirPersonaje(String unPersonaje){
		
		
		this.personajeActual= this.diccionarioPersonajes.get(unPersonaje);
	}
	public void evolucionar(String nombreDeLaEvolucion){
		this.personajeActual.cambiarModo(nombreDeLaEvolucion);
	}
	
public  String atacar  (){ 
		
		return (this.personajeActual.atacar());
	}
	
	
	
}
