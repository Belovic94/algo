package Algo.Modelo.modo;

import Algo.Modelo.Modo;

public class KaioKen implements Modo{
	private int poderDePelea;
	private int distancia;
	private int velocidad;
	
	public KaioKen(){
		 this.poderDePelea=60;
		 this.distancia=4;
		 this.velocidad=5;
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
