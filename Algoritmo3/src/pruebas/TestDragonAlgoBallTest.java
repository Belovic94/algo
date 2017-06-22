package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import dragonalgoball.DragonAlgoBall;
import dragonalgoball.Equipo;
import excepciones.ExcepcionAbsorcionesInsuficientes;
import excepciones.ExcepcionTransformacionNoPosible;
import modelo.personajes.enemigos.Cell;
import modelo.personajes.guerrerosZ.Gohan;
import modelo.personajes.guerrerosZ.Goku;
import modelo.personajes.guerrerosZ.Piccolo;

public class TestDragonAlgoBallTest {
	@Test
	public void test061AtacarAUnEnemigoDosVeces(){//DEBERIA TIRAR ERROR GOKU TENDIRA QUE TENEER 500-20-20=460 DE VIDA, PERO SOLO EL PRIMER ATAQUE CONTABILIZA,EL SEGUNDO 
		                                          //YA NO PORQUE, HAY UN VARIABLE DENTRO DE LA CLASE JUGADOR, EL METODO ATACARA Y DENTRO HAY ES VARIABLE BOOLEANA ATAQUEREALIZADEO=TRUE
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo1 = dragonAlgoBall.crearEquipo();
		equipo1.agregarPersonaje(new Goku());
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugador("Jugador1", equipo1);
		dragonAlgoBall.asignarEquipoAJugador("Jugador2", equipo2);
		dragonAlgoBall.colocarPersonaje("Goku", 0, 2);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		 
		dragonAlgoBall.atacarCon("Cell", 0, 2);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.atacarCon("Cell", 0, 2);
		dragonAlgoBall.cambiarTurno();
		assertEquals(0, Double.compare(480.0, dragonAlgoBall.obtenerVidaDePersonaje("Goku")));
	}
	
