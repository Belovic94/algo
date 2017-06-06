package dragonalgoball.tablero;

import java.util.ArrayList;
import java.util.List;
import dragonalgoball.Personaje;

public class Tablero {
	private List<Fila> tabla;
	
	public Tablero(int alto, int ancho){
		tabla = new ArrayList<Fila>();
		for (int i = 0; i < alto; i = i + 1){
			Fila fila = new Fila(ancho);
			tabla.add(fila);
		}
		this.asignarAdyacentes();
	}
	
	private void asignarAdyacentes(){
		for (int i = 0; i < tabla.size(); i = i + 1){
			this.obtenerFila(i).asignarAdyacentes(this.obtenerFila(i - 1), this.obtenerFila(i + 1));
		}
	}
	
	public Fila obtenerFila(int indice){
		if (indice < 0 || indice >= tabla.size()){
			return null;
		}
		return tabla.get(indice);
	}
	
	public int obtenerDistancia(Celda posInicial, Celda posFinal){
		Bfs busqueda = new Bfs();
		return busqueda.obtenerDistancia(posInicial, posFinal);
	}
	
	public void colocarPersonajes(List<Personaje> guerrerosZ, List<Personaje> enemigosDeLaTierra){
		Celda celda;
		Personaje personaje;
		Fila fila = this.obtenerFila(0);
		for (int i = 0; i < guerrerosZ.size(); i++ ){
			celda = fila.obtenerCelda(i);
			personaje = guerrerosZ.get(i);
			celda.insertarPersonaje(personaje);
			personaje.establecerPosicion(celda);
		}
		
		fila = this.obtenerFila(tabla.size() - 1);
		for (int i = 0; i < fila.cantidadCeldas(); i++ ){
			celda = fila.obtenerCelda(fila.cantidadCeldas() - 1 - i);
			personaje = enemigosDeLaTierra.get(i);
			celda.insertarPersonaje(personaje);
			personaje.establecerPosicion(celda);
		}
	}
}


