package dragonalgoball.tablero;

import dragonalgoball.excepciones.ExcepcionCeldaVacia;
import dragonalgoball.Personaje;
import java.util.ArrayList;
import java.util.List;

public class Celda {
	private Personaje personaje;
	private List<Celda> adyacentes;
	
	public Celda(){
		adyacentes = new ArrayList<Celda>();
		personaje = null;
	}

	public void insertarPersonaje(Personaje unPersonaje){
		personaje = unPersonaje;	
	}
	
	public void eliminarPersonaje(){
		personaje = null;
	}
	
	public Personaje obtener_personaje(){
		if (this.esta_vacia())
			throw new ExcepcionCeldaVacia("La celda está vacia");
		return personaje;
	}
	
	public boolean esta_vacia(){
		return personaje == null;
	}
	
	public void agregarAdyacente(Celda unaCelda){
		if (unaCelda != null){
			adyacentes.add(unaCelda);
		}
	}
	
	public List<Celda> obtenerAdyacentes(){
		return adyacentes;
	}
	
	public int cantidadAdyacentes(){
		return adyacentes.size();
	}
		
}

