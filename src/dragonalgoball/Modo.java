package dragonalgoball;

 
public  abstract class Modo {
	
	protected double poderDePelea;
	protected int distanciaDeAtaque;
	protected int velocidad;
	
	public Modo(){
		 
	}
	
	public double obtenerPoderDePelea(){
		return this.poderDePelea;
	}
	public int obtenerDistanciaDeAtaque(){
		return this.distanciaDeAtaque;
	}
    public int obtenerVelocidad(){
    	return this.velocidad;
    }
	
}