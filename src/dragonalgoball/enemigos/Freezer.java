package dragonalgoball.enemigos;

import dragonalgoball.Personaje;
import dragonalgoball.modo.NormalFreezer;

public class Freezer extends Personaje{
	public Freezer(){
		super.nombre = "Freezer";
		super.ki = 0;
		super.puntosDeVida = 400;
		super.modoActual = new NormalFreezer();
	}
 
	
}
