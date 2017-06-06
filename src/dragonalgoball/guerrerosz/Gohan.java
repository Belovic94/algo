package dragonalgoball.guerrerosz;

import dragonalgoball.Personaje;
import dragonalgoball.modo.NormalGohan;

public class Gohan extends Personaje{
	
	
	public Gohan(){
		super.nombre = "Gohan";
		super.ki = 0;
		super.puntosDeVida = 300;
		super.modoActual= new NormalGohan();
	}

}
