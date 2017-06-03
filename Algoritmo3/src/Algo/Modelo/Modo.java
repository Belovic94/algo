package Algo.Modelo;

 
public  abstract class Modo {
	
	protected int poderDePelea;
	protected int distancia;
	protected int velocidad;
	
	public Modo(){
		 
	}
	
	public int ataque(){
		return this.poderDePelea;
	}
	public int distanciaAtaque(){
		return this.distancia;
	}
    public int velocidad(){
    	return this.velocidad;
    }
	
}