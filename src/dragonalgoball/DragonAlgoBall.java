package dragonalgoball;

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
	
	public void crearTablero(int filas, int columnas){
		tablero = new Tablero(filas, columnas);
	}
	
	public Equipo crearEquipo(){
		return new Equipo();
	}
	
	public void asignarEquipoAJugadorActual(Equipo unEquipo){
		turno.obtenerJugadorActual().asignarEquipo(unEquipo);
	}
	
	public void asignarEquipoAJugadorEnEspera(Equipo unEquipo){
		turno.obtenerJugadorEnEspera().asignarEquipo(unEquipo);
	}
	
	public double obtenerVidaDePersonaje(String unPersonaje){
		return turno.obtenerJugadorActual().elegirPersonaje(unPersonaje).obtenerPuntosDeVida();
	}
	
	public void cambiarTurno(){
		turno.cambiarJugador();
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
	
	public void atacarConAtaqueEspecial(String unPersonaje, int fila, int columna){
		turno.obtenerJugadorActual().atacarAConAtaqueEspecial(tablero, tablero.obtenerCelda(fila, columna), unPersonaje);
	}
		
}
