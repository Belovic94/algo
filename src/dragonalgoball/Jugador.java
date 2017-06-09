package dragonalgoball;


import dragonalgoball.tablero.Celda;
import dragonalgoball.tablero.Tablero;


public class Jugador {
	
	private String nombre;
	private Equipo equipo;    
    		
    public Jugador(String unNombre){
    	nombre = unNombre;		
    }
    		
    		
    public Personaje elegirPersonaje(String unPersonaje){
    	return  equipo.obtenerPersonaje(unPersonaje);
    }
    		
    		
    public void evolucionarPersonaje(String nombreDeLaEvolucion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).cambiarModo(nombreDeLaEvolucion);
    }
    
    public void moverA(Tablero tablero, Celda unaPosicion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).moverA(tablero, unaPosicion);
    	
    }
    
    public void atacarA(Tablero tablero, Celda unaPosicion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).atacarA(tablero, unaPosicion);
    }
    
    public void atacarAConAtaqueEspecial(Tablero tablero, Celda unaPosicion, String unPersonaje){
    	this.elegirPersonaje(unPersonaje).atacarAConAtaqueEspecial(tablero, unaPosicion);
    }
    
    public void asignarEquipo(Equipo unEquipo){
    	equipo = unEquipo;
    }
    
    public String obtenerNombre(){
    	return nombre;
    }
    
}
