package pruebas;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import dragonalgoball.DragonAlgoBall;
import dragonalgoball.guerrerosz.Goku;
import dragonalgoball.guerrerosz.Gohan;
import dragonalgoball.guerrerosz.Piccolo;
import dragonalgoball.Equipo;
import dragonalgoball.excepciones.ExcepcionMovimientoInvalido;
import dragonalgoball.excepciones.ExcepcionCeldaOcupada;

public class TestDragonAlgoBall {
	
	@Test
	public void test01UbicarPersonajeEnTablero(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Victor", "Cesar");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo(new Goku(), new Gohan(), new Piccolo());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 4);
		
		assertEquals("Goku", dragonAlgoBall.obtenerPersonajeEnCelda(0, 4));
		dragonAlgoBall.moverPersonajeA("Goku", 1, 5);
		assertEquals("Goku", dragonAlgoBall.obtenerPersonajeEnCelda(1, 5));
		

	}
	
	@Test (expected = ExcepcionCeldaOcupada.class)
	public void test02UbicarPersonajesEnLaMismaCelda(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Victor", "Cesar");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo(new Goku(), new Gohan(), new Piccolo());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 4);
		dragonAlgoBall.colocarPersonaje("Gohan", 0, 4);
	}
	
	@Test (expected = ExcepcionMovimientoInvalido.class)
	public void test03MoverPersonajeAPosicionNoValida(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Victor", "Cesar");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo(new Goku(), new Gohan(), new Piccolo());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 0);
		dragonAlgoBall.moverPersonajeA("Goku", 0, 3);
	}
	
	@Test (expected = ExcepcionMovimientoInvalido.class)
	public void test04MovientoConVariosPersonajes(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Victor", "Cesar");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo(new Goku(), new Gohan(), new Piccolo());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Piccolo", 0, 0);
		dragonAlgoBall.colocarPersonaje("Goku", 1, 0);
		dragonAlgoBall.colocarPersonaje("Gohan", 1, 1);
		dragonAlgoBall.moverPersonajeA("Piccolo", 2, 0);
	}
	
	@Test
	public void test05CambiarModoPersonaje(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Victor", "Cesar");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo(new Goku(), new Gohan(), new Piccolo());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 0);
		dragonAlgoBall.cambiarModoPersonaje("Goku", "KaioKen");
		assertEquals(40 , dragonAlgoBall.obtenerPoderDePeleaPersonaje("Goku"));
	}
	

	@Test
	public void test06AtacarAOtroJugador(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Victor", "Cesar");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo(new Goku(), new Gohan(), new Piccolo());
		dragonAlgoBall.asignarEquipoAJugadorActual(equipo);
		dragonAlgoBall.colocarPersonaje("Piccolo", 0, 0);
		dragonAlgoBall.cambiarModoPersonaje("Goku", "KaioKen");
		assertEquals(40 , dragonAlgoBall.obtenerPoderDePeleaPersonaje("Goku"));
	}
	
	
}
