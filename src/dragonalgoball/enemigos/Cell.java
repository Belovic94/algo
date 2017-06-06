package dragonalgoball.enemigos;

import dragonalgoball.Personaje;
import dragonalgoball.modo.NormalCell;

public class Cell extends Personaje{
	public Cell(){
		super.nombre = "Cell";
		super.ki = 0;
		super.puntosDeVida = 500;
		super.modoActual = new NormalCell();
	}
}
