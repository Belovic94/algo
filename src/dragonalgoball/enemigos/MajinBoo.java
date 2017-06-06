package dragonalgoball.enemigos;

import dragonalgoball.Personaje;
import dragonalgoball.modo.NormalMajinBoo;

public class MajinBoo extends Personaje{
	public MajinBoo(){
		super.nombre = "MajinBoo";
		super.ki = 0;
		super.puntosDeVida = 400;
		super.modoActual = new NormalMajinBoo();
	}
}
