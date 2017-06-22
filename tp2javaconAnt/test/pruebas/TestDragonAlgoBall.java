package pruebas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import dragonalgoball.DragonAlgoBall;
import dragonalgoball.guerrerosz.Goku;
import dragonalgoball.guerrerosz.Gohan;
import dragonalgoball.guerrerosz.Piccolo;
import dragonalgoball.enemigos.Cell;
import dragonalgoball.enemigos.Freezer;
import dragonalgoball.enemigos.MajinBoo;
import dragonalgoball.Equipo;
import dragonalgoball.excepciones.ExcepcionMovimientoInvalido;
import dragonalgoball.excepciones.ExcepcionCeldaOcupada;
import dragonalgoball.excepciones.ExcepcionAtacarPersonajeAliado;
import java.lang.Double.*;


public class TestDragonAlgoBall {
	
	@Test
	public void test01UbicarPersonajeEnTablero(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Goku());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 4);
		
		assertEquals("Goku", dragonAlgoBall.obtenerPersonajeEnCelda(0, 4));
		dragonAlgoBall.moverPersonajeA("Goku", 1, 5);
		assertEquals("Goku", dragonAlgoBall.obtenerPersonajeEnCelda(1, 5));
	}
	
	@Test (expected = ExcepcionCeldaOcupada.class)
	public void test02UbicarPersonajesEnLaMismaCelda(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Goku());
		equipo.agregarPersonaje(new Gohan());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 4);
		dragonAlgoBall.colocarPersonaje("Gohan", 0, 4);
	}
	
	@Test (expected = ExcepcionMovimientoInvalido.class)
	public void test03MoverPersonajeAPosicionNoValida(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Goku());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 0);
		dragonAlgoBall.moverPersonajeA("Goku", 0, 3);
	}
	
	@Test (expected = ExcepcionMovimientoInvalido.class)
	public void test04MovientoConVariosPersonajes(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Goku());
		equipo.agregarPersonaje(new Gohan());
		equipo.agregarPersonaje(new Piccolo());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Piccolo", 0, 0);
		dragonAlgoBall.colocarPersonaje("Goku", 1, 0);
		dragonAlgoBall.colocarPersonaje("Gohan", 1, 1);
		dragonAlgoBall.moverPersonajeA("Piccolo", 2, 0);
	}
	
	@Test(expected = ExcepcionAtacarPersonajeAliado.class)
	public void test06AtacarAUnAliado(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Goku());
		equipo.agregarPersonaje(new Gohan());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 2);
		dragonAlgoBall.colocarPersonaje("Gohan", 0, 0);
		dragonAlgoBall.atacarCon("Goku", 0, 0);
	}
	
	@Test
	public void test07AtacarAUnEnemigo(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo1 = dragonAlgoBall.crearEquipo();
		equipo1.agregarPersonaje(new Goku());
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo1);
		dragonAlgoBall.asignarEquipoAJugadorEnEspera(equipo2);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 2);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.atacarCon("Goku", 2, 3);
		dragonAlgoBall.cambiarTurno();
		assertEquals(0, Double.compare(480.0, dragonAlgoBall.obtenerVidaDePersonaje("Cell")));
	}
	
	@Test
	public void test08AtacarAUnEnemigoConAtaqueEspecialGoku(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo1 = dragonAlgoBall.crearEquipo();
		equipo1.agregarPersonaje(new Goku());
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo1);
		dragonAlgoBall.asignarEquipoAJugadorEnEspera(equipo2);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 2);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarTurno();//lo hago para aumentar el ki.
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.atacarConAtaqueEspecial("Goku", 2, 3);
		dragonAlgoBall.cambiarTurno();
		assertEquals(0, Double.compare(470.0, dragonAlgoBall.obtenerVidaDePersonaje("Cell")));
		
	}
	
	@Test
	public void test09AtacarAUnEnemigoConAtaqueEspecialCell(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo1 = dragonAlgoBall.crearEquipo();
		equipo1.agregarPersonaje(new Goku());
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo1);
		dragonAlgoBall.asignarEquipoAJugadorEnEspera(equipo2);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 2);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.atacarConAtaqueEspecial("Cell", 0, 2);
		assertEquals(0, Double.compare(520.0, dragonAlgoBall.obtenerVidaDePersonaje("Cell")));
		dragonAlgoBall.cambiarTurno();
		assertEquals(0, Double.compare(480.0, dragonAlgoBall.obtenerVidaDePersonaje("Goku")));
	}
}
