package dragonalgoball;

 
public  abstract class Modo {
	
	protected int poderDePelea;
	protected int distanciaDeAtaque;
	protected int velocidad;
	protected String nombre;
	protected int costo;
	
	public Modo(){
		 
	}
	
	public int obtenerPoderDePelea(){
		return this.poderDePelea;
	}
	public int obtenerDistanciaDeAtaque(){
		return this.distanciaDeAtaque;
	}
    public int obtenerVelocidad(){
    	return this.velocidad;
    }
    
    public int obtenerCosto(){
    	return this.costo;
    }
    
    public String obtenerNombre(){
    	return this.nombre;
    }
    
    public boolean chequearCondiciones(Personaje personaje){
    	return true;
    }
	
}