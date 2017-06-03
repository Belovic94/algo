package Algo.Modelo.modo;

import Algo.Modelo.Modo;

public class Normal implements Modo {
	 protected int poderDePelea;
	protected int distancia;
	protected int velocidad;
	
	 public Normal(){
		  
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
