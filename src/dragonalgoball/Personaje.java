package dragonalgoball;

import java.util.HashMap;
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
import dragonalgoball.excepciones.ExcepcionCeldaOcupada;
import dragonalgoball.excepciones.ExcepcionMovimientoInvalido;
import dragonalgoball.excepciones.ExcepcionCeldaVacia;


public abstract class Personaje {
	
	protected Celda posicion;
	protected String nombre;
	protected double puntosDeVida;
	protected int ki;
	protected Modo modoActual;
	protected HashMap<String,Modo> listaModos;
	
	public Personaje(){
		listaModos = new HashMap<String, Modo>();
		this.CargarModos(); 
	} 
	 
	 public void CargarModos(){
		 listaModos.put("KaioKen", new KaioKen());
		 listaModos.put("SuperSayajin", new SuperSayajin());
		 listaModos.put("SuperSayajinFase1", new SuperSayajinFase1());
		 listaModos.put("SuperSayajinFase2", new SuperSayajinFase2());
		 listaModos.put("Fortalecido", new Fortalecido());
		 listaModos.put("Protector", new Protector());
		
		 listaModos.put("SemiPerfecto", new SemiPerfecto());
		 listaModos.put("Perfecto", new Perfecto());
		 listaModos.put("SegundForma", new SegundaForma());
		 listaModos.put("Definitivo", new Definitivo());
		 listaModos.put("BooMalo", new BooMalo());
		 listaModos.put("BooOriginal", new BooOriginal());
	}
	 
	public void moverA(Tablero tablero, Celda unaPosicion){
		
		if (!unaPosicion.esta_vacia()){
    		throw new ExcepcionCeldaOcupada();
    	}
		
		if (tablero.obtenerDistancia(posicion, unaPosicion) > this.obtenerVelocidad()){
			throw new ExcepcionMovimientoInvalido();
		}
		posicion.eliminarPersonaje();
		unaPosicion.insertarPersonaje(this);
		this.establecerPosicion(unaPosicion);
	}
	
	public void atacarA(Tablero tablero, Celda unaPosicion){
		if (unaPosicion.esta_vacia()){
			throw new ExcepcionCeldaVacia("La celda esta vacia");
		}
		if (tablero.obtenerDistancia(posicion, unaPosicion) > this.obtenerDistanciaDeAtaque()){
			throw new ExcepcionMovimientoInvalido();
		}
		unaPosicion.obtener_personaje().disminuirVida(this.obtenerPoderdePelea());
	}
	  
	public void disminuirVida(double dano){
		if (dano < this.obtenerPoderdePelea()){
			dano = dano * 0.2;
		}
		puntosDeVida -= dano;
	}
	
	public  void cambiarModo(String modo){ 
		
		this.modoActual = listaModos.get(modo);
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
    	ki += descuento;
    }
    
    public Modo obtenerModoActual(){
    	return modoActual;
    }
    
    public abstract void atacarAConAtaqueEspecial(Tablero tablero, Celda unaPosicion);
    	
}
