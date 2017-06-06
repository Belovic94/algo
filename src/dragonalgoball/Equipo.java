package dragonalgoball;

import java.util.HashMap;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;



public class Equipo{

	private HashMap<String,Personaje> integrantes;
	
	public Equipo(List<Personaje> listaPersonajes){
		 integrantes = new HashMap<String,Personaje>();
		 for (int i = 0; i < listaPersonajes.size(); i++){
			 integrantes.put(listaPersonajes.get(i).obtenerNombre(), listaPersonajes.get(i));
			 
		 }
	}
	
	public Personaje obtenerPersonaje(String unNombre){
		return integrantes.get(unNombre);
	}
	
	public List<Personaje> obtenerPersonajes(){
		List<Personaje> personajes = new ArrayList<Personaje>();
		Iterator<String> iter = integrantes.keySet().iterator();
		while (iter.hasNext()){
			personajes.add(integrantes.get(iter.next()));
		}
		return personajes;
	}
	
}
