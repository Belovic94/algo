package dragonalgoball;


import dragonalgoball.tablero.Celda;
import dragonalgoball.tablero.Tablero;
import dragonalgoball.excepciones.ExcepcionAtacarPersonajeAliado;

public class Jugador {
	
	private String nombre;
	private Equipo equipo;    
    		
    public Jugador(String unNombre){
    	nombre = unNombre;		
    }
    		
    		
    public Personaje elegirPersonaje(String unPersonaje){
    	return  equipo.obtenerPersonaje(unPersonaje);
    }
    
    public Equipo obtenerEquipo(){
    	return equipo;
    }
    
    public boolean personajePerteneceAlEquipo(String unPersonaje){
    	return equipo.existePersonaje(unPersonaje);
    }
    		
    		
    public void evolucionarPersonaje(String nombreDeLaEvolucion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).cambiarModo(nombreDeLaEvolucion);
    }
    
    public void moverA(Tablero tablero, Celda unaPosicion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).moverA(tablero, unaPosicion);    	
    }
    
    public void atacarA(Tablero tablero, Celda unaPosicion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).atacar(tablero, this.obtenerPersonajeEnemigo(unaPosicion));
    }
    
    public void atacarAConAtaqueEspecial(Tablero tablero, Celda unaPosicion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).atacarConAtaqueEspecial(tablero, this.obtenerPersonajeEnemigo(unaPosicion));
    }
    
    private Personaje obtenerPersonajeEnemigo(Celda unaPosicion){
     	Personaje personaje = unaPosicion.obtener_personaje();
    	if (this.personajePerteneceAlEquipo(personaje.obtenerNombre())){
    		throw new ExcepcionAtacarPersonajeAliado();
    	}
    	return personaje;
    }
    
    public void asignarEquipo(Equipo unEquipo){
    	equipo = unEquipo;
    }
    
    public String obtenerNombre(){
    	return nombre;
    }
    
}
