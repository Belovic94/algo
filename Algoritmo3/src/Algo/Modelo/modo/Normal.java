package Algo.Modelo.modo;

import Algo.Modelo.Modo;

public class Normal implements Modo {
	int poderDePelea;
	int distancia;
	int velocidad;
	
	 public Normal(){
		 this.poderDePelea=20;
		 this.distancia=4;
		 this.velocidad=5;
	 }
	 
	 		    public String atacar() {
	 		    	return "atacoNormal "+this.poderDePelea;
	 		    }
}
