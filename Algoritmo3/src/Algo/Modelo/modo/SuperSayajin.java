package Algo.Modelo.modo;

import Algo.Modelo.Modo;

public class SuperSayajin implements Modo{
	int poderDePelea;
	int distancia;
	int velocidad;
	
	public SuperSayajin(){
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
