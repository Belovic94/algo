package dragonalgoball;

import java.util.HashMap;
import java.util.Set;
import dragonalgoball.modo.KaioKen;
import dragonalgoball.modo.SuperSayajin;
import dragonalgoball.modo.SuperSayajinFase1;
import dragonalgoball.modo.SuperSayajinFase2;
import dragonalgoball.modo.Fortalecido;
import dragonalgoball.modo.Protector;
import dragonalgoball.modo.SemiPerfecto;
import dragonalgoball.modo.Perfecto;
import dragonalgoball.modo.SegundaForma;
import dragonalgoball.modo.Definitivo;
import dragonalgoball.modo.BooMalo;
import dragonalgoball.modo.BooOriginal;
import dragonalgoball.tablero.Celda;
import dragonalgoball.tablero.Tablero;
import dragonalgoball.excepciones.ExcepcionMovimientoInvalido;
import dragonalgoball.excepciones.ExcepcionKiInsuficiente;


public abstract class Personaje {
	
	protected Celda posicion;
	protected String nombre;
	protected double puntosDeVida;
	protected double puntosDeVidaInicial;
	protected int ki;
	protected Modo modoActual;
	protected HashMap<String,Modo> listaModos;
	protected AtaqueEspecial ataqueEspecial;
	protected String estado;
	
	public Personaje(){
		
		estado = "Vivo";
		listaModos = new HashMap<String, Modo>();
	} 
	
	 
	public void moverA(Tablero tablero, Celda unaPosicion){
		
		if (!this.movimientoPosible(tablero.obtenerDistancia(this.obtenerPosicion(), unaPosicion), this.obtenerVelocidad())){
			throw new ExcepcionMovimientoInvalido();
		}
		unaPosicion.insertarPersonaje(this);
		posicion.eliminarPersonaje();
		this.establecerPosicion(unaPosicion);
	}
	
	public void atacar(Tablero tablero, Personaje unEnemigo){
		
		if(!this.movimientoPosible(tablero.obtenerDistancia(posicion, unEnemigo.obtenerPosicion()), this.obtenerDistanciaDeAtaque())){
			throw new ExcepcionMovimientoInvalido();
		}
		this.atacarAPersonaje(unEnemigo);
	}
	
	private boolean movimientoPosible(int distancia, int movPersonaje){
		return movPersonaje >= distancia;
	}
	
	public void atacarConAtaqueEspecial(Tablero tablero, Personaje unEnemigo){
		
		if(!this.movimientoPosible(tablero.obtenerDistancia(posicion, unEnemigo.obtenerPosicion()), this.obtenerDistanciaDeAtaque())){
			throw new ExcepcionMovimientoInvalido();
		}
		this.atacarAPersonajeConAtaqueEspecial(unEnemigo);
	}
	
	protected void atacarAPersonajeConAtaqueEspecial(Personaje unEnemigo){
		
		int kiNecesario = this.ataqueEspecial.obtenerKiNecesario();
		if (kiNecesario > this.ki){
			throw new ExcepcionKiInsuficiente();
		}
		this.ki -= kiNecesario;
		this.ataqueEspecial.impactarEn(this, unEnemigo, this.obtenerDanio(unEnemigo));
	}
	
	private void atacarAPersonaje(Personaje unEnemigo){
		unEnemigo.disminuirVida(this.obtenerDanio(unEnemigo));
	}
		
	public double obtenerDanio(Personaje unEnemigo){
		
		double danio = this.obtenerPoderdePelea();
		if (unEnemigo.obtenerPoderdePelea() > danio){
			danio = danio * 0.8;
		}
		return danio;
	}
	
	public void disminuirVida(double danio){
		puntosDeVida -= danio;
	}
	
	public void aumentarVida(double aumento){
		puntosDeVida += aumento;
	}

	public int obtenerPoderdePelea(){ 
		
		return this.modoActual.obtenerPoderDePelea();
	}
    
    public  int obtenerDistanciaDeAtaque (){ 
		return modoActual.obtenerDistanciaDeAtaque();
	}
    
    public  int obtenerVelocidad(){ 
    	return this.modoActual.obtenerVelocidad();
    }
   
    public double obtenerPuntosDeVida(){
	   return puntosDeVida;
	}
   
    public int obtenerKi(){
	   return ki;
    }
    
    public String obtenerNombre(){
    	return nombre;
    }
    
    public Celda obtenerPosicion(){
    	return posicion;
    }
    
    public void establecerPosicion(Celda unaPosicion){
    	posicion = unaPosicion;
    }
    
    public void aumentarKi(int aumento){
    	ki += aumento;
    }
    
    public void disminuirKi(int descuento){
    	ki -= descuento;
    }
    
    public void cambiarEstado(String unEstado){
    	this.estado = unEstado;
    }
    
    public String obtenerModoActual(){
    	return modoActual.obtenerNombre();
    	/*Set<String> claves = listaModos.keySet();
    	for (String clave:claves){
    		if (listaModos.get(clave) == modoActual)
    			return clave;	
    	}
    	return null;*/
    }
    
	/*public void agregar_modo(String nombre,Modo nuevomodo){
		listaModos.put(nombre,nuevomodo);
	}*/
	private Modo obtenerModo(String modo){
		return listaModos.get(modo);
	}
	
    public  void cambiarModo(String modo){ 
		
		Modo nuevomodo = this.obtenerModo(modo);
		if (nuevomodo.obtenerCosto() > this.ki){
			throw new ExcepcionKiInsuficiente();
		}	
		this.ki -= nuevomodo.obtenerCosto();
		this.modoActual = nuevomodo;
	}
    
}
