package dragonalgoball;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import dragonalgoball.enemigos.Cell;
import dragonalgoball.enemigos.Freezer;
import dragonalgoball.enemigos.MajinBoo;
import dragonalgoball.guerrerosz.Goku;
import dragonalgoball.guerrerosz.Gohan;
import dragonalgoball.guerrerosz.Picoro;
import dragonalgoball.tablero.Tablero;

public class DragonAlgoBall {
	
	private HashMap<String, Jugador> jugadores;
	private Tablero tablero;
	
	public DragonAlgoBall(String nombreJugador1, String nombreJugador2){
		
		tablero = new Tablero(8, 8);
		jugadores = new HashMap<String, Jugador>();
		this.crearJugador(nombreJugador1);
		this.crearJugador(nombreJugador2);
		Equipo guerrerosZ = new Equipo(this.crearListaPersonajes(new Goku(), new Gohan(), new Picoro()));
		Equipo enemigosDeLaTierra = new Equipo(this.crearListaPersonajes(new Cell(), new Freezer(), new MajinBoo())); 
		jugadores.get(nombreJugador1).asignarEquipo(guerrerosZ);
		jugadores.get(nombreJugador2).asignarEquipo(enemigosDeLaTierra);
		tablero.colocarPersonajes(guerrerosZ.obtenerPersonajes(), enemigosDeLaTierra.obtenerPersonajes());
		this.empezarJuego(nombreJugador1, nombreJugador2);
	}
	
	private List<Personaje> crearListaPersonajes(Personaje personaje1, Personaje personaje2, Personaje personaje3){
		List<Personaje> personajes = new ArrayList<Personaje>();
		personajes.add(personaje1);
		personajes.add(personaje2);
		personajes.add(personaje3);
		return personajes;
	}
	
	private void crearJugador(String unNombre){
		jugadores.put(unNombre, new Jugador(unNombre));
	}
	
	private Jugador elegirJugadorInicial(String nombreJugador1, String nombreJugador2){
		return jugadores.get(nombreJugador1);
	}
	
	public void empezarJuego(String nombreJugador1, String nombreJugador2){
		Turno turno = new Turno(this.elegirJugadorInicial(nombreJugador1, nombreJugador2));
		while (!this.hayGanador()){
			//Falta implementar
		}
	}
	
	
	
}
