package dragonalgoball;

import java.util.Iterator;

public class Turno {
	
	private Jugador jugadorActual;
	private Jugador jugadorEnEspera;
	
	public Turno(Iterator<Jugador> jugadores){
		jugadorActual = jugadores.next();
		jugadorEnEspera = jugadores.next();
	}
	
	public Jugador obtenerJugadorActual(){
		return jugadorActual;
	}
	
	public void cambiarJugador(){
		Jugador auxiliar = this.jugadorActual;
		this.jugadorActual = this.jugadorEnEspera;
		this.jugadorEnEspera = auxiliar;
	}
}
