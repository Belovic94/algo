package dragonalgoball;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import dragonalgoball.tablero.Tablero;
import dragonalgoball.tablero.Celda;

public class DragonAlgoBall {
	
	private HashMap<String, Jugador> jugadores;
	private Tablero tablero;
	private Turno turno;
	
	public DragonAlgoBall(String nombreJugador1, String nombreJugador2){
		jugadores = new HashMap<String, Jugador>();
		jugadores.put(nombreJugador1, new Jugador(nombreJugador1));
		jugadores.put(nombreJugador2, new Jugador(nombreJugador2));
		turno = new Turno(jugadores.values().iterator());
	}
	
	private List<Personaje> crearListaPersonajes(Personaje personaje1, Personaje personaje2, Personaje personaje3){
		List<Personaje> personajes = new ArrayList<Personaje>();
		personajes.add(personaje1);
		personajes.add(personaje2);
		personajes.add(personaje3);
		return personajes;
	}
	
	
	public void crearTablero(int filas, int columnas){
		tablero = new Tablero(filas, columnas);
	}
	
	public Equipo crearEquipo(Personaje personaje1, Personaje personaje2, Personaje personaje3){
		return new Equipo(this.crearListaPersonajes(personaje1, personaje2, personaje3));
	}
	
	public void asignarEquipoAJugadorActual(Equipo unEquipo){
		turno.obtenerJugadorActual().asignarEquipo(unEquipo);
	}
	
	public void colocarPersonaje(String unPersonaje, int fila, int columna){
		tablero.colocarPersonaje(turno.obtenerJugadorActual().elegirPersonaje(unPersonaje), fila, columna);
	}
	
	public String obtenerPersonajeEnCelda(int fila, int columna){
		Celda celda = tablero.obtenerCelda(fila, columna);
		return celda.obtener_personaje().obtenerNombre();
	}
	public Celda obtenerPosicion(String unPersonaje){
		return turno.obtenerJugadorActual().elegirPersonaje(unPersonaje).obtenerPosicion();
	}
	
	public Celda obtenerCelda(int fila, int columna){
		return tablero.obtenerCelda(fila, columna);
	}
	
	public void moverPersonajeA(String unPersonaje, int fila, int columna){
		turno.obtenerJugadorActual().moverA(tablero, tablero.obtenerCelda(fila, columna), unPersonaje);
	}
	
	public void atacarCon(String unPersonaje, int fila, int columna){
		turno.obtenerJugadorActual().atacarA(tablero, tablero.obtenerCelda(fila, columna), unPersonaje);
	}
	
	public void cambiarModoPersonaje(String unPersonaje, String unModo){
		turno.obtenerJugadorActual().elegirPersonaje(unPersonaje).cambiarModo(unModo);
	}
	
	public int obtenerPoderDePeleaPersonaje(String unPersonaje){
		return turno.obtenerJugadorActual().elegirPersonaje(unPersonaje).obtenerPoderdePelea();
	}
		
}
