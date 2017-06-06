package dragonalgoball.guerrerosz;

import dragonalgoball.Personaje;
 
import dragonalgoball.modo.NormalGoku;

public class Goku extends Personaje{

	
	
	public  Goku(){
		super.nombre = "Goku";
		super.ki = 0;
		super.puntosDeVida = 500;
		super.modoActual = new NormalGoku();
	}
	
	
	 
 
	 
}
