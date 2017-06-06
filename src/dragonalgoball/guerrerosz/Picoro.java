package dragonalgoball.guerrerosz;

import dragonalgoball.Personaje;
import dragonalgoball.modo.NormalPicoro;

public class Picoro extends Personaje{
	
	public Picoro(){
		super.nombre = "Picoro";
		super.ki = 0;
		super.puntosDeVida = 500;
		super.modoActual = new NormalPicoro();
	}
    
 
}