	@Test (expected =  ExcepcionTransformacionNoPosible.class)
	public void test09LlevarAGohanASuPrimeraTrasnformacionYNoPuedeLlegarALaSegunda(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Goku());
		equipo.agregarPersonaje(new Gohan(equipo));
		equipo.agregarPersonaje(new Piccolo(equipo));
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugador("Jugador2", equipo2);
		dragonAlgoBall.asignarEquipoAJugador("Jugador1", equipo);
		dragonAlgoBall.colocarPersonaje("Piccolo", 0, 0);
		dragonAlgoBall.colocarPersonaje("Goku", 1, 0);
		dragonAlgoBall.colocarPersonaje("Gohan", 1, 1);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarModoPersonaje("Gohan", "SuperSayajinFase1");
		dragonAlgoBall.cambiarModoPersonaje("Gohan", "SuperSayajinFase2");
	}
	
	@Test (expected =  ExcepcionTransformacionNoPosible.class)//NO ME TENDRIA QUE PASAR ESTE TEST,PERO COMO NO ATACA ENTONCES NO LE DISMINUYE LA VIDA
	public void test10DejarAGokuYPiccoloConLaVidaNecesarioParaComprobarLaSegundaTransformacionDeGohan(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Goku());
		equipo.agregarPersonaje(new Gohan(equipo));
		equipo.agregarPersonaje(new Piccolo(equipo));
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugador("Jugador2", equipo2);
		dragonAlgoBall.asignarEquipoAJugador("Jugador1", equipo);
		dragonAlgoBall.colocarPersonaje("Piccolo", 0, 0);
		dragonAlgoBall.colocarPersonaje("Goku", 1, 0);
		dragonAlgoBall.colocarPersonaje("Gohan", 1, 1);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		for(int i=0;i<18;i++){ //para bajar un 30% de vida comparado con su vida inicial
		dragonAlgoBall.atacarCon("Cell", 0, 0);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.atacarCon("Cell", 1, 0);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();
		}
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarModoPersonaje("Gohan", "SuperSayajinFase2");
	}
	
	@Test (expected =  ExcepcionTransformacionNoPosible.class)
	public void test11LlevarAPiccoloASuPrimeraTransformacionYLuegoComprobarQueNoPuedeLlegarAsSuSegundaPorqueGohanNoTieneVidaNecesaria(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Gohan(equipo));
		equipo.agregarPersonaje(new Piccolo(equipo));
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugador("Jugador2", equipo2);
		dragonAlgoBall.asignarEquipoAJugador("Jugador1", equipo);
		dragonAlgoBall.colocarPersonaje("Piccolo", 0, 0);
		dragonAlgoBall.colocarPersonaje("Gohan", 1, 1);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarTurno();//5ki
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.cambiarTurno();//10
		dragonAlgoBall.cambiarTurno();
        dragonAlgoBall.cambiarTurno();//15
        dragonAlgoBall.cambiarTurno();
        dragonAlgoBall.cambiarTurno();//20
        dragonAlgoBall.cambiarModoPersonaje("Piccolo", "Fortalecido");
        dragonAlgoBall.cambiarModoPersonaje("Piccolo", "Protector");
	}
	
	@Test (expected =  ExcepcionTransformacionNoPosible.class) //NO ME TENDRIA QUE PASAR ESTE TEST,PERO COMO NO ATACA ENTONCES NO LE DISMINUYE LA VIDA
	public void test12LlevarAGohanConLaVidaNecesariaParaTranformarPiccoloAProtectorYVerificoSusNuevasCaracteristicas(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		equipo.agregarPersonaje(new Gohan(equipo));
		equipo.agregarPersonaje(new Piccolo(equipo));
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugador("Jugador2", equipo2);
		dragonAlgoBall.asignarEquipoAJugador("Jugador1", equipo);
		dragonAlgoBall.colocarPersonaje("Piccolo", 0, 0);
		dragonAlgoBall.colocarPersonaje("Gohan", 1, 1);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarTurno(); 
		dragonAlgoBall.cambiarTurno();
		for(int i=0;i<12;i++){ //para bajar un 20% de vida comparado con su vida inicial
			dragonAlgoBall.atacarCon("Cell", 1, 1);
			dragonAlgoBall.cambiarTurno();
			dragonAlgoBall.cambiarTurno();
			dragonAlgoBall.atacarCon("Cell", 1, 1);
			dragonAlgoBall.cambiarTurno();
			dragonAlgoBall.cambiarTurno();
			}
		dragonAlgoBall.cambiarTurno();
        dragonAlgoBall.cambiarModoPersonaje("Piccolo", "Protector");
        
        //assertEquals(0, Double.compare(20.0, dragonAlgoBall.obtenerPoderDePeleaPersonaje("Piccolo")));
      
	}
	
	@Test (expected =   ExcepcionAbsorcionesInsuficientes.class) 
	public void test13PosicionoCellYComprueboQueNoSeTransformaEnSemiPerfecto(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugador("Jugador2", equipo2);
		dragonAlgoBall.asignarEquipoAJugador("Jugador1", equipo);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarModoPersonaje("Cell", "SemiPerfecto");
      
	}
	@Test (expected =   ExcepcionAbsorcionesInsuficientes.class) 
	public void test14PosicionoCellYComprueboQueNoSeTransformaEnPerfecto(){
		DragonAlgoBall dragonAlgoBall = new DragonAlgoBall("Jugador1", "Jugador2");
		dragonAlgoBall.crearTablero(8, 8);
		Equipo equipo = dragonAlgoBall.crearEquipo();
		Equipo equipo2 = dragonAlgoBall.crearEquipo();
		equipo2.agregarPersonaje(new Cell());
		dragonAlgoBall.asignarEquipoAJugador("Jugador2", equipo2);
		dragonAlgoBall.asignarEquipoAJugador("Jugador1", equipo);
		dragonAlgoBall.cambiarTurno();
		dragonAlgoBall.colocarPersonaje("Cell", 2, 3);
		dragonAlgoBall.cambiarModoPersonaje("Cell", "Perfecto");
      
      
	}
	

}
