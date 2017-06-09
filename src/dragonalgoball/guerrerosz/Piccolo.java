package dragonalgoball.guerrerosz;

import dragonalgoball.Personaje;
import dragonalgoball.modo.NormalPiccolo;

public class Piccolo extends Personaje{
	
	public Piccolo(){
		super.nombre = "Piccolo";
		super.ki = 0;
		super.puntosDeVida = 500;
		super.modoActual = new NormalPiccolo();
	}
    
 
}
