package dragonalgoball;

import java.util.HashMap;
import java.util.Map;
import dragonalgoball.excepciones.ExcepcionPersonajeExistente;
import dragonalgoball.excepciones.ExcepcionPersonajeInexistente;



public class Equipo{

	private Map<String,Personaje> integrantes;
	
	public Equipo(){
		 integrantes = new HashMap<String,Personaje>();
	}
	
	public void agregarPersonaje(Personaje unPersonaje){
		if (this.existePersonaje(unPersonaje.obtenerNombre())){
			throw new ExcepcionPersonajeExistente();
		}
		integrantes.put(unPersonaje.obtenerNombre(), unPersonaje);
	}
	
	public Personaje obtenerPersonaje(String unNombre){
		if (!this.existePersonaje(unNombre)){
			throw new ExcepcionPersonajeInexistente();
		}
		return integrantes.get(unNombre);
	}
	
	public boolean existePersonaje(String unPersonaje){
		return integrantes.containsKey(unPersonaje);
	}
	
	public void aumentarKiAIntegrantes(int aumento){
		for (Personaje unPersonaje : integrantes.values()){
			unPersonaje.aumentarKi(aumento);
		}
	}
	
}
