package dragonalgoball;


import dragonalgoball.tablero.Celda;
import dragonalgoball.tablero.Tablero;


public class Jugador {
	
	private String nombre;
	private Personaje personajeActual;
	private Equipo equipo;    
    		
    public Jugador(String unNombre){
    	nombre = unNombre;		
    }
    		
    /*public void elegirEquipo(List<Personaje> listaPersonajes){
    	unEquipo = new Equipo(listaPersonajes);
    }*/
    		
    public void elegirPersonaje(String unPersonaje){
    	personajeActual = equipo.obtenerPersonaje(unPersonaje);
    }
    		
    		
    public void evolucionarPersonaje(String nombreDeLaEvolucion){
    	personajeActual.cambiarModo(nombreDeLaEvolucion);
    }
    
    public void moverA(Tablero tablero, Celda unaPosicion){
    	personajeActual.moverA(tablero, unaPosicion);
    	
    }
    
    public void atacarA(Tablero tablero, Celda unaPosicion){
    	personajeActual.atacarA(tablero, unaPosicion);
    }
    
    public void asignarEquipo(Equipo unEquipo){
    	equipo = unEquipo;
    }
    
    public String obtenerNombre(){
    	return nombre;
    }
	
	
	
}
