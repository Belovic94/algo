package dragonalgoball;

 
public  abstract class Modo {
	
	protected int poderDePelea;
	protected int distanciaDeAtaque;
	protected int velocidad;
	
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
	
}